package ma.emsi.beatsguard.controllers;

import lombok.RequiredArgsConstructor;
import ma.emsi.beatsguard.entities.Measurement;
import ma.emsi.beatsguard.services.MeasurementService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/measurements")
@RequiredArgsConstructor
public class MeasurementController {

    private final MeasurementService measurementService;

    @PostMapping("/{userId}")
    public ResponseEntity<Measurement> create(@PathVariable Long userId, @RequestBody Measurement measurement) {
        return ResponseEntity.ok(measurementService.save(userId, measurement));
    }

    @GetMapping
    public ResponseEntity<List<Measurement>> getAll() {
        return ResponseEntity.ok(measurementService.findAll());
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Measurement>> getByUserId(@PathVariable Long userId) {
        return ResponseEntity.ok(measurementService.findByUserId(userId));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Measurement> getById(@PathVariable Long id) {
        return measurementService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (!measurementService.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        measurementService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}

