package ma.emsi.beatsguard.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "measurements")
public class Measurement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double avgBpm;

    private Double avgSpO2;

    private Double avgTemp;

    private Double avgHumidity;

    @Basic(optional = false)
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime time;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
}
