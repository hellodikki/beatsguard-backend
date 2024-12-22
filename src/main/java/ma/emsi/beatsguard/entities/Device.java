package ma.emsi.beatsguard.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Device {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String type;
    private String deviceId;
    private LocalDateTime registeredAt;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}


