package com.drketo.server.page.service;

import java.util.Collection;

import com.drketo.server.page.model.Page;

public interface PageService {

  Page create(Page page);

  Page get(Long id);

  Collection<Page> list(int limit);

  Page update(Page page);

  Boolean delete(Long id);

}
