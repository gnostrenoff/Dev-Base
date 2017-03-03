package io.devbase.service;

import io.devbase.model.Language;

public interface LanguageService {

  Language getById(long id);

  Language create(Language language);

}
