package io.devbase.webservice;

import io.devbase.model.Developer;
import io.devbase.service.DeveloperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Guillaume Nostrenoff
 * @since 1/19/17
 */
@RestController
@RequestMapping("/developer")
public class DeveloperWebService {

  @Autowired
  private DeveloperService developerService;

  @RequestMapping(method = RequestMethod.POST, path = "/", consumes = {"application/json"}, produces = {"application/json"})
  @ResponseStatus(HttpStatus.OK)
  public ResponseEntity create(@RequestBody Developer developer) {
    return ResponseEntity.ok(developerService.create(developer));
  }

  @RequestMapping(method = RequestMethod.POST, path = "/{devId}/language/{lanIg}", consumes = {"application/json"}, produces = {"application/json"})
  @ResponseStatus(HttpStatus.OK)
  public ResponseEntity setLanguage(@PathVariable long devId, @PathVariable long langId) {
    return ResponseEntity.ok(developerService.setLanguage(langId, devId));
  }

  @RequestMapping(method = RequestMethod.GET, path = "/{langId}", produces = {"application/json"})
  @ResponseStatus(HttpStatus.OK)
  public ResponseEntity getByLanguage(@PathVariable long langId) {
    return ResponseEntity.ok(developerService.getByLanguageId(langId));
  }

  @RequestMapping(method = RequestMethod.GET, path = "/{langName}/languageName", produces = {"application/json"})
  @ResponseStatus(HttpStatus.OK)
  public ResponseEntity getByLanguageName(@PathVariable String langName) {
    return ResponseEntity.ok(developerService.getByLanguageName(langName));
  }

}
