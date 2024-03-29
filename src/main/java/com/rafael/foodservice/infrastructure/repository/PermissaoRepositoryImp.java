package com.rafael.foodservice.infrastructure.repository;

import com.rafael.foodservice.domain.model.Permissao;
import com.rafael.foodservice.domain.repository.PermissaoRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Component
public class PermissaoRepositoryImp implements PermissaoRepository {

    @PersistenceContext
    private EntityManager manager;

    @Override
    public Permissao buscar(Long id) {
        return manager.find(Permissao.class, id);
    }

    @Override
    @Transactional
    public Permissao salvar(Permissao permissao) {
        return manager.merge(permissao);
    }

    @Override
    @Transactional
    public void remover(Permissao permissao) {
        permissao = buscar(permissao.getId());
        manager.remove(permissao);
    }

    @Override
    public List<Permissao> listar() {
        TypedQuery<Permissao> query = manager.createQuery("from Permissao ", Permissao.class);
        return query.getResultList();
    }
}
