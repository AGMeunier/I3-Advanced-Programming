package st2apr.workshop.service;

import org.springframework.stereotype.Service;
import st2apr.workshop.model.Programmer;
import st2apr.workshop.repository.ProgrammerRepository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class ProgrammerService {
    private final ProgrammerRepository programmerRepository;

    public ProgrammerService(ProgrammerRepository programmerRepository) {
        this.programmerRepository = programmerRepository;
    }

    public List<Programmer> getAllProgrammers() {
        return programmerRepository.findAll();
    }

    public Optional<Programmer> getProgrammerByID(long i) {
        return programmerRepository.findById(i);
    }

    public void deleteProgrammerByID(long id) {
        programmerRepository.deleteById(id);
    }

    public void createProgrammer(Programmer programmer) {
        programmerRepository.saveAndFlush(programmer);
    }

    public void updateProgrammer(long id, Programmer programmer) {
        Programmer p = programmerRepository.findById(id)
                .orElseThrow();

        p.setLastName(programmer.getLastName());
        p.setFirstName(programmer.getFirstName());
        p.setAddress(programmer.getAddress());
        p.setExpertiseLanguage(programmer.getExpertiseLanguage());
        p.setFavoriteBook(programmer.getFavoriteBook());
        p.setSalary(programmer.getSalary());

        programmerRepository.saveAndFlush(p);
    }
}
