package com.techm.spring.di.field.collection;

import lombok.Data;
import java.util.List;
@Data
public class Questioin {
    int id;
    String name;
    List<String> answers;
}
