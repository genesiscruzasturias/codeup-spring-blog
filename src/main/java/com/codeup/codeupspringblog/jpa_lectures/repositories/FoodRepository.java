package com.codeup.codeupspringblog.jpa_lectures.repositories;
import com.codeup.codeupspringblog.jpa_lectures.models.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {


    Food findByNameIs(String name);
//    Means SELECT * from food where name = ?;
    Food findByCaloriesIsLessThan(int num);
}
