package ma.emsi.beatsguard.repositories;

import ma.emsi.beatsguard.entities.Measurement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MeasurementRepository extends JpaRepository<Measurement, Long> {
    List<Measurement> findByUserId(Long userId);

}

