package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 * This class write the results File
 *
 * @since 30/08/2022
 * @author  steven.
 */

public class WriteDataFile implements IWriteDataFile {
    private final String filePath;

    /**
     * @param filePath the path of file symptoms.txt
     */
    public WriteDataFile(String filePath) {
        this.filePath = filePath;
    }


    /**
     * @param map a map of String and Integer
     */
    @Override
    public void writeData(Map<String, Integer> map) {

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath))) {
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                bufferedWriter.write(entry.getKey() + "=" + entry.getValue());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
