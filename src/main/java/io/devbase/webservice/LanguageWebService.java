package io.devbase.webservice;

import io.devbase.model.Language;
import io.devbase.service.LanguageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/language")
public class LanguageWebService {

  @Autowired
  private LanguageService languageService;

  @RequestMapping(method = RequestMethod.GET, path = "{id}", produces = {"application/json"})
  @ResponseStatus(HttpStatus.OK)
  public ResponseEntity get(@PathVariable long id) {
    return ResponseEntity.ok(languageService.getById(id));
  }

  @RequestMapping(method = RequestMethod.POST, consumes = {"application/json"}, produces = {"application/json"})
  @ResponseStatus(HttpStatus.OK)
  public ResponseEntity create(@RequestBody Language language) {
    return ResponseEntity.ok(languageService.create(language));
  }

}
