package business;

import dataAccess.Dao;
import dataAccess.category.CategoryDao;
import entities.Category;
import core.logging.Logger;
import entities.Course;

import java.util.ArrayList;
import java.util.List;

public class CategoryManager extends Manager<Category> {
    private Dao<Category> dao;
    private ArrayList<String> categoryNames;
    private List<Logger> loggers;

    public CategoryManager(Dao<Category> dao, List<Logger> loggers) {
        super(dao, loggers);
        this.dao = dao;
        this.loggers = loggers;
        this.categoryNames = new ArrayList<>();
    }

    public ArrayList<String> getCategoryNames() {
        for (Category category : dao.getAllDbData()) {
            categoryNames.add(category.getName().toLowerCase());
        }
        return categoryNames;
    }

    @Override
    public void add(Category category) throws Exception {
        if (isValidCategory(category)) {
            dao.add(category);
            for (Logger logger : loggers) {
                logger.log(category.getName() + " added to database");
            }
        } else {
            throw new Exception("There is another category with the same name in the database!");
        }
    }

    private boolean isValidCategory(Category category) {
        if (getCategoryNames().contains(category.getName().toLowerCase())) {
            return false;
        }
        return true;
    }
}
