package com.rafael.foodservice.domain.repository;

import com.rafael.foodservice.domain.model.Cozinha;

import java.util.List;

public interface CozinhaRepository {
    public Cozinha buscar(Long id);
    public Cozinha salvar(Cozinha cozinha);
    public void remover(Cozinha cozinha);
    public List<Cozinha> listar();
}
