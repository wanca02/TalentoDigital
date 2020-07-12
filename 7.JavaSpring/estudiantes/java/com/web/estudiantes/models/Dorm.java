package com.web.estudiantes.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="dorms")
public class Dorm {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
  private String name;
  @OneToMany(mappedBy="dorm", fetch = FetchType.LAZY)
	private List<DormStudent> dormstudent;
  
  public Dorm() {}
	public Dorm(String name) {
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
	public List<DormStudent> getDormstudent() {
		return dormstudent;
	}
	public void setDormstudent(List<DormStudent> dormstudent) {
		this.dormstudent = dormstudent;
	}
  
  
}


















