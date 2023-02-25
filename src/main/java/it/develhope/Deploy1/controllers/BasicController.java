package it.develhope.Deploy1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Drumstyle92
 * Controller class to be able to use the CRUD of the program
 */
@RestController
@RequestMapping("/devname")
public class BasicController {

    /**
     * Instance self-managed by Spring to be able to take advantage of the methods for managing the chosen environment
     */
    @Autowired
    private Environment environment;

    /**
     * @return It also comes back with a jar file deployed my screen name
     * Get method which displays the name with a path with environment variable
     */
    @GetMapping
   public String getName(){

       return environment.getProperty("myCustomEnvs.devName");

   }

}
