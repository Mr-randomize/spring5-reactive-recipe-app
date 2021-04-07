package com.iviberberi.spring5reactiverecipeapp.repositories;

import com.iviberberi.spring5reactiverecipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;


public interface RecipeRepository extends CrudRepository<Recipe, String> {
}
