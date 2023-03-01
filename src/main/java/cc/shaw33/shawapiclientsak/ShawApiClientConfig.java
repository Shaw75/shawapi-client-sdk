package cc.shaw33.shawapiclientsak;

import cc.shaw33.shawapiclientsak.client.ShawApiClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("shawapi.client")
@Data
@ComponentScan
public class ShawApiClientConfig {
    private String accessKey;
    private String secretKey;
    @Bean
    public ShawApiClient shawApiClient(){

        return new ShawApiClient(accessKey,secretKey);

    }
}
