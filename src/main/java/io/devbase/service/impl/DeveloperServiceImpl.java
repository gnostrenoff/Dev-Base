package io.devbase.service.impl;

import io.devbase.dao.DeveloperDao;
import io.devbase.dao.LanguageDao;
import io.devbase.model.Developer;
import io.devbase.service.DeveloperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeveloperServiceImpl implements DeveloperService {

  @Autowired
  private DeveloperDao developerDao;

  @Autowired
  private LanguageDao languageDao;

  @Override
  public Developer create(Developer developer) {
    return developerDao.save(developer);
  }

  @Override
  public Developer setLanguage(long languageId, long developerId) {
    Developer developer = developerDao.findOne(developerId);
    developer.setLanguage(languageDao.findOne(languageId));
    return developerDao.save(developer);
  }

  @Override
  public List<Developer> getByLanguageId(long id) {
    return developerDao.findByLanguage(languageDao.findOne(id));
  }

  @Override
  public List<Developer> getByLanguageName(String name) {
    return developerDao.findByLanguage(languageDao.findOneByName(name));
  }
}
