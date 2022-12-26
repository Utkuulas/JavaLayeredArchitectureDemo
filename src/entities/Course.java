package entities;

public class Course {
    private int id = 0;
    private String name;
    private double price;
    private Instructor instructor;
    private Category category;

    public Course(String name, double price, Instructor instructor, Category category) {
        this.id += 1;
        this.name = name;
        this.price = price;
        this.instructor = instructor;
        this.category = category;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
