package Entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "fitness_data")
public class FitnessData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int healthScore;

    private int pulse;

    private int steps;

    private double latitude;   // широта

    private double longitude;  // довгота



    public FitnessData (int id, int healthScore, int pulse, int steps, double latitude ) {
        this.id = id;
        this.healthScore = healthScore;
        this.pulse = pulse;
        this.steps = steps;
        this.latitude = latitude;

    }

    public FitnessData () {

    }

}

