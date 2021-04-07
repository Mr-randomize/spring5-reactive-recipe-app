package com.iviberberi.spring5reactiverecipeapp.services;

import com.iviberberi.spring5reactiverecipeapp.commands.UnitOfMeasureCommand;
import reactor.core.publisher.Flux;

public interface UnitOfMeasureService {

    Flux<UnitOfMeasureCommand> listAllUoms();
}
