package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller

public class SkillsController {
    @GetMapping
    @ResponseBody
    public String title() {
        return "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>Javascript</li>" +
                "<li>CSS</li>" +
                "</ol>";


    }
@GetMapping("form")
@ResponseBody
  public String name() {
        return "<html>" +
                "<body>" +
                "<label>Name:<form action='Name:' method='post'>" +
                "<input type='text' name='name'>" +
                "</label" +
                "</form>" +
                "<br>" +" <label>My Favorite Language" +
                "<select name='firstLang' id='firstLang>" +
                "<option value='Java'>Java</option>" +
                "<option value='Javascript'>Javascript</option>" +
                "<option value='CSS'>CSS</option>" +
                "</select>" +
                "</label> <br>" +
                "<label>My Second Favorite Language" +
                "<select name='secondLang' id='secondLang'>" +
                "<option value='Javascript'>Javascript</option>" +
                "<option value='Java'>Java</option>" +
                "<option value='CSS'>CSS</option>" +
                "</select>" +
                "</label> <br>" +
                "<label>My Third Favorite Language" +
                "<select name='thirdLang' id='thirdLang'>" +
                "<option value='Javascript'>Javascript</option>" +
                "<option value='Java'>Java</option>" +
                "<option value='CSS'>CSS</option>" +
                "</select>" +
                " </label> <br>" +
                "<input type='submit' value='Submit'>";

     }

@PostMapping("form")
@ResponseBody
public String processForm(@RequestParam String name,
                          @RequestParam String firstLang,
                          @RequestParam String secondLang,
                          @RequestParam String thirdLang) {
    return name + "\n" + firstLang + "\n" + secondLang + "\n" + thirdLang;
}
    }

