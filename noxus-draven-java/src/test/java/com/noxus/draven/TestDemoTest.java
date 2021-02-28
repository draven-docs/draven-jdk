package com.noxus.draven;

//import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * 〈功能概述〉<br>
 *
 * @className: TestDemo
 * @package: com.noxus
 * @author: draven
 * @date: 2021/2/28 10:05
 */
@DisplayName("Common annotation test")
class TestDemoTest {

    @BeforeEach
    private void before() {
        System.out.println("before");
    }


    @Test
    @DisplayName("Common annotation test123")
    public void demos() {
        System.out.println("Common annotation test" + "demos");
        assertEquals(1, 1);
    }
}
