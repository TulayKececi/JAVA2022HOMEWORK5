package com.example.java2022homework5.dataAccess;

import com.example.java2022homework5.entities.Category;

public class HibernateCategoryDao implements ICategoryDao {
    public void add(Category category){
        System.out.println("HİBERNATE İLE VERİTABANINA EKLENDİ");
    }
}
