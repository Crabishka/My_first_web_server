package ru.vsu.csf.pryadchenko.server.dockerLogic.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.PARAMETER)
public @interface Param {
    Class<?> type() default String.class;
    String value() default "";
    String name() default "";
    boolean requestBody() default false;


}
