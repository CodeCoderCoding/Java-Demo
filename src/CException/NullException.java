package CException;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName NullException
 * @Description
 * @Author yuzhihua
 * @Date 2022/4/20 9:17
 * @Version 1.0.0
 **/
public class NullException {
    public static void main(String[] args) {
        List<Long> idList=new ArrayList<>();
        idList=null;
        for(Long id:idList){
            System.out.println(id);
        }
    }
}
