package com.jdbc;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class EmployeData {
	private int id;
	private String name;
	private Date joiningDate;
	private double salary;
	private String email;
	private String phoneNumber;
	private String role;

}