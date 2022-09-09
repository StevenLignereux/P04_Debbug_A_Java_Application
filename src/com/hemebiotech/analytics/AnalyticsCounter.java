package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

/**
 * The main class allows you to extract/read symptoms of a external file and count and alphabetical order the list of symptoms with number of occurrences.
 * Finally, write the list in a result file.
 *
 * @author steven
 * @since 30/08/2022
 */

public class AnalyticsCounter {
    /**
     * Constant for path of symptoms files
     *
     */
    public static String INPUTFILE = "symptoms.txt";

    /**
     * Constant for path of result file
     */
    public static String OUTPUTFILE = "result.out";

    /**
     * The main class method called methods of classes
     *
     * @param args String array object
     * @throws Exception exception object for catch errors
     */
    public static void main(String[] args) throws Exception {

        ReadSymptomDataFromFile symptomReader = new ReadSymptomDataFromFile(INPUTFILE);
        List<String> listOfSymptoms = symptomReader.GetSymptoms();

        CountSymptom countSymptomInstance = new CountSymptom(listOfSymptoms);
        Map<String, Integer> resultSymptom = countSymptomInstance.getMapOfSymptomsWithNumberOccurences();

        IWriteDataFile writeDataFile = new WriteDataFile(OUTPUTFILE);
        writeDataFile.writeData(resultSymptom);
    }
}
