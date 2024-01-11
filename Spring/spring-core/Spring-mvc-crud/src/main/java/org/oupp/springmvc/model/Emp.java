package org.oupp.springmvc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Emp {
    private int id;
    private String name;
    private float salary;
    private String designation;
}
