package pl.com.mggp.rzeki.dunajec.config;

import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "pl.com.mggp.rzeki.dunajec")
public class FeignConfiguration {

}
