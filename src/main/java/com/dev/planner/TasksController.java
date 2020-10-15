package com.dev.planner;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class TasksController {
  
  @RequestMapping("/tasks")
  public String index() {
    return "Tasks";
  }
}
