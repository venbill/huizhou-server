package com.superstar.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description swagger文档配置
 * @Author BillYu
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {

    private static Logger logger = LoggerFactory.getLogger(Swagger2Config.class);

    @Bean
    public Docket createRestApi() {
        ParameterBuilder authPar = new ParameterBuilder();
        List<Parameter> pars = new ArrayList<Parameter>();
        authPar.name("Authorization").description("认证信息").defaultValue("").modelRef(new ModelRef("string")).parameterType("header").required(false).build();
        pars.add(authPar.build());

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                //扫描controller所在包
                .apis(RequestHandlerSelectors.basePackage("com.superstar.controller"))
                .paths(PathSelectors.any())
                .build()
                .globalOperationParameters(pars);
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("REST API")
                .description("love coding,not only coding")
                .termsOfServiceUrl("http://localhost:8080/")
                .version("1.0")
                .build();
    }


}
