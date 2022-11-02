package com.example.java2022homework5.business;

import com.example.java2022homework5.core.logging.ILogger;
import com.example.java2022homework5.dataAccess.ICategoryDao;
import com.example.java2022homework5.entities.Category;

public class CategoryManager {
    private ICategoryDao iCategoryDao ;
    private ILogger[] loggers;

    public CategoryManager(ICategoryDao iCategoryDao,ILogger[] loggers) {
        this.iCategoryDao = iCategoryDao;
        this.loggers=loggers;
    }

    public void add(Category category) throws Exception {

        if (category.getCategoryName() == category.getCategoryName()) {
            throw new Exception("Kategori ismi tekrar edemez");
        }
        for (ILogger iLogger:loggers){
            iLogger.log(category.getCategoryName());
        }
    }
}
