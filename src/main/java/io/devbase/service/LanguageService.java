package io.devbase.service;

import io.devbase.model.Language;

public interface LanguageService {

  /**
   * get a language by Id.
   *
   * @param id the id
   * @return the language
   */
  Language getById(long id);

  /**
   * Create a Language.
   *
   * @param language the language to create
   * @return the language created
   */
  Language create(Language language);

}
