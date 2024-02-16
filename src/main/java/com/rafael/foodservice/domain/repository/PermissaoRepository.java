package com.rafael.foodservice.domain.repository;

import com.rafael.foodservice.domain.model.Permissao;

import java.util.List;

public interface PermissaoRepository {

    public Permissao buscar(Long id);
    public Permissao salvar(Permissao permissao);
    public void remover(Permissao permissao);
    public List<Permissao> listar();
}
