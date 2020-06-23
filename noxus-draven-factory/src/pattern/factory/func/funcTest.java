package pattern.factory.func;

/**
 * 〈功能概述〉<br>
 *
 * @className: funcTest
 * @package: pattern.factory.func
 * @author: draven
 * @date: 2020/6/23 13:10
 */
public class funcTest {

    public static void main(String[] args) {
        Factory menniuFactory = new MenniuFactory();
        System.out.println(menniuFactory.getMilk().getName());
    }
}
