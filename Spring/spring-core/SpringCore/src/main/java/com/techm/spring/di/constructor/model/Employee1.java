package com.techm.spring.di.constructor.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee1 {
    private int id;
    private String name;
    Address address;
}
