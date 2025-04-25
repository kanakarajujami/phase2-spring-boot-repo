package com.nt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name="User_information")
@Data
@RequiredArgsConstructor
@NoArgsConstructor(force = true)
public class User {

    @Id
    @GeneratedValue
    private Integer id;
    private final String  name;
    private final String  email;
    private final Double salary;
    private final boolean active;

}
