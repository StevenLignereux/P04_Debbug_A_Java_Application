package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

/**
 * @author steven
 * @since 30/08/2022
 * The main class allows you to extract/read symptoms of a external file and count and alphabetical order the list of symptoms with number of occurrences.
 * Finally, write the list in a result file.
 */

public class AnalyticsCounter {
    /**
     * @param args String array object
     * @throws Exception exception object for catch errors
     * the main class method called methods of classes
     */
    public static void main(String[] args) throws Exception {

        ReadSymptomDataFromFile symptomReader = new ReadSymptomDataFromFile("symptoms.txt");
        List<String> listOfSymptoms = symptomReader.GetSymptoms();

        CountSymptom countSymptomInstance = new CountSymptom(listOfSymptoms);
        Map<String, Integer> resultSymptom = countSymptomInstance.getMapOfSymptomsWithNumberOccurences();

        IWriteDataFile writeDataFile = new WriteDataFile("result.out");
        writeDataFile.writeData(resultSymptom);
    }
}