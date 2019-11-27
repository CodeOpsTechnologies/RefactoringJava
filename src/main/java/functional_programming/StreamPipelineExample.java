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

package functional_programming;

class StreamPipelineExample {
    public static void main(String[] args) {
        java.util.Set<String> uniqueValues = new java.util.HashSet<>();
        for (java.lang.reflect.Method method : Object.class.getMethods()) {
            String name = method.getName();
            if (uniqueValues.add(name)) {
                System.out.println(name);
            }
        }
    }
}

