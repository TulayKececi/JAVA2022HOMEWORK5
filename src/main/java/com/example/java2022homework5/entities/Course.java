package com.example.java2022homework5.entities;

public class Course {
    private int courseId;
    private String courseName;
    private int price;

    public Course(int courseId, String courseName,int price) {
        this.courseId = courseId;
        this.courseName=courseName;
        this.price=price;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
