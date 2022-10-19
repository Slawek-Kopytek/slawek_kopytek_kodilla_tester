package com.kodilla.abstracts.homework;

public class Person {
    public String firstName;
    public int age;
    public Job job;

    public Person(String firstName, int age, Job job){
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    public void showResponsilibities(){
        System.out.println(this.firstName + " " + this.job.getSalary());

    }

    public static void main(String[] args) {
        Person jan = new Person("Jan", 35, new Driver());
        Person anna = new Person("Anna", 45, new Doctor());
        Person tomasz = new Person("Tomasz", 55, new Entrepreneur());

        jan.showResponsilibities();
        anna.showResponsilibities();
        tomasz.showResponsilibities();
    }
}
