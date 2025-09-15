package org.example;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Person original = new Person("Alex", "Sychov", 20);
        String personsLastName = original.getLast_name();
        String personsFirstName = original.getFirst_name();
        int personsAge = original.getAge();


        // Serialize to JSON
        Gson gson = new Gson();
        String json = gson.toJson(original);
        System.out.println("Serialized JSON: " + json);

        // Deserialize from JSON
        Person restored = gson.fromJson(json, Person.class);
        System.out.println("Restored Person: " + restored);

        // Check equality
        System.out.println("Are they equal? " + original.equals(restored));
    }
}