package com.devsuperior.dslearnbds.entities;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.Column;

public class Task extends Lesson implements Serializable {
	private static final long serialVersionUID = 1L;
	@Column(columnDefinition = "TEXT")
	private String description;
	private Integer questionCount;
	private Integer approvalCount;
	private Double weight;
	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant dueDate;
	
	public Task() {}

	public Task(Long id, String title, Integer position, Section section, String description, Integer questionCount,
			Integer approvalCount, Double weight, Instant dueDate) {
		super(id, title, position, section);
		this.description = description;
		this.questionCount = questionCount;
		this.approvalCount = approvalCount;
		this.weight = weight;
		this.dueDate = dueDate;
	}
	
	
}
