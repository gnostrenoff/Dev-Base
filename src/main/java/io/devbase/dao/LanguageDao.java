package io.devbase.dao;

import io.devbase.model.Language;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LanguageDao extends CrudRepository<Language, Long> {

  Language findOneByName(String name);

}
