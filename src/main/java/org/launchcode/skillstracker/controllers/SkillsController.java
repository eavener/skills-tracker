package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {
    @GetMapping
    public String welcomePage() {
        String html =
                "<html>" +
                        "<h1>Skills Tracker</h1>" +
                        "<h2>Programming Languages</h2>" +
                        "<ol><li>Java</li> <li>JavaScript</li> <li>Python</li></ol>" +
                        "</html>";
        return html;
    }
}
