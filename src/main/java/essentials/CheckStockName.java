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

import java.util.List;

public class CheckStockName {
    private static java.util.List<String> stocks =
            List.of("NASDAQ:MSFT", "NASDAQ:GOGL", "SENSEX:RIL", "SENSEX:TCS",
                    "NASDAQ:IBM");

    public static String getStockNameIfNASDAQStockIsInListOfStocks(String stockName) {
//        stocks.stream()
//              .filter(name -> name.startsWith("NASDAQ"))
//              .filter(name -> name.equals(stockName))
//              .findAny()
//              .orElse("Not NASDAQ listed or found in stock list");
        if (stockName.startsWith("NASDAQ") && stocks.contains(stockName)) {
            return stockName;
        } else {
            return "Not NASDAQ listed or found in stock list";
        }
    }

    public static void main(String[] args) {
        String stockName = "NASDAQ:IBM";
        System.out.println(
                getStockNameIfNASDAQStockIsInListOfStocks(stockName));
    }
}
