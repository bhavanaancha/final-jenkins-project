package com.epam.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class ReportRequestDTO {
	private String firstName;
	private String lastName;
	private int duration;
	private String userName;
	private LocalDate trainingDate;
	private boolean status;

}
