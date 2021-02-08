package com.project.bookzy;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class Controller {

        @RequestMapping("/bookzy")
        public String index() {
                return "Welcome to the Bookzy web app!";
        }

}
