package com.rafael.foodservice.jpa;

import com.rafael.foodservice.FoodServiceApplication;
import com.rafael.foodservice.domain.model.Restaurante;
import com.rafael.foodservice.domain.repository.RestauranteRepository;
import com.rafael.foodservice.infrastructure.repository.RestauranteRepositoryImp;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

public class RestauranteTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new SpringApplicationBuilder(FoodServiceApplication.class)
                .web(WebApplicationType.NONE).run(args);
        RestauranteRepository cadastroRestaurante = applicationContext.getBean(RestauranteRepositoryImp.class);

        Restaurante restaurante = cadastroRestaurante.buscar(2L);

        System.out.println(restaurante);
    }
}
