package api.dvd.controllers;

import api.dvd.dtos.DvdDto;
import api.dvd.models.Dvd;
import api.dvd.services.DvdService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/dvd")
public class DvdController {

    final DvdService dvdService;

    public DvdController(DvdService dvdService) {
        this.dvdService = dvdService;
    }

    @PostMapping
    public ResponseEntity<Object> saveDvd(@RequestBody @Valid DvdDto dvdDto) {
        var dvd = new Dvd();
        BeanUtils.copyProperties(dvdDto, dvd);
        return ResponseEntity.status(HttpStatus.CREATED).body(dvdService.save(dvd));
    }

    @GetMapping
    public ResponseEntity<List<Dvd>> getAllDvd(){
        return ResponseEntity.status(HttpStatus.OK).body(dvdService.findAll());
    }

    @GetMapping("/{id}")
    public  ResponseEntity<Object> getOneDvd(@PathVariable(value = "id") UUID id){
        Optional<Dvd> dvdModelOptional = dvdService.findById(id);
        if(!dvdModelOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Dvd não encontrado!");
        }
        return ResponseEntity.status(HttpStatus.OK).body(dvdModelOptional.get());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updatePlanejamento(@PathVariable(value = "id") UUID id,
                                                     @RequestBody @Valid DvdDto dvdDto){
        Optional<Dvd> dvdModelOptional = dvdService.findById(id);
        if(!dvdModelOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Dvd não encontrado!");
        }
        var dvd = new Dvd();
        BeanUtils.copyProperties(dvdDto, dvd);
        dvd.setId(dvdModelOptional.get().getId());
        return ResponseEntity.status(HttpStatus.OK).body(dvdService.save(dvd));
    }



}
