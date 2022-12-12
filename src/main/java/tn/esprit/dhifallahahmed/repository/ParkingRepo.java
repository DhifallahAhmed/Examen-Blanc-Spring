package tn.esprit.dhifallahahmed.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.dhifallahahmed.entity.Parking;
@Repository
public interface ParkingRepo extends JpaRepository<Parking,Integer> {
}
