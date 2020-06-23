package pattern.factory.sample;

import pattern.factory.interfaces.Milk;
import pattern.factory.sample.milk.Menniu;
import pattern.factory.sample.milk.Yili;

/**
 * 〈功能概述〉<br>
 *
 * @className: SampleFactory
 * @package: pattern.factory.sample
 * @author: draven
 * @date: 2020/6/23 12:45
 */
public class SampleFactory {
    public static String Menniu = "menniu";
    public static String Yili = "yili";

    public Milk getMilk(String name) {

        if (Yili.equals(name)) {
            return new Yili();
        }
        if (Menniu.equals(name)) {
            return new Menniu();
        }
        return null;
    }

}
