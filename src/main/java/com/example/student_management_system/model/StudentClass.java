package com.example.student_management_system.model;

import java.time.LocalTime;
import java.time.LocalDate;

public class StudentClass {
	
	//properties
	private Long batchId;
	private String batchName;
	private LocalTime batchTiming;
	private LocalDate batchStartDate;
	private LocalDate batchEndDate;
	private Integer durationOfBatch;
	private String description;
	public Long getBatchId() {
		return batchId;
	}
	public void setBatchId(Long batchId) {
		this.batchId = batchId;
	}
	public String getBatchName() {
		return batchName;
	}
	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}
	public LocalTime getBatchTiming() {
		return batchTiming;
	}
	public void setBatchTiming(LocalTime batchTiming) {
		this.batchTiming = batchTiming;
	}
	public LocalDate getBatchStartDate() {
		return batchStartDate;
	}
	public void setBatchStartDate(LocalDate batchStartDate) {
		this.batchStartDate = batchStartDate;
	}
	public LocalDate getBatchEndDate() {
		return batchEndDate;
	}
	public void setBatchEndDate(LocalDate batchEndDate) {
		this.batchEndDate = batchEndDate;
	}
	public Integer getDurationOfBatch() {
		return durationOfBatch;
	}
	public void setDurationOfBatch(Integer durationOfBatch) {
		this.durationOfBatch = durationOfBatch;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "StudentClass [batchId=" + batchId + ", batchName=" + batchName + ", durationOfBatch=" + durationOfBatch
				+ ", description=" + description + "]";
	}
	
	
}
