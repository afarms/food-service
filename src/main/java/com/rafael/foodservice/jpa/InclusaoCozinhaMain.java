package com.rafael.foodservice.jpa;

import com.rafael.foodservice.FoodServiceApplication;
import com.rafael.foodservice.domain.model.Cozinha;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import java.util.List;

public class InclusaoCozinhaMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new SpringApplicationBuilder(FoodServiceApplication.class)
                .web(WebApplicationType.NONE) //Definindo que não é uma aplicação web
                .run(args);

        CadastroCozinha cadastroCozinha = applicationContext.getBean(CadastroCozinha.class);

        Cozinha cozinha1 = new Cozinha();
        cozinha1.setNome("Brasileira");

        Cozinha cozinha2 = new Cozinha();
        cozinha2.setNome("Japoneza");

        Cozinha cozinhaResulte01 = cadastroCozinha.adicionar(cozinha1);
        Cozinha cozinhaResulte02 = cadastroCozinha.adicionar(cozinha2);
        System.out.printf("%d - %s\n",cozinhaResulte01.getId(), cozinhaResulte01.getNome());
        System.out.printf("%d - %s\n",cozinhaResulte02.getId(), cozinhaResulte02.getNome());

    }
}
