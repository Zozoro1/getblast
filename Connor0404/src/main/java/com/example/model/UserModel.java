package com.example.model;

import java.io.Serializable;

import lombok.Data;



@Data

public class UserModel implements Serializable{
	
		 private static final long serialVersionUID = 1L;
		 private int id;
		 private String name;
		 private String remaining;
		 private String day;
		 private String pass;
	
		 

	
}
