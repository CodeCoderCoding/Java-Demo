package DGenericContainer.Map_HashMap;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapWithArrayList {

    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> hashMap=new HashMap<>();
        ArrayList<String> arrayList=new ArrayList<>();
        ArrayList<String> arrayList1=new ArrayList<>();
        arrayList.add("String1-111");
        hashMap.put("string1", arrayList);
        if(!hashMap.containsKey("string1")){
            arrayList.add("String1-111");
            hashMap.put("string1", arrayList);
        }else{
            arrayList1=hashMap.get("string1");
            arrayList1.add("String1-112");
            hashMap.put("string1", arrayList1);
        }
        System.out.println(hashMap.get("string1"));
    }

}
