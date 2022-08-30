package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.Map;

public interface IWriteDataFile {

    /**
     * @param map a map of String and Integer
     * @throws IOException exception object for catch errors
     */
    void writeData(Map<String, Integer>map) throws IOException;
}
