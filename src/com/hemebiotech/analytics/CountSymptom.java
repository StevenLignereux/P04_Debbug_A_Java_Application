package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public final class CountSymptom {
    private final List<String> listOfSymptoms;

    public CountSymptom(List<String> listOfSymptoms) {
        this.listOfSymptoms = listOfSymptoms;
    }

    public Map<String, Integer> getMapOfSymptomsWithNumberOccurences(){
        // Using a TreeMap for alphabetic order
        Map<String, Integer> mapSymptomsWithNumberOccurences = new TreeMap<>();

        for (String symptom: listOfSymptoms){
            if (mapSymptomsWithNumberOccurences.containsKey(symptom)){
                int countOccurence = mapSymptomsWithNumberOccurences.get(symptom);
                countOccurence++;
                mapSymptomsWithNumberOccurences.replace(symptom, countOccurence);
            } else {
                mapSymptomsWithNumberOccurences.put(symptom, 1);
            }
        }

        return mapSymptomsWithNumberOccurences;
    }
}
