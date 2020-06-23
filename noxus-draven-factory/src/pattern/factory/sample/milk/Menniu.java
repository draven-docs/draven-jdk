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
public class Menniu implements Milk {

    public static String Menniu = "mengniu";

    @Override
    public String getName() {

        return Menniu;
    }
}
