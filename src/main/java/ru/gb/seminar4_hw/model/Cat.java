package ru.gb.seminar4_hw.model;

import lombok.*;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
@Data
public class Cat {
    private String name;
    private int age;
    private String teams;
}
