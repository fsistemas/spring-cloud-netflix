package co.com.fsistemas.springcloud.eurekafeignclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class SpringCloudEurekaFeignClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEurekaFeignClientApplication.class, args);
	}

}
