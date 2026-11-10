package st2apr.workshop.service;

import org.springframework.stereotype.Service;
import st2apr.workshop.model.Programmer;
import st2apr.workshop.repository.ProgrammerRepository;

import java.util.List;

@Service
public class ProgrammerService {
    private final ProgrammerRepository programmerRepository;

    public ProgrammerService(ProgrammerRepository programmerRepository) {
        this.programmerRepository = programmerRepository;
    }

    public List<Programmer> getAllProgrammers() {
        return programmerRepository.findAll();
    }
}
