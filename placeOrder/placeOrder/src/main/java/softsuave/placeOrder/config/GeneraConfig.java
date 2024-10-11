package softsuave.placeOrder.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class GeneraConfig {

    @Bean
    public RestTemplate restTemplateBean(){
        return new RestTemplate();
    }
}

