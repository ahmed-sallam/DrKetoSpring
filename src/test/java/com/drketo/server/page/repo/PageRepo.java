package com.drketo.server.page.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.drketo.server.page.model.Page;

public interface PageRepo extends JpaRepository<Page, Long> {

}
