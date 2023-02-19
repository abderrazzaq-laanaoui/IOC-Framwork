package com.laanaoui.context;

public interface ApplicationContext {
      <T> T getBean(String id, Class<T> aClass );
      Object getBean(String id);
}
