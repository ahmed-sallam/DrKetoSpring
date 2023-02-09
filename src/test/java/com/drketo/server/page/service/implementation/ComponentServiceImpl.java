package com.drketo.server.page.service.implementation;

import java.util.Collection;

import org.springframework.stereotype.Service;

import com.drketo.server.page.model.Component;
import com.drketo.server.page.repo.ComponentRepo;
import com.drketo.server.page.service.ComponentService;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Transactional
@RequiredArgsConstructor
@Slf4j
public class ComponentServiceImpl implements ComponentService {

  private final ComponentRepo componentRepo;

  @Override
  public Component create(Component component) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Component get(Long id) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Collection<Component> list(int limit) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Component update(Component component) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Boolean delete(Long id) {
    // TODO Auto-generated method stub
    return null;
  }

}
