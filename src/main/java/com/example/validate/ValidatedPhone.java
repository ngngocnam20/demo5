package com.example.validate;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = PhoneConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
public @interface ValidatedPhone {
    public String message() default "Sai dinh dang . So dien thoai phai 10 chu so, bat dau la so 0";
    public Class<?>[] groups() default {};
    public Class<? extends Payload>[] payload() default {};
}
