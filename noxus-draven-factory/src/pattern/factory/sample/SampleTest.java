package pattern.factory.sample;

/**
 * 〈功能概述〉<br>
 *
 * @className: SampleTest
 * @package: pattern.factory.sample
 * @author: draven
 * @date: 2020/6/23 12:48
 */
public class SampleTest {
    /**
     * 对于用户而言 具体的创建操作就不需要用户考虑
     * 细节被隐藏
     *
     * @param args
     */
    public static void main(String[] args) {
        SampleFactory sampleFactory = new SampleFactory();
        System.out.println(sampleFactory.getMilk("menniu").getName());
        System.out.println(sampleFactory.getMilk("yili").getName());

    }
}
