package net.coru.targetapp.controller;

import net.coru.targetapp.config.CustomConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/configs")
@RestController
public class ConfigController {

  @Autowired
  private CustomConfig config;

  @GetMapping
  public ResponseEntity<ResponseData> getConfigurations() {

      return ResponseEntity.ok(
          ResponseData
              .builder()
              .property1(config.getProperty1())
              .property2(config.getProperty2())
              .property3(config.getProperty3())
              .build()
      );
  }
}
