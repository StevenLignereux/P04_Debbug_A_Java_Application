package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Map;
import java.util.TreeMap;

public class AnalyticsCounter {

    public static void main(String[] args) throws Exception {
        // Use the maps to extracting the symptoms of the file
        File symptomList = new File("symptoms.txt");
        Map<String, Integer> mapSymptomWithNumberOccurence = new TreeMap<>();
        FileReader symptomListReader = new FileReader(symptomList);
        BufferedReader bufferedSymptomReader = new BufferedReader(symptomListReader);

        // one symptom in the list
        String symptomStr;

        while ((symptomStr = bufferedSymptomReader.readLine()) != null) {
            if (mapSymptomWithNumberOccurence.containsKey(symptomStr)) {
                int countOccurence = mapSymptomWithNumberOccurence.get(symptomStr);
                countOccurence++;
                mapSymptomWithNumberOccurence.replace(symptomStr, countOccurence);
            } else {
                mapSymptomWithNumberOccurence.put(symptomStr, 1);
            }
        }

        // next generate output
        FileWriter writerSymptom = new FileWriter("result.out");
        for (String symptom : mapSymptomWithNumberOccurence.keySet()) {
            System.out.println(symptom + "=" + mapSymptomWithNumberOccurence.get(symptom));
            writerSymptom.write(symptom + "=" + mapSymptomWithNumberOccurence.get(symptom) + "\n");
        }
        symptomListReader.close();
        writerSymptom.close();
    }
}