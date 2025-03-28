package com.example.spring_boot_long_running.capture;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LongRunningExecution {

    boolean request() default false;

    boolean response() default false;

    long maxExecutionTime() default -1L;
}
