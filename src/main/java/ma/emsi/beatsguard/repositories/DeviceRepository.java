package ma.emsi.beatsguard.repositories;

import ma.emsi.beatsguard.entities.Device;
import ma.emsi.beatsguard.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeviceRepository extends JpaRepository<Device, Long> {
    List<Device> findByUser(User user);
}

