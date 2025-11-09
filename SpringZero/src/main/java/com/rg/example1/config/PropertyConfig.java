package com.rg.example1.config;

import com.rg.example1.Beans.vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PropertyConfig {

    @Bean
    vehicle getvehicle(){
        var vh = new vehicle();
        return vh;
    }
}
