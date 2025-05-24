package com.campusdual.classroom;

import java.util.HashMap;
import java.util.Map;

public class Exercise23 {

    public static Map<String, Person> createHashMap() {
        Map<String, Person> map = new HashMap<>();

        map.put("person", new Person("John", "Smith"));
        map.put("teacher", new Teacher("María", "Montessori", "Educación"));
        map.put("police", new PoliceOfficer("Jake", "Peralta", "B-99"));
        map.put("doctor", new Doctor("Gregory", "House", "Nefrología e infectología"));

        return map;

    }
    public static Person addMapValue(Map<String, Person> map, String stringKey, Person personValue) {
        if (map.containsKey(stringKey)) {
            System.out.println("Ya existe la clave indicada: " + stringKey + ". No se reemplaza el valor.");
            return map.get(stringKey);
          } else {
            map.put(stringKey, personValue);
            return personValue;
        }
    }
  /*
    public static Person addMapValue(Map<String, Person> map, String stringKey, Person personValue) {
        // putIfAbsent devuelve el valor existente si la clave ya estaba mapeada
        // o null si la clave no estaba mapeada y se añadió el nuevo valor.
        Person existingValue = map.putIfAbsent(stringKey, personValue);

        if (existingValue != null) {
            System.out.println("Ya existe la clave indicada: " + stringKey + ". No se reemplaza el valor.");
            return existingValue;
        } else {
            return personValue;
        }
    }*/

    public static void printMapValues(Map<String, Person> map) {
        // Pares clave - valor : colección
        for (Map.Entry<String, Person> entry : map.entrySet()) {
            String key = entry.getKey();
            Person value = entry.getValue();
            System.out.println("Clave: " + key + ", Valor: " + value.getName() + " " + value.getSurname());
            value.getDetails();
        }
    }

    public static void main(String[] args) {
        Map<String, Person> exampleMap = createHashMap();
        System.out.println("Este Map de Strings contiene " + exampleMap.size() + " elementos.");
        printMapValues(exampleMap);

        System.out.println("-----------------------------------------");
        addMapValue(exampleMap,"police", new PoliceOfficer("Charles", "Boyle", "B-99")  );
        printMapValues(exampleMap);
        System.out.println("-----------------------------------------");
    }
    
}
