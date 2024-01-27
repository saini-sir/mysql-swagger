package com.demo.modal;

import javax.persistence.*;


import lombok.Data;

@Data
@Entity
public class Student {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
private int id;
private String name;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

}
