package com.ouy.heap;


import com.sun.xml.internal.ws.org.objectweb.asm.ClassWriter;
import com.sun.xml.internal.ws.org.objectweb.asm.Opcodes;

/**
 * 测试方法区内存溢出
 *   jdk1.8后 方法区在本地内存不在虚拟机的堆里
 * @author 当当
 * @date 2022/11/25
 */
public class MyClassLoader extends ClassLoader{

    public static void main(String[] args) {
        int j=0;
        MyClassLoader loader = new MyClassLoader();
        for (int i = 0; i < 20000; i++) {
            ClassWriter writer = new ClassWriter(0);
                    //版本号  访问修饰符  类名 包名  父类名 接口
            writer.visit(Opcodes.V1_6,Opcodes.ACC_PUBLIC,"class"+i,null,"java/lang/Object",null);
            byte[] bytes = writer.toByteArray();

//            加载class对象
//            类名    二进制字节码  从哪个下标开始  到哪里结束
            loader.defineClass("class"+i,bytes,0, bytes.length);

        }
    }
}
