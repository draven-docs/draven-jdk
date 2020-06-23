package pattern.factory.sample.milk;

import pattern.factory.interfaces.Milk;

/**
 * 〈功能概述〉<br>
 *
 * @className: Menniu
 * @package: pattern.factory.sample.milk
 * @author: draven
 * @date: 2020/6/23 12:35
 */
public class MilkTest {
    /**
     * 这个就是一般操作方法
     *
     * @param args
     */
    public static void main(String[] args) {
        Milk menniu = new Menniu();
        System.out.println("获取所需要的产品" + menniu.getName());
        Milk yili = new Yili();
        System.out.println("获取所需要的产品" + yili.getName());
    }
}
