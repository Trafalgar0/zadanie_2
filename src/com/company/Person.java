package com.company;

import java.util.Objects;

class Person implements Comparable<Person> {

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getJob() {
        return job;
    }

    public int getAge() {
        return age;
    }

    public Person(String firstname, String lastname, String job, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.job = job;
        this.age = age;
    }

    private String firstname;
    private String lastname;
    private String job;
    private int age;

    @Override
    public int compareTo(Person c) {
        return firstname.compareTo(c.firstname);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && firstname.equals(person.firstname) && lastname.equals(person.lastname) && job.equals(person.job);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname, job, age);
    }
}
