package udemy.spring.jokes.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import udemy.spring.jokes.service.JokeService;

@Controller
@AllArgsConstructor
public class JokeController {
    private final JokeService jokeService;

    @GetMapping({"", "/"})
    public String showJoke(Model model) {
        model.addAttribute("joke", jokeService.getJoke());
        return "index";
    }
}
