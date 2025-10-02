package com.tnsif.Day_5.hierarchicalinheritance;

public class Student extends Person {
    private String clas;
    private float per;

    // Default constructor
    public Student() {
        System.out.println("Student class default constructor");
        clas = "FY";
        per = 70;
    }

    // Constructor with only Student fields
    public Student(String clas, float per) {
        this.clas = clas;
        this.per = per;
    }

    // Constructor with Person + Student fields
    public Student(String name, String city, String clas, float per) {
        super(name, city); // call Person constructor
        this.clas = clas;
        this.per = per;
    }

    // Getters and setters
    public String getClas() {
        return clas;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }

    public float getPer() {
        return per;
    }

    public void setPer(float per) {
        this.per = per;
    }

    @Override
    public String toString() {
        return "Student [clas=" + clas + ", per=" + per +
               ", getName()=" + getName() + ", getCity()=" + getCity() + "]";
    }
}
