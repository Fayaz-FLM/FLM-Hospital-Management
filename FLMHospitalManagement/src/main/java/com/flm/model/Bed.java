package com.flm.model;
import java.util.List;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "beds")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bed {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bedId;
    
    @Column(name = "bed_number" , nullable = false)
    private String bedNumber; 
    
    @Column(name = "is_occupied")
    private Boolean isOccupied = false; // True if the bed is currently occupied

    @ManyToOne
    @JoinColumn(name = "room_id", nullable = false)
    private Room room; // Associated room for this bed

    @ManyToOne
    @JoinColumn(name = "patient_id", nullable = true)
    private Patient patient; // Currently assigned patient (nullable)

    @OneToMany(mappedBy = "bed", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<BedAssignmentHistory> assignmentHistories; // List of assignment records

}
