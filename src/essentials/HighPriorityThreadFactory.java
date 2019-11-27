/*
 * Copyright (c) 2012 [Acme Corp]
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 */

package essentials;

import java.util.concurrent.ThreadFactory;

class HighPriorityThreadFactory implements ThreadFactory {
    public static void main(String[] args) {
        Thread highPrioThread = new Thread(new Runnable() {
            public void run() {
                System.out.println("in run");
            }
        });
        System.out.println(highPrioThread.getPriority());
        highPrioThread.start();
    }

    public Thread newThread(Runnable r) {
        Thread t = new Thread(r);
        t.setPriority(Thread.MAX_PRIORITY);
        return t;
    }
}
