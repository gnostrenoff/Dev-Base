package io.devbase.dao;

import io.devbase.model.Developer;
import io.devbase.model.Language;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeveloperDao extends CrudRepository<Developer, Long> {

  List<Developer> findByLanguage(Language language);
}
