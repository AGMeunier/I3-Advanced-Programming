package st2apr.workshop.controller;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import st2apr.workshop.model.Programmer;
import st2apr.workshop.service.ProgrammerService;

import java.util.List;
import java.util.Optional;

@RestController
@Transactional
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

    @GetMapping("/{id}")
    Optional<Programmer> getProgrammerByID(@PathVariable long id) {
        return programmerService.getProgrammerByID(id);
    }

    @DeleteMapping("/{id}")
    void deleteProgrammerByID(@PathVariable long id) {
        programmerService.deleteProgrammerByID(id);
    }

    @PostMapping()
    void createProgrammer(@RequestBody Programmer programmer) {
        programmerService.createProgrammer(programmer);
    }

    @PutMapping("/{id}")
    void updateProgrammer(@PathVariable long id, @RequestBody Programmer programmer) {
        programmerService.updateProgrammer(id, programmer);
    }

}
