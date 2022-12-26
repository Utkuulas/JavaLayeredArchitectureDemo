package entities;

import java.util.List;

public class Instructor {
    private int id = 0;
    private String name;
    private List<Course> courses;

    public Instructor(String name) {
        this.id += 1;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
