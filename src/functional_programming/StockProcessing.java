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

import java.util.List;

class Stock {
    String code;
    int price;

    public Stock(String code, int price) {
        this.code = code;
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "functional_programming.Stock{" +
                "code='" + code + '\'' +
                ", price=" + price +
                '}';
    }
}

class StockProcessing {
    public static void main(String[] args) {
        java.util.List<Stock> stocks = List.of(
                new Stock("NASDAQ:MSFT", 1434),
                new Stock("NASDAQ:GOGL", 1243),
                new Stock("SENSEX:RIL", 5730),
                new Stock("SENSEX:TCS", 7893),
                new Stock("NASDAQ:IBM", 1194));

        var nasdaqStocks = new java.util.ArrayList<Stock>();
        for (Stock stock : stocks) {
            if (stock.getCode().startsWith("NASDAQ")) {
                nasdaqStocks.add(stock);
            }
        }

        System.out.println("The NASDAQ listed stocks are:");
        for (Stock stock : nasdaqStocks) {
            System.out.println(stock);
        }
    }
}

