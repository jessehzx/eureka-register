package top.jessehzx.cloud.serviceregister;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author jessehzx
 * @Date 2018/4/8
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServiceRegisterApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServiceRegisterApplication.class, args);
	}
}
