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

public class NullAndEmptyStringCheck {
    public static boolean checkStringNullOrEmpty(String str) {
        if ((str != null) && !str.trim().isEmpty()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("checkStringNullOrEmpty(\"hello\") = " +
                checkStringNullOrEmpty("hello"));
        System.out.println("checkStringNullOrEmpty(\"null\") = " +
                checkStringNullOrEmpty(null));
        System.out.println(
                "checkStringNullOrEmpty(\"\") = " + checkStringNullOrEmpty(""));
    }
}
