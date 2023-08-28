package com.utest.util;

public class EsperaImplicita {
    public void esperasImplicitas (int seg) {
        try {
            Thread.sleep(seg * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace(System.out);
        }
    }
}
