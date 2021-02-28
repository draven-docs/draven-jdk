package com.noxus.draven.lamada;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Stream;

/**
 * 〈功能概述〉<br>
 *
 * @className: lamda
 * @package: noxus.draven
 * @author: draven
 * @date: 2020/7/1 09:32
 */
public class LamdaDemo {

    /**
     * 参数列表为空 不需要任何条件就可执行
     * 没有返回值
     * 方法大括号
     *
     *
     * ()->sout
     *
     *
     * 一些参数
     * 一个箭头
     * 一些代码
     * (Object...args)->{block}
     * 函数式编程
     *
     *
     *
     * 参数类型类可以省略
     * 如果参数有切仅有一个那么()可以省略
     * 大括号内语句只有一个 那么大括号可以省略
     *
     * 前提 必须保证一个接口 而且其中的抽象方法有且只有一个
     * 必须有上下文环境
     *
     *
     * 函数式接口 有且仅有一个抽象方法
     * java.lang.FunctionalInterface
     *
     *
     * 字节码文件在运行时生成
     *
     *
     *
     *
     *
     * 常量 抽象方法
     * 默认方法 接口升级
     *
     * 静态方法
     * 私有方法
     *
     *
     *   常量修饰符   public static final
     *   抽象方法的修饰符  public abstract
     *   默认方法的修饰符 public default
     *          实现类可以直接调用，接口升级 抽取公共逻辑到默认方法中
     *
     *
     *
     */

    /**
     * 函数式接口
     * 可推导就是可省略
     * method(s->sout(s))
     * 1.方法引用 目的就为了简化lanada表达式的写法
     * method(System.out::println)
     * 方法引用符
     * a. 格式 对象名称::方法名称 /对象名称引用成员方法 （只有方法名，没有参数小括号小括号）
     * 若果对象中又一个成员方法，正好就是lambda 表达式所需要的唯一使用的内容，那么这时候就可以使用方法引用
     * b. 格式  对象名称::静态方法名称    / 类名称引用 静态方法
     * 若果对象中又一个静态成员方法，正好就是lambda 表达式所需要的唯一使用的内容，那么这时候就可以使用方法引用
     * c. 格式 super::父类方法  支持super() / 继承
     * 如果lambda表达式要做的事情正好就是父类当中方法的内容 那么可以通过super关键字来引用弗雷当中的方法
     * d.格式 this::本类方法 / 通过this引用本类方法
     * 如果lambda表达式要做的事情正好就是本类当中方法的内容 那么可以通过this关键字来引用本类当中的方法
     * e. 格式 类名称::new  / 构造器引用
     * 如果lambda表达式要做的事情正好就是构造方法的内容
     * f. 格式 元素类型[] :: new / 数组的构造器引用
     *
     *
     *
     * lambda延迟加载
     *
     * 作为方法参数
     * 作为方法的返回值
     *
     *
     * 常用函数式接口
     * java.util.function
     * 1.Supplier 向外提供一个方法
     * supplier.get();
     * 使用外部 局部变量   局部变量必须是final
     * <p>
     * 2.Consumer
     * 默认方法 andThen 两个函数步骤之间的拼接 / 函数模型拼接
     * <p>
     * 3.Predicate
     * test 对指定类型的对象进操作 返回一个boolean
     * <p>
     * 默认方法
     * 函数模型拼接
     * a.and
     * b.or
     * c.negate
     * <p>
     * <p>
     * 集合类型筛选
     * <p>
     * <p>
     * <p>
     * 4.Function
     * Function<T,R>  T 入参  R 返回值
     * apply
     * andThen 先做自己 再做其他
     * compose  先做其他 在做自己
     * <p>
     * <p>
     * <p>
     * <p>
     * <p>
     * <p>
     * Stream API
     * Collection
     * Map
     * 数组
     *
     *
     * 一个Stream 只能使用一次
     *
     *   filter <Predicate>  条件过滤
     *   count               统计个数
     *   limit  long         获取部分数据 前N个
     *   skip   long         跳过
     *
     *
     *   映射map  Function<T,R>
     *
     *   concat   流合并  静态方法
     *   forEach  逐一消费
     *
     *
     *
     *   链式方法 与 终结方法
     *   链式方法
     *      filter
     *      limit
     *      skip
     *      map映射
     *      concat
     *   终结方法
     *      count
     *      forEeach
     *
     *
     *
     *
     *
     *   并发流  底层 Fork/Join
     *      直接获取
     *                parallelStream
     *
     *
     *      先获取普通然后变成并发流
     *                parallel
     *
     *
     *
     *
     *      流的收集
     *          Collector接口
     *              collect(Collectors.toList())
     *
     *           数组  // ?泛型擦除?
     *              toArray
     *              stream.toArray(String[]::new)   //构造器引用 解决泛擦除
     *
     *
     *
     *
     *
     *
     *        模块化
     *          模块拆分
     *
     *          权限控制
     *
     *         module-info.java 配置文件
     *
     *         exports 对外暴露的暴露净
     *         requires
     *
     *
     *         module mod.a{
     *             exports packageA;
     *         }
     *
     *         module mod.a{
     *             requires mod.a;
     *         }
     *
     *
     *
     *
     *         服务提供 与 服务消费
     *          module mod.a{
     *                  exports packageA;
     *                  providers Iinterface  with IinterfaceImpl;
     *          }
     *
     *
     *          module mod.b{
     *                       requires mod.a;
     *                       users Iinterface;
     *           }
     *
     *
     *           ServiceLoader<Iinterface> loader = ServiceLoader.load(Iinterface.class)
     *
     *
     *
     *           JDK 10 OpenJDK 更新记录
     *           JEP
     *           局部变量类型推断
     *           统一JDK仓库
     *           G1
     *
     *
     *           局部变量类型推断
     *
     *           整合了JDK库
     *            nashorn
     *            root
     *            corba
     *            hotspot
     *            jaxp
     *            jaxws
     *            jdk
     *            langtools
     *
     *
     *            java.util.local
     *
     *
     *
     *
     *         JDK11
     *              Jshell  方便执行语句    java9 就开始支持
     *
     *              var     局部类型推断    涉及到两个注解 非空 @Nonnull @Nonnable
     *
     *
     *            API
     *              List.of         不可添加元素
     *              Arrarys.asList  不可添加元素
     *              Set.of          t添加重复元素时 异常
     *
     *
     */

    public static void main(String[] args) {
        List<String> test = List.of("test");
        test.stream().filter(s -> s.length() != 1).forEach(System.err::println);

        Collection<Object> objects = new ArrayList<>();
        Stream<Object> stream = objects.stream();

        Map<Object, Object> of = Map.of();

        Stream<Map.Entry<Object, Object>> stream1 = of.entrySet().stream();
        Stream<Object> stream2 = of.keySet().stream();
        Stream<Object> stream3 = of.values().stream();


        Stream<Array> stream4 = Arrays.stream(new Array[]{});

        Stream<Array> stream5 = Arrays.stream(new Array[]{});

        //Stream.of();


        //jdk10
        //var arr = new int[]{};
        Set.of();


        //Jshell





    }


}
