package com.viacep.viacepapi.client.config;

import feign.Logger;
import feign.RequestInterceptor;
import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
public class AutoConfiguration {

    /**
     * Caso precise colocar algo no requeste ou header
     * @return
     */
    @Bean
    public RequestInterceptor interceptor(){
        return requestTemplate -> {

            requestTemplate.header("Accept","application/json");

        };
    }

    /**
     * Caso precise colocar alguma autenticação etc.. serve como exemplo
     * @return
     */
    @Bean
    public BasicAuthRequestInterceptor basicAuthRequestInterceptor() {
        return new BasicAuthRequestInterceptor("username", "password");
    }

    /**
     * NONE – sem registro, que é o padrão
     * BASIC – registra apenas o método de solicitação, URL e status de resposta
     * HEADERS – registra as informações básicas junto com os cabeçalhos de solicitação e resposta
     * FULL – registre o corpo, cabeçalhos e metadados para solicitação e resposta
     *
     * @return
     */

    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}
