package ABasic.A8BigDecimal;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class BigDecimalDemo {

    public static void main(String[] args) {
        BigDecimal hundred=new BigDecimal(100);
        BigDecimal bigDecimal=new BigDecimal(0.0123456789);
        BigDecimal result=bigDecimal.multiply(hundred);
        // 小数点后的位数
        System.out.println(result.setScale(10, RoundingMode.HALF_UP));
        // 数字总的位数
        MathContext mathContext=new MathContext(12, RoundingMode.HALF_UP);
        BigDecimal result2=bigDecimal.multiply(hundred, mathContext);
        System.out.println(result2);
        // 大数除法
        BigDecimal resultDiv=bigDecimal.divide(BigDecimal.ZERO);
        System.out.println(resultDiv);
    }

}
