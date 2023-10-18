package ie.atu.y3_lab5_cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableFeignClients
public class Y3Lab5CicdApplication {

    public static void main(String[] args) {
        SpringApplication.run(Y3Lab5CicdApplication.class, args);
    }
    @Bean
    public RestTemplate restTemplate() {return new RestTemplate();}
}
