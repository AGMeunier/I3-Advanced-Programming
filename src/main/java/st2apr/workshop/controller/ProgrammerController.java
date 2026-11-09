package st2apr.workshop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import st2apr.workshop.model.Programmer;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/programmers")
public class ProgrammerController {

    @GetMapping()
    List<Programmer> getProgrammers() {
        return List.of(new Programmer(
                1L,
                "Tsukimura",
                "Temari",
                "Kyoto",
                "Python",
                "iDOLM@STER",
                new BigDecimal(1_000_000_000)
        ), new Programmer(
                2L,
                "Hanami",
                "Saki",
                "Aichi",
                "JavaSript",
                "Uma Musume Cinderella Gray",
                new BigDecimal(3_000_000_000L)
        ));
    }
}
