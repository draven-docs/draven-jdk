package com.noxus.draven.lamada;

/**
 * 〈功能概述〉<br>
 *
 * @className: Test
 * @package: noxus.draven.lamada
 * @author: draven
 * @date: 2020/7/1 09:38
 */
public class Test {


    public static void main(String[] args) {
//        method(new Cook() {
//            public void makeFood() {
//                System.out.println();
//            }
//        });

        method(() -> {
            System.out.println("我实现了");
        });
    }

    private static void method(noxus.draven.lamada.Cook cook) {
        cook.makeFood();
    }
}
