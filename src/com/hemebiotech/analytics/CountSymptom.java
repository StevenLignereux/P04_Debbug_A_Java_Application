package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * This class count the numbers of symptoms in a file, then return an alphabetic order list
 * @author steven
 * @since 30/08/2022
 */
public final class CountSymptom {

    private final List<String> listOfSymptoms;

    /**
     * @param listOfSymptoms a list with symptoms
     */
    public CountSymptom(List<String> listOfSymptoms) {
        this.listOfSymptoms = listOfSymptoms;
    }

    /**
     * @return a map with symptoms tried by alphabetical order without duplicated lines.
     *
     */
    public Map<String, Integer> getMapOfSymptomsWithNumberOccurences() {
        // Using a TreeMap for alphabetic order
        Map<String, Integer> mapSymptomsWithNumberOccurences = new TreeMap<>();

        for (String symptom : listOfSymptoms) {
            if (mapSymptomsWithNumberOccurences.containsKey(symptom)) {
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
