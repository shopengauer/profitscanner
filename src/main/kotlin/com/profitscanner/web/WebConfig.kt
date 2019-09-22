package com.profitscanner.web

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.client.RestOperations
import org.springframework.web.client.RestTemplate

@Configuration
class WebConfig {

    @Bean
    fun restClient(): RestOperations = RestTemplate()

}