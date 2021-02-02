package ABasic.A2Random;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random random = new Random();
        double d1 = random.nextDouble(); // 生成[0,1.0]区间的小数
        double d2 = random.nextDouble() * 7; // 生成[0,7.0]区间的小数

        int i1 = random.nextInt(10); // 生成[0,10]区间的整数
        int i2 = random.nextInt(18) - 3; // 生成[-3,15)区间的整数

        long l1 = random.nextLong(); // 生成一个随机长整型值
        boolean b1 = random.nextBoolean(); // 生成一个随机布尔型值
        float f1 = random.nextFloat(); // 生成一个随机浮点型值，小数点后7位
        double dd1=random.nextDouble(); //生成一个随机浮点型值，小数点后16位

        System.out.println("生成的[0,1.0]区间的小数是：" + d1);
        System.out.println("生成的[0,7.0]区间的小数是：" + d2);

        System.out.println("生成的[0,10]区间的整数是：" + i1);
        System.out.println("生成的[-3,15]区间的整数是：" + i2);

        System.out.println("生成一个随机长整型值：" + l1);
        System.out.println("生成一个随机布尔型值：" + b1);
        System.out.println("生成一个随机浮点型值：" + f1);
        System.out.println("生成一个随机浮点型指：" + dd1);
    }
}
