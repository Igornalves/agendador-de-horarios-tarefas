package com.javanauta.agendador_de_horarios_tarefas.configs;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SweggerConfig {

    @Bean
    public OpenAPI configSwagger() {

        Contact contatosApi = new Contact();
        contatosApi.setName("Igor Nascimento");
        contatosApi.setEmail("igornalves08@gmail");

        Info informacoesApi = new Info()
                .title("Agendador de Horários e Tarefas")
                .description("Projeto desenvolvido para praticar os conceitos básicos de Spring Boot e Java.")
                .contact(contatosApi)
                .version("1.0");

        return new OpenAPI().info(informacoesApi);
    }
}
