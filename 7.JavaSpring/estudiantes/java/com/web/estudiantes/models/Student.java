package com.web.estudiantes.models;

import java.sql.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="students")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
  private String firstName;
  private String lastName;
  private Integer age;
  @Column(updatable=true)
  private Date createdAt;
  private Date updatedAt;
  @OneToOne(mappedBy="student", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
  private Contact contact;
  
  @OneToOne(mappedBy="student", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
  private DormStudent dormstudent;
  
  @ManyToMany(fetch = FetchType.LAZY)
  @JoinTable(
      name = "classes_students", 
      joinColumns = @JoinColumn(name = "student_id"), 
      inverseJoinColumns = @JoinColumn(name = "class_id")
    )
  private List<_Class> classes;
  
	public Student() {
	}
	public Student(String firstName, String lastName, Integer age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Contact getContact() {
		return contact;
	}
	public void setContact(Contact contact) {
		this.contact = contact;
	}
	public DormStudent getDormstudent() {
		return dormstudent;
	}
	public void setDormstudent(DormStudent dormstudent) {
		this.dormstudent = dormstudent;
	}
	public List<_Class> getClasses() {
		return classes;
	}
	public void setClasses(List<_Class> classes) {
		this.classes = classes;
	}
}














