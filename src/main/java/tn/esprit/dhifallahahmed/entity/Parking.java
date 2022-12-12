package tn.esprit.dhifallahahmed.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Parking implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idParking;
    private String designation;
    private String adresse;
    private int capacite;

    @OneToMany(mappedBy = "parking")
    private Set<Zone> zones;
}
