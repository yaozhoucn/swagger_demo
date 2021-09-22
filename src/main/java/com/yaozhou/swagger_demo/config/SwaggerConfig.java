package com.yaozhou.swagger_demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

/**
 * Created by WXHang on HANG at 2021/9/18 14:59
 * Desc：
 */
@Configuration
@EnableSwagger2  //开启swagger2
public class SwaggerConfig {
    @Bean
    public Docket docket(){
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo());
    }
    public ApiInfo apiInfo(){
        /**
         * 基本信息设置
         */
        Contact contact = new Contact("yaozhou","127.0.0.1","3124723678@qq.com");
        return new ApiInfo(
                "YaoShen Documentation",
                "Api Documentation",
                "1.0",
                "urn:tos",
                contact,
                "Apache 2.0",
                "http://www.apache.org/licenses/LICENSE-2.0",
                new ArrayList<>()

        );
    }
}
