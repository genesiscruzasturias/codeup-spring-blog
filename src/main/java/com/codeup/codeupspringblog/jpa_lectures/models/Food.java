package com.codeup.codeupspringblog.jpa_lectures.models;

import jakarta.persistence.*;

@Entity
//To change the name of table
//@Table(name = "comida")
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(nullable = false, length = 100)
    private int calories;

    @Column(length = 50)
    private String name;

    @Column()
    private String type;

    public Food() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Food(Long id, int calories, String name, String type) {
        this.id = id;
        this.calories = calories;
        this.name = name;
        this.type = type;
    }

    public Food(Long id) {
        this.id = id;
    }

    public Food(int calories, String name, String type) {
        this.calories = calories;
        this.name = name;
        this.type = type;
    }

    //    Step 1 identify as table, use Entity annotation above the class signature


}
