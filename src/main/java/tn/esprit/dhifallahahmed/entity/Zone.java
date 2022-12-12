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
public class Zone implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idZone;
    private String ref;
    private float dimension;

    @ManyToOne
    private Parking parking;
    @OneToMany
    private Set<Personnel> personnels;
    @OneToOne(mappedBy = "zone")
    private Personnel personnel;
}
