package st2apr.workshop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import st2apr.workshop.model.Programmer;
import st2apr.workshop.service.ProgrammerService;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/programmers")
public class ProgrammerController {
    ProgrammerService programmerService;

    public ProgrammerController(ProgrammerService programmerService) {
        this.programmerService = programmerService;
    }

    @GetMapping()
    List<Programmer> getProgrammers() {
        return programmerService.getAllProgrammers();
    }
}
