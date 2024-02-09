package com.rafael.foodservice.domain.repository;

import com.rafael.foodservice.domain.model.Cozinha;
import com.rafael.foodservice.domain.model.Restaurante;

import java.util.List;

public interface RestauranteRepository {
    public Restaurante buscar(Long id);
    public Restaurante salvar(Restaurante restaurante);
    public void remover(Restaurante restaurante);
    public List<Restaurante> listar();
}
