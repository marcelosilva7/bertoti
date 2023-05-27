package api.dvd.services;

import api.dvd.models.Dvd;
import api.dvd.repositories.DvdRepository;
import jakarta.transaction.Transactional;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class DvdService {

    final DvdRepository dvdRepository;

    public DvdService(DvdRepository dvdRepository) {
        this.dvdRepository = dvdRepository;
    }

    @Transactional
    public Dvd save(Dvd dvd) {
        return dvdRepository.save(dvd);
    }


    public List<Dvd> findAll() {
        return dvdRepository.findAll();
    }

    public Optional<Dvd> findById(UUID id) {
        return dvdRepository.findById(id);
    }

    @Transactional
    public void delete(Dvd dvd) {
        dvdRepository.delete(dvd);
    }


}
