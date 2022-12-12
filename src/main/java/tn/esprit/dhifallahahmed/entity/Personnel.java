package tn.esprit.dhifallahahmed.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Personnel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPersonnel;
    private String nom;
    private String prenom;
    private int age;
    @Temporal(TemporalType.DATE)
    private Date dateDeRecrutement;
    private String login;
    private String password;
    @Enumerated(EnumType.STRING)
    private Poste poste;

    @OneToOne
    private Zone zone;

}
