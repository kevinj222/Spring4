package com.example.JpaManytoMany.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="STUDENT_TBL")
public class Student 
{
	@Id
	@GeneratedValue
	private Long Id;
	private String name;
	private int age;
	private String dept;
	@ManyToMany()
	@JoinTable(name="STUDENT_COURSE_TABLE",
	joinColumns= {
			 	@JoinColumn(name="student_id", referencedColumnName="id")
				},
	inverseJoinColumns= {
				@JoinColumn(name="course_id" , referencedColumnName="id")
				}
				)
	@JsonBackReference
	private Set<Course> course;
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Set<Course> getCourse() {
		return course;
	}
	public void setCourse(Set<Course> course) {
		this.course = course;
	}
	public Student(Long id, String name, int age, String dept, Set<Course> course) {
		
		Id = id;
		this.name = name;
		this.age = age;
		this.dept = dept;
		this.course = course;
	}
	public Student() {
		
	}
	
}
