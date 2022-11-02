package com.example.java2022homework5.business;


import com.example.java2022homework5.core.logging.ILogger;
import com.example.java2022homework5.dataAccess.ICourseDao;
import com.example.java2022homework5.entities.Course;

import java.util.List;

public class CourseManager {
    private ICourseDao iCourseDao;
    private ILogger[] loggers;

    public CourseManager(ICourseDao iCourseDao ,ILogger[] loggers) {
        this.iCourseDao=iCourseDao;
        this.loggers = loggers;
    }

    public void add(Course course) throws Exception {

        if(course.getCourseName() == course.getCourseName()){
            throw new Exception("Kurs ismi tekrar edemez");
        }
        if(course.getPrice()<0){
           throw new Exception("Kurs fiyatı 0'dan küçük olamaz");
        }

        for (ILogger iLogger:loggers){
            iLogger.log(course.getCourseName());
        }
        iCourseDao.add(course);
    }

}

