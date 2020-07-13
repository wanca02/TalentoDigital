package com.web.estudiantes.models;

import java.sql.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="classes")
public class _Class {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
  private String name;
  @ManyToMany(fetch = FetchType.LAZY)
  @JoinTable(
    name = "classes_students", 
    joinColumns = @JoinColumn(name = "class_id"), 
    inverseJoinColumns = @JoinColumn(name = "student_id")
  )
  private List<Student> students;
  
  public _Class() {}
	public _Class(String name) {
		super();
		this.name = name;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	

}








