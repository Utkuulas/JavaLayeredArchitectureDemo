package dataAccess.category;

import entities.Category;

public class HibernateCategoryDao extends CategoryDao {
    @Override
    public void add(Category category) {
        dbData.add(category);
        System.out.println(category.getName() + " added to database with Hibernate");
    }
}
