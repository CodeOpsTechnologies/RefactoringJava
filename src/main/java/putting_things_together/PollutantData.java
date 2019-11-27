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

package putting_things_together;

import java.nio.file.Files;
import java.nio.file.Path;
import java.time.format.DateTimeFormatter;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class PollutantData {
    public String Country;
    public String State;
    public String city;
    public String place;
    public java.time.LocalDateTime lastupdate;
    public double Avg;
    public double Max;
    public double Min;
    public String Pollutants;

    public PollutantData(String country, String state,
                         String city, String place,
                         java.time.LocalDateTime lastupdate, double avg,
                         double max,
                         double min, String pollutants) {
        Country = country;
        State = state;
        this.city = city;
        this.place = place;
        this.lastupdate = lastupdate;
        Avg = avg;
        Max = max;
        Min = min;
        Pollutants = pollutants;
    }
}

class PollutantDataProcessing {
    public static void main(String[] args) throws java.io.IOException {
        final var path = System.getProperty("user.dir") +
                "/resources/AirQuality-India-Realtime.csv";
        var fileEntries =
                Files.lines(Path.of(path)).collect(toList());
        fileEntries.remove(0);
        var pollutantEntries = makePollutantEntries(fileEntries);
        pollutantEntries.forEach(System.out::println);
    }

    private static List<PollutantData> makePollutantEntries(
            List<String> fileEntries) {
        java.util.ArrayList entries = new java.util.ArrayList<PollutantData>();
        for (var entry :
                fileEntries) {
            var parts = entry.split(",");
            PollutantData pollutantData = new PollutantData(
                    parts[0],
                    parts[1],
                    parts[2],
                    parts[3],
                    java.time.LocalDateTime.parse(parts[4],
                            DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")),
                    readDoubleNaNifInvalid(parts[5]),
                    readDoubleNaNifInvalid(parts[6]),
                    readDoubleNaNifInvalid(parts[7]),
                    parts[8]
            );
            entries.add(pollutantData);
        }
        return entries;
    }

    private static double readDoubleNaNifInvalid(String value) {
        try {
            return Double.parseDouble(value);
        } catch (NumberFormatException e) {
            return Double.NaN;
        }
    }
}
