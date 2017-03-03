package io.devbase.service.impl;

import io.devbase.dao.DeveloperDao;
import io.devbase.dao.LanguageDao;
import io.devbase.model.Developer;
import io.devbase.service.DeveloperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Louis Amoros on 07/02/17.
 */
@Service
public class DeveloperServiceImpl implements DeveloperService {

  @Autowired
  private DeveloperDao developerDao;

  @Autowired
  private LanguageDao languageDao;

  @Override
  public Developer getById(long id) {
    return developerDao.findOne(id);
  }

  @Override
  public Developer create(Developer developer) {
    return developerDao.save(developer);
  }

  @Override
  public Developer setLanguage(long languageId, long developerId) {
    Developer developer = getById(developerId);
    developer.setLanguage(languageDao.findOne(languageId));
    return developerDao.save(developer);
  }

  @Override
  public List<Developer> getByLanguageId(long id) {
    return developerDao.findByLanguage(languageDao.findOne(id));
  }
}
