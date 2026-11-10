package st2apr.workshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import st2apr.workshop.model.Programmer;

public interface ProgrammerRepository extends JpaRepository<Programmer, Long> { }