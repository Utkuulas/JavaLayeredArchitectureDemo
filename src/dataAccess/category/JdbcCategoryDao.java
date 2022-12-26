package dataAccess.category;

import entities.Category;

public class JdbcCategoryDao extends CategoryDao {
    @Override
    public void add(Category category) {
        dbData.add(category);
        System.out.println(category.getName() + " added to database with JDBC");
    }
}
