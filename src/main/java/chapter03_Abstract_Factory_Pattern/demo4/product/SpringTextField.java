package chapter03_Abstract_Factory_Pattern.demo4.product;

/**
 * @ClassName SpringTextField
 * @Description
 * @Author rjchen
 * @Date 2020-05-13 14:02
 * @Version 1.0
 */
public class SpringTextField implements TextField {
    @Override
    public void display() {
        System.out.println("显示绿色边框文本框。");
    }
}
