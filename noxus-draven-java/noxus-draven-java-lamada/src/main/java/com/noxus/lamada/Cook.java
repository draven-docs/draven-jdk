package com.noxus.lamada;

/**
 * 必须有一个接口 唯一的抽象方法
 * 遵循规范
 */
@FunctionalInterface
public interface Cook {
    /**
     * 知道了
     */
    void makeFood();
}
