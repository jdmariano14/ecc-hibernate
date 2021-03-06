package com.exist.ecc.person.core.service.output.api;

import java.util.Collection;

public interface CollectionFormatter<T> 
  extends OutputFormatter<Collection<T>> 
{

  public abstract String format(Collection<T> collection);

}