package tn.esprit.dhifallahahmed.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.*;
import tn.esprit.dhifallahahmed.entity.Parking;
import tn.esprit.dhifallahahmed.entity.Personnel;

import tn.esprit.dhifallahahmed.entity.Zone;
import tn.esprit.dhifallahahmed.repository.ParkingRepo;
import tn.esprit.dhifallahahmed.repository.PersonnelRepo;
import tn.esprit.dhifallahahmed.repository.ZoneRepo;

import java.util.Date;
import java.util.Set;


@Slf4j
@RequestMapping("exam")
@RestController
public class ExamenController {
    @Autowired
    PersonnelRepo personnelRepo;
    @Autowired
    ZoneRepo zoneRepo;
    @Autowired
    ParkingRepo parkingRepo;

    @PostMapping("addpersonnel")
    public Personnel addClinique(@RequestBody Personnel personnel) {
        return personnelRepo.save(personnel);
    }
    @PostMapping("aff/{idzone}/{idGarde}")
    public void affecterPersonnelZone(@PathVariable int idzone, @PathVariable int idGarde) {
        Personnel personnel = personnelRepo.findById(idzone).orElse(null);
        Zone zone = zoneRepo.findById(idGarde).orElse(null);
        if (personnel!= null && zone !=null){
            zone.getPersonnels().add(personnel);
        }
    }
    @GetMapping
    public Set<Personnel> getPersonalByDate(@PathVariable @DateTimeFormat (pattern = "yyyy-MM-dd") Date startDate,
    @PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") Date endDate) {
    return personnelRepo.getPersonnelByDateDeRecrutementBetween(startDate,endDate);
    }
    @Scheduled(cron = "*/30 * * * * *")
    public void getNbrGardesBYZone(){
        //spersonnelRepo.countByZoneIdZone()

    }

}
