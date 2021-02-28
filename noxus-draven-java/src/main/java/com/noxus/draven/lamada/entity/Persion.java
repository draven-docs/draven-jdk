package noxus.draven.lamada.entity;

/**
 * 〈功能概述〉<br>
 *
 * @className: Persion
 * @package: noxus.draven.lamada.entity
 * @author: draven
 * @date: 2020/7/1 09:57
 */
public class Persion {

    private String name;
    private String age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }


    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Persion{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
