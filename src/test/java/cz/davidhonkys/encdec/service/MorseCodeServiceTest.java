package cz.davidhonkys.encdec.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

import cz.davidhonkys.encdec.constant.Algorithm;
import cz.davidhonkys.encdec.constant.Conversion;
import cz.davidhonkys.encdec.constant.MorseCode;
import cz.davidhonkys.encdec.object.Code;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class MorseCodeServiceTest {
	
	private final String SOS = "sos";
	private final String SOS_MORSE = "..."+MorseCode.MORSE_CODE_SEPARATOR+"---"+MorseCode.MORSE_CODE_SEPARATOR+"...";
	
	private final String DAVID = "david";
	private final String DAVID_MORSE = "-.."+MorseCode.MORSE_CODE_SEPARATOR+".-"+MorseCode.MORSE_CODE_SEPARATOR+"...-"+MorseCode.MORSE_CODE_SEPARATOR+".."+MorseCode.MORSE_CODE_SEPARATOR+"-..";
	
	private final String URL = "http://localhost:";

	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;
	
	@Autowired
	private MorseCodeService morseService;
	
    @Test
    public void serviceLoads() throws Exception {
        assertThat(morseService).isNotNull();
    }

    @Test
    public void convertToMorseTest() throws Exception {
    	assertThat(morseService.encrypt(SOS)).containsSequence(SOS_MORSE);
    	assertThat(morseService.encrypt(" "+SOS+" ")).containsSequence(SOS_MORSE);
    }

    @Test
    public void convertFromMorseTest() throws Exception {
    	assertThat(morseService.decrypt(SOS_MORSE)).containsSequence(SOS);
    	assertThat(morseService.decrypt(SOS_MORSE+",")).containsSequence("sonull");
    }
    
	@Test
	public void encryptTextToMorseCodeTest() throws Exception {
		
		Code codeSOS = new Code(Algorithm.MorseCode.toString(), SOS , Conversion.Encrypt.toString());		
		assertThat(this.restTemplate.postForObject(URL + port + "/encrypt", codeSOS ,String.class))
		.containsSequence(SOS_MORSE);
		
		Code codeDAVID = new Code(Algorithm.MorseCode.toString(), DAVID , Conversion.Encrypt.toString());
		assertThat(this.restTemplate.postForObject(URL + port + "/encrypt", codeDAVID ,String.class))
		.containsSequence(DAVID_MORSE);
		
	}
	
	@Test
	public void decryptTextFromMorseCodeTest() throws Exception {
		
		Code codeSOS = new Code(Algorithm.MorseCode.toString(), SOS_MORSE , Conversion.Decrypt.toString());		
		assertThat(this.restTemplate.postForObject(URL + port + "/decrypt", codeSOS ,String.class))
		.containsSequence(SOS);
		
		Code codeDAVID = new Code(Algorithm.MorseCode.toString(), DAVID_MORSE , Conversion.Decrypt.toString());
		assertThat(this.restTemplate.postForObject(URL + port + "/decrypt", codeDAVID ,String.class))
		.containsSequence(DAVID);
		
	}
	
} 
