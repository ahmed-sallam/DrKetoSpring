package com.drketo.server.user.model;

import static jakarta.persistence.GenerationType.AUTO;

import com.drketo.server.user.enumeration.UserRoles;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class User {
  @Id
  @GeneratedValue(strategy = AUTO)
  private Long id;
  private String firstName;
  private String lastName;
  @Column(unique = true)
  @NotEmpty(message = "Email cannot be empty or null!")
  private String email;
  private String password;
  private String salt;
  private UserRoles role;

}
