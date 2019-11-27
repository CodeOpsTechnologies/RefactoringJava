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

package essentials;class Pair<T1, T2> {
    T1 object1;
    T2 object2;
    Pair(T1 one, T2 two) {
        object1 = one;
        object2 = two;
    }
    public T1 getFirst() {
        return object1;
    }
    public T2 getSecond() {
        return object2;
    }
}

class PairTest {
    public static void main(String []args) {
        Pair worldCup = new Pair(2018, "Russia");
        System.out.println("World cup " +  worldCup.getFirst() +
                " in " + worldCup.getSecond());
    }
}