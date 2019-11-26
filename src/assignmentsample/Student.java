/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentsample;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author perry
 */
public class Student {

    private String name;
    private String surName;
    private LocalDate dateOfBirth;
    private double tuiFees;
    Course course;
    Scanner sc = new Scanner(System.in);
    List<Student> myStudents = new ArrayList<>();

    protected void addStudent() {

        System.out.print("Enter name: ");
        name = sc.next();
        System.out.print("Enter surname: ");
        surName = sc.next();
        System.out.println("type date of birth in YYYY-MM-DD format");
        System.out.print("Enter year: ");
        int y = Integer.parseInt(sc.next());
        System.out.print("Enter month: ");
        int m = Integer.parseInt(sc.next());
        System.out.print("Enter day: ");
        int d = Integer.parseInt(sc.next());
        dateOfBirth = LocalDate.of(y, m, d);
        System.out.print("enter tuition fees: ");
        tuiFees = sc.nextInt();
        Student st = new Student(name, surName, dateOfBirth, tuiFees);
        getList().add(st);
    }

    public void studentList() {

        for (Student myStudent : myStudents) {
            System.out.println(myStudent);
        }
    }

    public void setList() {
        Student st1 = new Student("Karamouratidis", "Vaggelis", LocalDate.of(1985, 10, 14), 1500);
        Student st2 = new Student("Karageorgiou", "Efi", LocalDate.of(1990, 5, 3), 1750);
        Student st3 = new Student("Mitsou", "Eva", LocalDate.of(1986, 8, 14), 2100);
        Student st4 = new Student("Theodoropoulos", "Stathis", LocalDate.of(1993, 2, 14), 2500);
        this.myStudents.add(st1);
        this.myStudents.add(st2);
        this.myStudents.add(st3);
        this.myStudents.add(st4);
    }

    public List<Student> getList() {
        return this.myStudents;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surName;
    }

    public void setSurname(String surname) {
        this.surName = surname;
    }

    public Student(String name, String surName, LocalDate date, double tuitoinFees) {
        this.name = name;
        this.surName = surName;
        this.dateOfBirth = date;
        this.tuiFees = tuitoinFees;
    }

    public Student(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", surName=" + surName + ", date=" + dateOfBirth + ", tuitoinFees=" + tuiFees + '}';
    }

    public LocalDate getDate() {
        return dateOfBirth;
    }

    public void setDate(LocalDate date) {
        this.dateOfBirth = date;
    }

    public double getTuitoinFees() {
        return tuiFees;
    }

    public void setTuitoinFees(double tuitoinFees) {
        this.tuiFees = tuitoinFees;
    }

    public void setMyStudents(List<Student> myStudents) {
        this.myStudents = myStudents;
    }

}
