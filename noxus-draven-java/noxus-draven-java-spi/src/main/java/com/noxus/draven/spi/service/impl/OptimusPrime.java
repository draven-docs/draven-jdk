package com.noxus.draven.spi.service.impl;

import com.noxus.draven.spi.service.Robot;

/**
 * 〈功能概述〉<br>
 *
 * @className: O
 * @package: com.noxus.draven.spi.service.impl
 * @author: draven
 * @date: 2020/9/27 21:12
 */
public class OptimusPrime implements Robot {
    @Override
    public void sayhello() {
        System.out.println("public class OptimusPrime implements Robot");
    }
}
