package com.xworkz.project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "project")
public class ProjectEntity {
	@GenericGenerator(name="BUS",strategy = "increment")
	@GeneratedValue(generator = "BUS")
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "phone")
	private String phone;
	@Column(name = "company")
	private String company;
	@Column(name = "email")
	private String email;
	@Column(name = "about")
	private String project;
}
