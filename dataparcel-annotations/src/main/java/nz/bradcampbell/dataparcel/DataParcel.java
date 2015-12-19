package nz.bradcampbell.dataparcel;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.CLASS;

@Retention(CLASS)
@Target(TYPE)
public @interface DataParcel {
}