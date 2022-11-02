package com.example.java2022homework5.dataAccess;

import com.example.java2022homework5.entities.Instructor;

public class HibernateInstructorDao implements IInstructorDao {
    public void add(Instructor instructor){
        System.out.println("HİBERNATE İLE VERİTABANINA EKLENDİ");
    }
}
