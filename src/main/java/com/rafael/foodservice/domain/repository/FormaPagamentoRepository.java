package com.rafael.foodservice.domain.repository;

import com.rafael.foodservice.domain.model.Cozinha;
import com.rafael.foodservice.domain.model.FormaPagamento;

import java.util.List;

public interface FormaPagamentoRepository {
    public FormaPagamento buscar(Long id);
    public FormaPagamento salvar(FormaPagamento formaPagamento);
    public void remover(FormaPagamento formaPagamento);
    public List<FormaPagamento> listar();
}
