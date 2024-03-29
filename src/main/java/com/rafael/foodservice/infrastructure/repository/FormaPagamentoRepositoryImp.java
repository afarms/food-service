package com.rafael.foodservice.infrastructure.repository;

import com.rafael.foodservice.domain.model.Cozinha;
import com.rafael.foodservice.domain.model.FormaPagamento;
import com.rafael.foodservice.domain.repository.FormaPagamentoRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Component
public class FormaPagamentoRepositoryImp implements FormaPagamentoRepository {
    @PersistenceContext
    private EntityManager manager;

    @Override
    public List<FormaPagamento> listar(){
        TypedQuery<FormaPagamento> query = manager.createQuery("from FormaPagamento ", FormaPagamento.class);
        return query.getResultList();
    }

    @Override
    public FormaPagamento buscar(Long id){
        return manager.find(FormaPagamento.class, id);
    }

    @Override
    @Transactional
    public FormaPagamento salvar(FormaPagamento formaPagamento){
        return manager.merge(formaPagamento);
    }

    @Override
    @Transactional
    public void remover(FormaPagamento formaPagamento){
        formaPagamento = buscar(formaPagamento.getId());
        manager.remove(formaPagamento);
    }
}
