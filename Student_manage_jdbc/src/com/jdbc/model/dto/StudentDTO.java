package com.jdbc.model.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StudentDTO {
	private final int studentNo;
	private final String studentName;
	private final int age;
	private final char gender;
	private final String major;
	private final String email;
}
