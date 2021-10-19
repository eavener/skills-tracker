package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FormController {

    @GetMapping("form")
    @ResponseBody
    public String FormPage() {
        String html =
                "<html>" +
                        "<body>" +
                        "<form method = 'post' action = '/form'>" +
                        "<label for=name>Enter your name:</label>" +
                        "<input type = 'text' name = 'coder' />" +
                        "<p></p>"+

                        "<label for=language>Choose your favorite language:</label>" +
                        "<select name=firstLanguage id=language>" +
                        "<option value=Java>Java</option>" +
                        "<option value=JavaScript>JavaScript</option>" +
                        "<option value=Python>Python</option>" +
                        "</select>" +
                        "<p></p>"+

                        "<label for=language>Choose your second favorite language:</label>" +
                        "<select name=secondLanguage id=language>" +
                        "<option value=Java>Java</option>" +
                        "<option value=JavaScript>JavaScript</option>" +
                        "<option value=Python>Python</option>" +
                        "</select>" +
                        "<p></p>"+

                        "<label for=language>Choose your third favorite language:</label>" +
                        "<select name=thirdLanguage id=language>" +
                        "<option value=Java>Java</option>" +
                        "<option value=JavaScript>JavaScript</option>" +
                        "<option value=Python>Python</option>" +
                        "</select>" +
                        "<p></p>"+

                        "<input type = 'submit' value = 'Submit!' />" +
                        "</form>"+
                        "</body>"+
                        "</html>";
        return html;

    }

    @PostMapping("form")
    @ResponseBody
    public String hello(@RequestParam String coder, @RequestParam String firstLanguage, @RequestParam String secondLanguage, @RequestParam String thirdLanguage) {
        return "<html>" +
                "Hello, " + coder + "! Here are your language choices: " +
                "<p></p>"+
                "1. " + firstLanguage +
                "<p></p>"+
                "2. " + secondLanguage +
                "<p></p>"+
                "3. " + thirdLanguage +
                "</html>";

    }
}
