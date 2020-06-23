package pattern.factory.func;

import pattern.factory.interfaces.Milk;
import pattern.factory.sample.milk.Menniu;

/**
 * 〈功能概述〉<br>
 *
 * @className: MenniuFactory
 * @package: pattern.factory.abstracts
 * @author: draven
 * @date: 2020/6/23 13:01
 */
public class MenniuFactory implements Factory {
    @Override
    public Milk getMilk() {
        return new Menniu();
    }
}
