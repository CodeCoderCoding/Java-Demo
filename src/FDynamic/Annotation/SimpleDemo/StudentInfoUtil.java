package FDynamic.Annotation.SimpleDemo;

import java.lang.reflect.Field;

/**
 * @author supremepole
 */
public class StudentInfoUtil {
    public static void getStudentInfo(Class<?> clazz){
        StringBuilder sb=new StringBuilder();
        sb.append("学生信息：");
        Field[] fields = clazz.getDeclaredFields();//通过反射获取处理注解
        for(Field field:fields){
            if(field.isAnnotationPresent(StudentInfo.class)){
                StudentInfo fruitProvider =(StudentInfo)
                        field.getAnnotation(StudentInfo.class);//处理注解信息
                sb.append("学号∶").append(fruitProvider.id());
                sb.append(", 名字∶").append(fruitProvider.name());
                sb.append(", 地址∶").append(fruitProvider.address());
                System.out.println(sb);
            }
        }
    }
}
