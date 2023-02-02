package ABasic.A9System;

public class SystemDemo {

    static{
        //设置system property方式1：通过System.setProperty()方法
        //方式2为设置VM arguments
        //可以作为全局变量，在任何地方使用
        System.setProperty("DB", "mysql");
    }
    public static void main(String[] args) {
        System.out.println(System.getProperty("os.version"));
        System.out.println(System.getProperty("java.library.path"));
        System.out.println(System.getProperty("isP268"));
    }

}
