package com.techm.spring.di.constructor.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Question {
    int id;
    String name;
    List<String> answers;
}
