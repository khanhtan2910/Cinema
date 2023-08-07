package com.assignment.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Calendar {
	Integer day;
	Integer month;
	Integer year;
	String dayName;
	Integer index;
}
