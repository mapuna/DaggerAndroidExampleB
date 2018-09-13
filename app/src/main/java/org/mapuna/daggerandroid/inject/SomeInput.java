package org.mapuna.daggerandroid.inject;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

@Qualifier @Retention(RetentionPolicy.RUNTIME) public @interface SomeInput { }
