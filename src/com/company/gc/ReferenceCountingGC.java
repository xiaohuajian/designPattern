package com.company.gc;

public class ReferenceCountingGC {

    public Object instance = null;

    public static final int _1MB = 1024 * 1024;

    private byte[] mBytes = new byte[2 * _1MB];

    public static void main(String[] args) {
        ReferenceCountingGC a = new ReferenceCountingGC();
        ReferenceCountingGC b = new ReferenceCountingGC();
        a.instance = b;
        b.instance = a;

        a = null;
        b = null;

        System.gc();

    }
}
