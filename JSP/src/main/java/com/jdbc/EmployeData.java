package com.jdbc;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class EmployeData {
	//
	private int id;
	private String name;
	private Date joiningDate;
	private double salary;
	private String email;
	private String phoneNumber;
	private String role;

}