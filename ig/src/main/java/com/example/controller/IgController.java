package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IgController {
  @GetMapping("/ig/hello")
  public String hello() {
    return "Hello, From IG!";
  }
}
