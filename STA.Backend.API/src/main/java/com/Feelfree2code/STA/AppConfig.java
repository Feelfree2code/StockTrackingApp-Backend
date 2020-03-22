package com.Feelfree2code.STA;

import com.Feelfree2code.STA.subStructure.baseRepository;
import com.Feelfree2code.STA.subStructure.baseService;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * AppConfig
 */
@Configuration
@EnableJpaRepositories(basePackages = "com.Feelfree2Code.STA", repositoryBaseClass = baseRepository.class)
public class AppConfig {

    @Bean(name="repository")
    public baseService<> getBaseService() {
        
    }
    
}