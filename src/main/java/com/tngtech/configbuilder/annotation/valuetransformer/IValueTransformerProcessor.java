package com.tngtech.configbuilder.annotation.valuetransformer;


import java.lang.annotation.Annotation;

public interface IValueTransformerProcessor<T> {
    public T transformString(Annotation annotation, String argument);
}