package com.klu.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
public class User {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 @Column(nullable=false, unique=true)
 private String username;
 @Column(nullable=false)
 private String password;
 @Column(nullable=false, unique=true)
 private String email;
 @Column(nullable=false)
 private String role;
 public User() {
  super();
  // TODO Auto-generated constructor stub
 }
 public User(Long id, String username, String password, String email, String role) {
  super();
  this.id = id;
  this.username = username;
  this.password = password;
  this.email = email;
  this.role = role;
 }
 public Long getId() {
  return id;
 }
 public void setId(Long id) {
  this.id = id;
 }
 public String getUsername() {
  return username;
 }
 public void setUsername(String username) {
  this.username = username;
 }
 public String getPassword() {
  return password;
 }
 public void setPassword(String password) {
  this.password = password;
 }
 public String getEmail() {
  return email;
 }
 public void setEmail(String email) {
  this.email = email;
 }
 public String getRole() {
  return role;
 }
 public void setRole(String role) {
  this.role = role;
 }
 @Override
 public String toString() {
	    return "User [id=" + id 
	        + ", username=" + username 
	        + ", password=" + password 
	        + ", email=" + email 
	        + ", role=" + role + "]";
        //+ ", getId()=" + getId() + ", getUsername()=" + getUsername() + ", getPassword()="
    //+ getPassword() + ", getEmail()=" + getEmail() + ", getRole()=" + getRole() + ", getClass()="
    //+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
 }

}