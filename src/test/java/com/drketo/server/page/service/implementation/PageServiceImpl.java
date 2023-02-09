package com.drketo.server.page.service.implementation;

import java.util.Collection;

import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.drketo.server.page.model.Page;
import com.drketo.server.page.repo.PageRepo;
import com.drketo.server.page.service.PageService;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Transactional
@RequiredArgsConstructor
@Slf4j
public class PageServiceImpl implements PageService {

  private final PageRepo pageRepo;

  @Override
  public Page create(Page page) {
    log.info("create page {}", page);
    return pageRepo.save(page);
  }

  @Override
  public Page get(Long id) {
    log.info("get page {}", id);
    return pageRepo.findById(id).orElse(null);
  }

  @Override
  public Collection<Page> list(int limit) {
    log.info("list pages {}", limit);
    return pageRepo.findAll(PageRequest.of(0, limit)).toList();
  }

  @Override
  public Page update(Page page) {
    log.info("update page {}", page);
    Page existingPage = pageRepo.findById(page.getId()).orElse(null);
    if (existingPage != null) {
      return pageRepo.save(page);
    }
    return existingPage;
  }

  @Override
  public Boolean delete(Long id) {
    log.info("delete page {}", id);
    pageRepo.deleteById(id);
    return true;
  }

}
