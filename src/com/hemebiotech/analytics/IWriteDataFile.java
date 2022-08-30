package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.Map;

public interface IWriteDataFile {

    void writeData(Map<String, Integer>map) throws IOException;
}
