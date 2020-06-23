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
public class Yili implements Milk {

    public static String Yili = "yili";

    @Override
    public String getName() {

        return Yili;
    }
}
