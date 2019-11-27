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

import java.util.Scanner;

class ScanInt {
    public static void main(String[] args) {
        System.out.println("Type an integer in the console: ");
        java.util.Scanner consoleScanner = new java.util.Scanner(System.in);
        try {
            System.out.println(
                    "You typed the integer value: " + consoleScanner.nextInt());
        } finally {
            consoleScanner.close();
        }
    }
}