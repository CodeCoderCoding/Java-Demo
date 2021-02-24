package BOOP.B8Clone;

/**
 * @author supremepole
 */
class ObjClone implements Cloneable{
    private String str="default value";
    public void setStr(String str){
        this.str=str;
    }
    public String toString(){
        return str;
    }
    public Object clone(){
        Object object=null;

        return object;
    }
}
public class TestClone {
    private Obj obj=new Obj();
    private int number=0;
    public Obj getObj(){
        return obj;
    }
    public int getNumber(){
        return number;
    }
    public void changeObj(Obj obj1){
        obj1.setStr("change value");
    }
    public void changeNumber(int number1){
        number1=1;
    }
    public static void main(String[] args){
        TestRef testRef=new TestRef();
        System.out.println("调用changeObj()前："+testRef.getObj());
        testRef.changeObj(testRef.getObj());
        System.out.println("调用changeObj()后："+testRef.getObj());
        System.out.println("调用changeNumber()前："+testRef.getNumber());
        testRef.changeNumber(testRef.getNumber());
        System.out.println("调用changeNumber()后："+testRef.getNumber());
    }
}
