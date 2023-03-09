package com.example.superhero_v4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //used instead of controller, restcontroller returns JSON whereas controller returns HTML
@RequestMapping(path = "/")
public class MyController {


}
