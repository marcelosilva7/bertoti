package api.dvd.repositories;

import api.dvd.models.Dvd;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface DvdRepository  extends JpaRepository<Dvd, UUID> {
}
