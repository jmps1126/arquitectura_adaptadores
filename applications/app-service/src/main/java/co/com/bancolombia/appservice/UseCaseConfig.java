package co.com.bancolombia.appservice;

import co.com.bancolombia.usecase.controlacceso.ControlAccesoUseCase;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
public class UseCaseConfig {

    @Bean
    public ControlAccesoUseCase controlAccesoUseCase(){
        return new ControlAccesoUseCase();
    }
}