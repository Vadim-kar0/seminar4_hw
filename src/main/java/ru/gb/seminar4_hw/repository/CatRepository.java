package ru.gb.seminar4_hw.repository;

import lombok.Data;
import org.springframework.stereotype.Repository;
import ru.gb.seminar4_hw.model.Cat;

import java.util.ArrayList;
import java.util.List;

@Repository
@Data
public class CatRepository {
    private List<Cat> cats = new ArrayList<>();

    public void addCat(Cat cat) {
        cats.add(cat);
    }
}
