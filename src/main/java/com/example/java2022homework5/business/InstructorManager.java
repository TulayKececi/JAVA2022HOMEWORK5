package com.example.java2022homework5.business;

import com.example.java2022homework5.core.logging.ILogger;
import com.example.java2022homework5.dataAccess.IInstructorDao;

public class InstructorManager {
    private IInstructorDao iInstructorDao;
    private ILogger[] loggers;

    public InstructorManager(IInstructorDao iInstructorDao,ILogger[] loggers) {
        this.iInstructorDao = iInstructorDao;
    }
}
