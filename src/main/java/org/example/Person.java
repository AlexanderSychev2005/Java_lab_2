package org.example;
import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class Person {
    @SerializedName("last_name1")
    private final String last_name; // the value is available only inside the class and cannot be changed, immutable
    private final String first_name;
    private final int age;

    public Person(String last_name, String first_name, int age) {
        this.last_name = last_name;
        this.first_name = first_name;
        this.age = age;
    }

    // Getters
    public String getLast_name() { return last_name; }
    public String getFirst_name() { return first_name; }
    public int getAge() { return age; }

    @Override
    public boolean equals(Object o) { // Override equals method to compare Person objects based on their fields, not memory address
        if (this == o) return true; // Check if the same object
        if (o == null || getClass() != o.getClass()) return false; // Check if the other object is null or of a different class
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(last_name , person.last_name) && //
                Objects.equals(first_name , person.first_name);
    }

    @Override
    public int hashCode() { // Override hashCode method to ensure that equal objects have the same hash code
        return Objects.hash(last_name, first_name, age);
    }

    @Override
    public String toString() {
        return "Person {" +
                "last_name='" + last_name + '\'' +
                ", first_name='" + first_name + '\'' +
                ", age=" + age +
                '}';
    }
}
