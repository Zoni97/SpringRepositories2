package co.develhope.SpringRepositories2.repositories;

import co.develhope.SpringRepositories2.entities.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProgrammingLanguageRespository extends JpaRepository<ProgrammingLanguage, String> {
}
