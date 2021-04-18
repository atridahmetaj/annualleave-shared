package com.annual.jeeshared.service;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public abstract class GenericService<E, R extends JpaRepository<E, Long>> {

    protected R repository;

    public List<E> findAll() {
        return repository.findAll();
    }

    public E getById(Long id) {
        Optional<E> entity = repository.findById(id);
        return entity.orElse(null);
    }

    public E save(E entity) {
        repository.save(entity);
        return entity;
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public void delete(E entity) {
        repository.delete(entity);
    }

}
