package com.kk.interview;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.FIELD)
@interface MyAnnotation{
	
	String userName() default "kaushal kumar";
}

