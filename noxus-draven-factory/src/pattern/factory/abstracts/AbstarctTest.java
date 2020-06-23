package pattern.factory.abstracts;

/**
 * 〈功能概述〉<br>
 *
 * @className: abstarctfactory
 * @package: pattern.factory
 * @author: draven
 * @date: 2020/6/23 12:54
 */
public class AbstarctTest {
    public static void main(String[] args) {
        MilkFactory milkFactory = new MilkFactory();
        System.out.println(milkFactory.getMenniu().getName());
    }
}
