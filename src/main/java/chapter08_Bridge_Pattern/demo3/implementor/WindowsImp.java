package chapter08_Bridge_Pattern.demo3.implementor;

import chapter08_Bridge_Pattern.demo3.Matrix;

/**
 * @ClassName WindowsImp
 * @Description
 * @Author rjchen
 * @Date 2020-05-16 11:59
 * @Version 1.0
 */
//Windows操作系统实现类：具体实现类
public class WindowsImp implements ImageImp {
    public void doPaint(Matrix m) {
        //调用Windows系统的绘制函数绘制像素矩阵
        System.out.print("在Windows操作系统中显示图像：");
    }
}
