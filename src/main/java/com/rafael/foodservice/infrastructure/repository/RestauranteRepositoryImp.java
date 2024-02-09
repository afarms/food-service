package com.rafael.foodservice.infrastructure.repository;

import com.rafael.foodservice.domain.model.Cozinha;
import com.rafael.foodservice.domain.model.Restaurante;
import com.rafael.foodservice.domain.repository.RestauranteRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class RestauranteRepositoryImp implements RestauranteRepository {
    @PersistenceContext
    private EntityManager manager;
    @Override
    public Restaurante buscar(Long id) {
        return manager.find(Restaurante.class, id);
    }

    @Override
    public Restaurante salvar(Restaurante restaurante) {
        return manager.merge(restaurante);
    }

    @Override
    public void remover(Restaurante restaurante) {
        restaurante = buscar(restaurante.getId());
        manager.remove(restaurante);
    }

    @Override
    public List<Restaurante> listar() {
        TypedQuery<Restaurante> query = manager.createQuery("from Restaurante",Restaurante.class);
        return query.getResultList();
    }
}
