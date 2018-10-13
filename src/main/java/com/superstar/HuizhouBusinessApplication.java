package com.superstar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Author BillYu
 * @Description 徽州区电子商务公共服务中心
 * @Date 2018-08-20
 */
@EnableSwagger2
@Configuration
@EnableTransactionManagement(proxyTargetClass = true)//开启事务
@SpringBootApplication
@EnableGlobalMethodSecurity(jsr250Enabled = true)
public class HuizhouBusinessApplication {

	public static void main(String[] args) {
		SpringApplication.run(HuizhouBusinessApplication.class, args);
	}
}
