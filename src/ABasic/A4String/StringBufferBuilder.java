package ABasic.A4String;

public class StringBufferBuilder {
    public static void main(String[] args) {
        stringMethod();
    }

    public static void stringMethod(){
        // 通过“”初始化并赋值string变量
        String string="string";
        System.out.println("调用changeString()方法之前的string的值: "+string);
        changeString(string);
        System.out.println("调用changeString()方法之后的string的值: "+string);
        // 通过new初始化并赋值String变量
        String stringWithNew=new String("string");
        System.out.println("调用changeString()方法之前的stringWithNew的值: "+stringWithNew);
        changeString(stringWithNew);
        System.out.println("调用changeString()方法之后的stringWithNew的值: "+stringWithNew);
        // StringBuffer
        StringBuffer stringBuffer=new StringBuffer("stringBuffer");
        System.out.println("调用changeStringBuffer()方法之前的stringBuffer的值: "+stringBuffer);
        changeStringBuffer(stringBuffer);
        System.out.println("调用changeStringBuffer()方法之后的stringBuffer的值: "+stringBuffer);
        // StringBuilder
        StringBuilder stringBuilder=new StringBuilder("stringBuilder");
        System.out.println("调用changeStringBuilder()方法之前的stringBuilder的值: "+stringBuilder);
        changeStringBuilder(stringBuilder);
        System.out.println("调用changeStringBuilder()方法之后的stringBuilder的值: "+stringBuilder);
    }

    public static void changeString(String stringParam){
        stringParam="stringParam";
    }

    public static void changeStringBuffer(StringBuffer stringBufferParam){
        stringBufferParam=new StringBuffer("stringBufferParam");
    }

    public static void changeStringBuilder(StringBuilder stringBuilderParam){
        stringBuilderParam=new StringBuilder("stringBuilderParam");
    }

}
