package com.exist.ecc.person.core.service.input.api;

import java.util.function.Supplier;

public interface InputExceptionHandler {

  public abstract <T> T handle(Supplier<T> readOp);

}