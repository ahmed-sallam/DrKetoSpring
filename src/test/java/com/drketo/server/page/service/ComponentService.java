package com.drketo.server.page.service;

import java.util.Collection;

import com.drketo.server.page.model.Component;

public interface ComponentService {
  Component create(Component component);

  Component get(Long id);

  Collection<Component> list(int limit);

  Component update(Component component);

  Boolean delete(Long id);

}
