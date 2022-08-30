package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public class AnalyticsCounter {

    public static void main(String[] args) throws Exception {
        ReadSymptomDataFromFile symptomReader = new ReadSymptomDataFromFile("symptoms.txt");
        List<String>listOfSymptoms = symptomReader.GetSymptoms();

        CountSymptom countSymptomInstance = new CountSymptom(listOfSymptoms);
        Map<String, Integer> resultSymptom = countSymptomInstance.getMapOfSymptomsWithNumberOccurences();

       IWriteDataFile writeDataFile = new WriteDataFile("result.out");
       writeDataFile.writeData(resultSymptom);
    }
}