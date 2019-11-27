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

class LargeWords {
    public static void main(String[] args) throws java.io.IOException {
        var aliceInWonderlandPath = System.getProperty("user.dir") +
                "/resources/alice-wonderland.txt";
        java.util.List<String> lines =
                java.nio.file.Files.readAllLines(java.nio.file.Paths.get(aliceInWonderlandPath),
                        java.nio.charset.Charset.defaultCharset());
        java.util.Set<String> words = new java.util.TreeSet<>();
        for (String line : lines) {
            String[] splitSentences = line.replaceAll("\\W", " ").split(" ");
            for (String word : splitSentences) {
                if (word.length() > 10) {
                    words.add(word);
                }
            }
        }

        for (String word : words) {
            System.out.println(word);
        }
    }
}

