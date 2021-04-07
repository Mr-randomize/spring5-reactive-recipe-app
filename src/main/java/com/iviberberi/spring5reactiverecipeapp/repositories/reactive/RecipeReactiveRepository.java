package com.iviberberi.spring5reactiverecipeapp.repositories.reactive;

import com.iviberberi.spring5reactiverecipeapp.domain.Recipe;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;


public interface RecipeReactiveRepository extends ReactiveMongoRepository<Recipe, String>{
}
