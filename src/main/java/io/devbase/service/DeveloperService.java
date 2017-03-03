package io.devbase.service;

import io.devbase.model.Developer;

import java.util.List;

public interface DeveloperService {

  /**
   * Create/update a developer.
   *
   * @param developer the developer
   * @return the developer created
   */
  Developer create(Developer developer);

  /**
   * Set th elanguage for a developper.
   *
   * @param languageId  the lang id
   * @param developerId the dev id
   * @return the developer updated
   */
  Developer setLanguage(long languageId, long developerId);

  /**
   * Get a list of developer for the given lang id.
   *
   * @param id the lang id
   * @return the list of dev
   */
  List<Developer> getByLanguageId(long id);

  /**
   * Get a list of developer for the given lang name.
   *
   * @param name the lang name
   * @return the list of dev
   */
  List<Developer> getByLanguageName(String name);

}
