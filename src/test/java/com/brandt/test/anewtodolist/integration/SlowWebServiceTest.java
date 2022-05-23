package com.brandt.test.anewtodolist.integration;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SlowWebServiceTest {

    @Test
    public void slowTest() throws InterruptedException {
        Thread.sleep(5000);
        assertEquals(1,1);
    }

    @Test
    public void greatTest() throws InterruptedException {
        Thread.sleep(2000);
        assertEquals(1,1);
    }

    @Test
    public void anotherTest() throws InterruptedException {
        Thread.sleep(3000);
        assertEquals(1,1);
    }
}
