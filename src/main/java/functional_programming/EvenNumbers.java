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

package functional_programming;import java.util.stream.IntStream;

class EvenNumbers {
    public static void main(String []args) {
        for (int i = 0; i <= 10; i++) {
            if ((i % 2) == 0) {
                System.out.println(i);
            }
        }
    }
}
