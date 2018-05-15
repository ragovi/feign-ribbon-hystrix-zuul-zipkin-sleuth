package samples.microservices.account;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import brave.sampler.Sampler;

@Configuration
@ComponentScan("samples.microservices.account")
public class AccountConfiguration {

	@Bean
	public Sampler defaultSampler() {
		return Sampler.ALWAYS_SAMPLE;
	}
	
}
