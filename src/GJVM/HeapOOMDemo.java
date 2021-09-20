package GJVM;

import java.util.ArrayList;
import java.util.List;

/**
 * VM args: -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 * @author zzm 来自周志明老师的《深入理解Java虚拟机》一书
 */
public class HeapOOMDemo {
    static class OOMObject{

    }
    public static void main(String[] args) {
        List<OOMObject> list=new ArrayList<OOMObject>();
        while(true){
            list.add(new OOMObject());
        }
    }
}
