package org.expl.annotation;

/**
 * Created by chenjunjie on 16/3/13.
 */
public @interface NotFinishedTest {
    String reason() default "";
}
