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

// class ZipTextFile takes the name of a text file as input and creates a zip file
// after compressing that text file.

class ZipAFile {
    public static void main(String []args) throws Exception {
        if(args.length == 0) {
            System.out.println("Pass the name of the file in the current directory to be zipped as an argument");
            System.exit(-1);
        }

        String fileName = args[0];
        // name of the zip file is the input file name with the suffix ".zip"
        String zipFileName = fileName + ".zip";

        byte [] buffer = new byte[1024];
        // these constructors can throw FileNotFoundException
        try (java.util.zip.ZipOutputStream zipFile = new java.util.zip.ZipOutputStream(
                new java.io.FileOutputStream(zipFileName))) {
            try (java.io.FileInputStream fileIn = new java.io.FileInputStream(
                    fileName)) {
                // putNextEntry can throw IOException
                zipFile.putNextEntry(new java.util.zip.ZipEntry(fileName));
                int lenRead = 0; // variable to keep track of number of bytes
                // successfully read
                // copy the contents of the input file into the zip file
                while ((lenRead = fileIn.read(buffer)) > 0) {
                    zipFile.write(buffer, 0, lenRead);
                }
            }
        }
    }
}

