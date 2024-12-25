package ma.emsi.beatsguard.services;

import lombok.RequiredArgsConstructor;
import ma.emsi.beatsguard.entities.Measurement;
import ma.emsi.beatsguard.entities.User;
import ma.emsi.beatsguard.repositories.MeasurementRepository;
import ma.emsi.beatsguard.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MeasurementService {

    private final MeasurementRepository measurementRepository;

    private final UserRepository userRepository;

    public Measurement save(Long userId, Measurement measurement) {
        // Validate the user
        User user = userRepository.findById(userId).orElse(null);
        if (user == null) {
            throw new IllegalArgumentException("User with ID " + userId + " not found");
        }

        measurement.setUser(user);
        return measurementRepository.save(measurement);
    }

    public List<Measurement> findAll() {
        return measurementRepository.findAll();
    }

    public Optional<Measurement> findById(Long id) {
        return measurementRepository.findById(id);
    }

    public List<Measurement> findByUserId(Long userId) {
        return measurementRepository.findByUserId(userId);
    }

    public void deleteById(Long id) {
        measurementRepository.deleteById(id);
    }

    public boolean existsById(Long id) {
        return measurementRepository.existsById(id);
    }
}
