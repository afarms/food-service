package com.rafael.foodservice.jpa;

import com.rafael.foodservice.FoodServiceApplication;
import com.rafael.foodservice.domain.model.Cozinha;
import com.rafael.foodservice.domain.repository.CozinhaRepository;
import com.rafael.foodservice.infrastructure.repository.CozinhaRepositoryImp;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

public class InclusaoCozinhaMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new SpringApplicationBuilder(FoodServiceApplication.class)
                .web(WebApplicationType.NONE) //Definindo que não é uma aplicação web
                .run(args);

        CozinhaRepository cadastroCozinha = applicationContext.getBean(CozinhaRepositoryImp.class);

        Cozinha cozinha1 = new Cozinha();
        cozinha1.setNome("Brasileira");

        Cozinha cozinha2 = new Cozinha();
        cozinha2.setNome("Japoneza");

        Cozinha cozinhaResulte01 = cadastroCozinha.salvar(cozinha1);
        Cozinha cozinhaResulte02 = cadastroCozinha.salvar(cozinha2);
        System.out.printf("%d - %s\n",cozinhaResulte01.getId(), cozinhaResulte01.getNome());
        System.out.printf("%d - %s\n",cozinhaResulte02.getId(), cozinhaResulte02.getNome());

    }
}
