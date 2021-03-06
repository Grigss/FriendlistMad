package com.sargis.projectmad.model;

public class Person {

    private long id;
    private String name;
    private String age;
    private String occupation;

    public Person() {
    }

    public Person(String name, String age, String occupation) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

}
