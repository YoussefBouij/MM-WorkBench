package gov.nist.healthcare.mm.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

import gov.nist.healthcare.hl7.mm.v2.script.execution.MessageModifierService;

@SpringBootApplication
@ComponentScan(basePackages = { "gov.nist.healthcare" })
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public MessageModifierService mm() {
		return new MessageModifierService();
	}
	
	@Bean
	public Jackson2ObjectMapperBuilder jacksonBuilder() {
		Jackson2ObjectMapperBuilder b = new Jackson2ObjectMapperBuilder();
		return b;
	}
}
