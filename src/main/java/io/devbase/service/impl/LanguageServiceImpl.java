package io.devbase.service.impl;

import io.devbase.dao.LanguageDao;
import io.devbase.model.Language;
import io.devbase.service.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LanguageServiceImpl implements LanguageService {

  @Autowired
  private LanguageDao languageDao;

  @Override
  public Language getById(long id) {
    return languageDao.findOne(id);
  }

  @Override
  public Language create(Language language) {
    return languageDao.save(language);
  }
}
