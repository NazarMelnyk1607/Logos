package com.logos.Lesson_21.HomeWork.Annotations;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.TYPE, ElementType.CONSTRUCTOR, ElementType.METHOD})
@Inherited
@Documented
public @interface Show {
    boolean value() default true;
}
