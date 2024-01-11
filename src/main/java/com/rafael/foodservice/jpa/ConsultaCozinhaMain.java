package com.rafael.foodservice.jpa;

import com.rafael.foodservice.FoodServiceApplication;
import com.rafael.foodservice.domain.model.Cozinha;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import java.util.List;

public class ConsultaCozinhaMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new SpringApplicationBuilder(FoodServiceApplication.class)
                .web(WebApplicationType.NONE) //Definindo que não é uma aplicação web
                .run(args);

        CadastroCozinha cadastroCozinha = applicationContext.getBean(CadastroCozinha.class);
        List<Cozinha> cozinhaList =  cadastroCozinha.listar();

        for (Cozinha cozinha : cozinhaList) {
            System.out.println(cozinha.getNome());
        }
    }
}
