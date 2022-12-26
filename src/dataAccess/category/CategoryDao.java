package dataAccess.category;

import dataAccess.Dao;
import entities.Category;

import java.util.ArrayList;

public abstract class CategoryDao extends Dao<Category> {
    public abstract void add(Category category);
}
