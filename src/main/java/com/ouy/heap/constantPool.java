package com.ouy.heap;

/**
 * 常量池在方法区
 * 面试
 * @author 当当
 * @date 2022/11/25
 */
public class constantPool {
    public static void main(String[] args) {
        String s1="a";
        String s2="b";
        String s3="ab";
        String s4=s1+s2;    //因为是两个引用变量，在使用时不确定，所以采用stringBuilder进行动态拼接
                            //创建一个stringBuilder 将s1和s2中的数据用append拼接，
                           // 再调用stringBuilder的tostring方法  toString 是将
        String S5="a"+"b";  //直接在运行时常量池中找到“ab”  在编译期间就知道是确定的  所以直接用常量池中的数据
        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));

        System.out.println(s3==S5);//true
        System.out.println(s4==S5);//false 同理s3==s4


    }
}
