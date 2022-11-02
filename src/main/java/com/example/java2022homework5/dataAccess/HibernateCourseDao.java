package com.example.java2022homework5.dataAccess;

import com.example.java2022homework5.entities.Course;

public class HibernateCourseDao implements ICourseDao {
    public void add(Course course){
        System.out.println("HİBERNATE İLE VERİTABANINA EKLENDİ");
    }
}
