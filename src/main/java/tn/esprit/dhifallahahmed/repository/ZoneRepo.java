package tn.esprit.dhifallahahmed.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.dhifallahahmed.entity.Zone;
@Repository
public interface ZoneRepo extends JpaRepository<Zone,Integer> {

}
