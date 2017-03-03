package io.devbase.service;

import io.devbase.model.Developer;

import java.util.List;

public interface DeveloperService {

  Developer getById(long id);

  Developer create(Developer developer);

  Developer setLanguage(long languageId, long developerId);

  List<Developer> getByLanguageId(long id);

}
