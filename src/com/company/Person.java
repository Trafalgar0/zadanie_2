package com.company;

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
}
