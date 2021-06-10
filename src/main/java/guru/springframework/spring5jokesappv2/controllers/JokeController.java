package guru.springframework.spring5jokesappv2.controllers;

import guru.springframework.spring5jokesappv2.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {
    private final JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""})  //Map either path to index
    public String showJoke(Model model) {
        // Models are used for thymeleaf rendering. They are essentially maps.
        model.addAttribute("joke", jokeService.getJoke());
        return "index"; //Implement index view
    }
}
