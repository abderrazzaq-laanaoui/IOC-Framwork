package com.laanaoui.context.annotation;

import com.laanaoui.context.ApplicationContext;

public class AnnotationConfigContext implements ApplicationContext {
    @Override
    public <T> T getBean(String id, Class<T> aClass) {
        return null;
    }

    @Override
    public Object getBean(String id) {
        return null;
    }
}
