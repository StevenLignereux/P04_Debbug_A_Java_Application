package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.Map;

/*
  * Anything that will write a file who's contains the result
  * The format of file is .out
  *
 */

public interface IWriteDataFile {

    /**
     * If no data catch an exception
     *
     * @param map a map of String and Integer
     * @throws IOException exception object for catch errors
     */
    void writeData(Map<String, Integer>map) throws IOException;
}
