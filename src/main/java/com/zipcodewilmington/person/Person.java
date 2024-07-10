package com.zipcodewilmington.person;

/**
 * If you did ObjectsOne lab, you might recognize this code?
 */
public class Person {
    private String name;
    private int age;
    private int numOfSiblings;
    private String fathersName;
    private int yearBorn;
    private String monthBorn;
    private int numOfChildren;

    public Person() {
        this.name = "";
        this.age = Integer.MAX_VALUE;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age, int numOfSiblings, String fathersName, int yearBorn, String monthBorn, int numOfChildren) {
        this.name = name;
        this.age = age;
        this.numOfSiblings = numOfSiblings;
        this.fathersName = fathersName;
        this.yearBorn = yearBorn;
        this.monthBorn = monthBorn;
        this.numOfChildren = numOfChildren;
    }


    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }

    public int getNumOfSiblings() {
        return numOfSiblings;
    }

    public void setNumOfSiblings(int numOfSiblings) {
        this.numOfSiblings = numOfSiblings;
    }

    public String getFathersName() {
        return fathersName;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    public int getYearBorn() {
        return yearBorn;
    }

    public void setYearBorn(int yearBorn) {
        this.yearBorn = yearBorn;
    }

    public String getMonthBorn() {
        return monthBorn;
    }

    public void setMonthBorn(String monthBorn) {
        this.monthBorn = monthBorn;
    }

    public int getNumOfChildren() {
        return numOfChildren;
    }

    public void setNumOfChildren(int numOfChildren) {
        this.numOfChildren = numOfChildren;
    }
}

