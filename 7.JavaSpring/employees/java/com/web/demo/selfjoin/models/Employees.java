package com.web.demo.selfjoin.models;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

import com.web.demo.selfjoin.services.emploRepo;


@Entity
@Table(name="employees")
public class Employees {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private Date createdAt;
    private Date updatedAt;
    
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
    name = "rel_emplo_manager", 
    joinColumns = @JoinColumn(name = "employ_id"), 
    inverseJoinColumns = @JoinColumn(name = "manager_id")
    )
    private List<Employees> employees;
    
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
    name = "rel_emplo_manager", 
    joinColumns = @JoinColumn(name = "manager_id"), 
    inverseJoinColumns = @JoinColumn(name = "employ_id")
    )
    private List<Employees> employRelation;
    
    

    public Employees(String firstName, String lastName) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
		}
    
		public Employees(List<Employees> friends, List<Employees> userFriends) {
			super();
			this.employees = friends;
			this.employRelation = userFriends;
		}

		public List<Employees> getFriends() {
        return employees;
    }
    public void setFriends(List<Employees> friends) {
        this.employees = friends;
    }
    public List<Employees> getUserFriends() {
        return employRelation;
    }
    public void setUserFriends(List<Employees> userFriends) {
        this.employRelation = userFriends;
    }    
    
    public void friends() {
      Employees user = emploRepo.findOne(Long.valueOf(1));
      System.out.println(user.getFriends());
      
      //Esto imprimirá el nombre del usuario 2 y 3. Todos los usuarios que son amigos de este usuario.  
      for(Employees u : user.getFriends()) {
          System.out.println(u.getFirstName());
      }
      
      // Esto solo imprimirá el nombre del usuario 2.
      for(Employees u : user.getUserFriends()) {
          System.out.println(u.getFirstName());
      }
    }
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
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
}
