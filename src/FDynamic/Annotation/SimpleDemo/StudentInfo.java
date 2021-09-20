package FDynamic.Annotation.SimpleDemo;

import java.lang.annotation.*;

/**
 * @author supremepole
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface StudentInfo {
    //学号
    public int id() default -1;
    //名字
    public String name() default "";
    //地址
    public String address() default "";
}
