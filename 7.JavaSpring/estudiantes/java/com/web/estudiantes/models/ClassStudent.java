package com.web.estudiantes.models;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="classes_students")
public class ClassStudent {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="student_id")
	private Student student;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="class_id")
	private _Class _class;
	
	public ClassStudent() {}
	public ClassStudent(Student student, _Class _class) {
		super();
		this.student = student;
		this._class = _class;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public _Class get_class() {
		return _class;
	}

	public void set_class(_Class _class) {
		this._class = _class;
	}
	
}



