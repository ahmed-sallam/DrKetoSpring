package com.drketo.server.page.model;

import static jakarta.persistence.GenerationType.AUTO;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "pages")
public class Page {

  @Id
  @GeneratedValue(strategy = AUTO)
  private Long id;
  private String title;

  @OneToMany(mappedBy = "page")
  private final Set<Component> components = new HashSet<>();
}
