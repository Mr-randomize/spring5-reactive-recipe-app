package com.iviberberi.spring5reactiverecipeapp.repositories;

import com.iviberberi.spring5reactiverecipeapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;


public interface CategoryRepository extends CrudRepository<Category, String> {

    Optional<Category> findByDescription(String description);
}
