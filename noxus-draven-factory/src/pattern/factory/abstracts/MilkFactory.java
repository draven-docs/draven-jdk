package pattern.factory.abstracts;

import pattern.factory.interfaces.Milk;
import pattern.factory.sample.milk.Menniu;
import pattern.factory.sample.milk.Yili;

public class MilkFactory extends AbstractFactory {

    @Override
    public Milk getMenniu() {
        //具体怎么实现的我不关心
        return new Menniu();
    }


    @Override
    public Milk getYili() {
        //具体怎么实现的我不关心
        return new Yili();
    }

}
