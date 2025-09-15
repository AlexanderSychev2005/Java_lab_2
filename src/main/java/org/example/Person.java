package org.example;


import java.util.Objects;

public class Person {
    private final String last_name;
    private final String first_name;
    private final int age;

    public Person(String last_name, String first_name, int age) {
        this.last_name = last_name;
        this.first_name = first_name;
        this.age = age;
    }

    public String getLast_name() { return last_name; }
    public String getFirst_name() { return first_name; }
    public int getAge() { return age; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(last_name , person.last_name) &&
                Objects.equals(first_name , person.first_name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(last_name, first_name, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "last_name='" + last_name + '\'' +
                ", first_name='" + first_name + '\'' +
                ", age=" + age +
                '}';
    }
}
