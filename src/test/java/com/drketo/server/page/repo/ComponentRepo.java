package com.drketo.server.page.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.drketo.server.page.model.Component;

public interface ComponentRepo extends JpaRepository<Component, Long> {

}
