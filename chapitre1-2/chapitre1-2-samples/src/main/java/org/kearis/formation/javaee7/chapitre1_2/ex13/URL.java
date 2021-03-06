package org.kearis.formation.javaee7.chapitre1_2.ex13;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.ReportAsSingleViolation;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Constraint(validatedBy = {URLValidator.class})
@ReportAsSingleViolation
@Target({METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER})
@Retention(RUNTIME)
public @interface URL {

  String message() default "Malformed URL";

  Class<?>[] groups() default {};

  Class<? extends Payload>[] payload() default {};

  String protocol() default "";

  String host() default "";

  int port() default -1;
}
