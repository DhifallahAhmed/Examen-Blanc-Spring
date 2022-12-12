package tn.esprit.dhifallahahmed.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.dhifallahahmed.entity.Personnel;

import java.util.Date;
import java.util.Set;

@Repository
public interface PersonnelRepo extends JpaRepository<Personnel,Integer> {
    int countByZoneIdZone(int idZone);
    Set<Personnel> getPersonnelByDateDeRecrutementBetween(Date startDate, Date endDate);

}
