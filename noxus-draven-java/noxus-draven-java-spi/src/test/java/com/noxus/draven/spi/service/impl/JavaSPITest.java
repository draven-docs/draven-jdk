package com.noxus.draven.spi.service.impl;

import com.noxus.draven.spi.service.Robot;
import org.junit.Test;

import java.util.ServiceLoader;

public class JavaSPITest {

    @Test
    public void sayHello() throws Exception {
        ServiceLoader<Robot> serviceLoader = ServiceLoader.load(Robot.class);
        System.out.println("Java SPI");
        serviceLoader.forEach(Robot::sayhello);
    }
}
