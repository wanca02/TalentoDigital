package com.web.repasoexamen.models;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Size;


@Entity
@Table(name="events")
public class Event {
	@Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Long id;
  @Size(min=2)
  private String name;
  private Date date;
  private String location;
  @Column(updatable=false)
  private java.util.Date createdAt;
  private java.util.Date updatedAt;
  
  @ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="user_id")
  private User user;
  
  @ManyToMany(fetch = FetchType.LAZY)
  @JoinTable(
    name = "users_events", 
    joinColumns = @JoinColumn(name = "event_id"), 
    inverseJoinColumns = @JoinColumn(name = "user_id")
  )
  private List<User> relausers;
  
  public Event() {}

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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
//otros getters y setters removidos para resumir.
  @PrePersist
  protected void onCreate(){
      this.createdAt = new java.util.Date();
  }
  @PreUpdate
  protected void onUpdate(){
      this.updatedAt = new java.util.Date();
  }
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

	public List<User> getRelausers() {
		return relausers;
	}

	public void setRelausers(List<User> relausers) {
		this.relausers = relausers;
	}
}
