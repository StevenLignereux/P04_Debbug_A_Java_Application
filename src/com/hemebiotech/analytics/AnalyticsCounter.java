package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.util.List;
import java.util.Map;

public class AnalyticsCounter {

    public static void main(String[] args) throws Exception {
        ReadSymptomDataFromFile symptomReader = new ReadSymptomDataFromFile("symptoms.txt");
        List<String>listOfSymptoms = symptomReader.GetSymptoms();

        CountSymptom countSymptomInstance = new CountSymptom(listOfSymptoms);
        Map<String, Integer> resultSymptom = countSymptomInstance.getMapOfSymptomsWithNumberOccurences();

        // next generate output
        FileWriter writerSymptom = new FileWriter("result.out");
        for (String symptom : resultSymptom.keySet()) {
            System.out.println(symptom + "=" + resultSymptom.get(symptom));
            writerSymptom.write(symptom + "=" + resultSymptom.get(symptom) + "\n");
        }
        writerSymptom.close();
    }
}