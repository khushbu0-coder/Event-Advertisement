package ca.sheridancollege.khushbu0.beans;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Ticket {
	
	private String name;
	private long id;
	private int age;
	private String campus;
	private String faculty;
	private double price;
	
	private String[] campusName = {"Davis", "HMC", "TRAFALGAR"};
	private String[] facultyPos = {"Student", "Employee", "Alumni"};
	
}