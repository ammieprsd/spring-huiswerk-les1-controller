package nl.novi.springles1controller.repositories;

import nl.novi.springles1controller.models.Televisions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TelevisionRepository extends JpaRepository<Televisions, Long> {
}
