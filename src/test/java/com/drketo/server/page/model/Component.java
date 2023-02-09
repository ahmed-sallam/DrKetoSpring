package com.drketo.server.page.model;

import static jakarta.persistence.GenerationType.AUTO;

import java.util.Date;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "components")
public class Component {

  @Id
  @GeneratedValue(strategy = AUTO)
  private Long id;
  private String title;
  private String content;
  private String position;
  private Integer sorting;
  private Date updatedAt;

  @ManyToAny
  @JoinColumn(name = "page_id")
  private Page page;

}
