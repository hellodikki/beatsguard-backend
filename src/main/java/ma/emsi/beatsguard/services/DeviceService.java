package ma.emsi.beatsguard.services;

import ma.emsi.beatsguard.entities.Device;
import ma.emsi.beatsguard.entities.User;
import ma.emsi.beatsguard.repositories.DeviceRepository;
import ma.emsi.beatsguard.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
public class DeviceService {

    @Autowired
    private DeviceRepository deviceRepository;

    @Autowired
    private UserRepository userRepository;

    public Device addDevice(Long userId, Device device) {
        User user = userRepository.findById(userId).orElse(null);
        if (user == null) {
            throw new IllegalArgumentException("User with ID " + userId + " not found");
        }
        device.setUser(user);
        return deviceRepository.save(device);
    }

    public List<Device> getDevicesByUser(Long userId) {
        User user = userRepository.findById(userId).orElse(null);
        if (user == null) {
            throw new IllegalArgumentException("User with ID " + userId + " not found");
        }
        return deviceRepository.findByUser(user);
    }

    public void removeDevice(Long deviceId) {
        if (!deviceRepository.existsById(deviceId)) {
            throw new IllegalArgumentException("Device with ID " + deviceId + " not found");
        }
        deviceRepository.deleteById(deviceId);
    }
}
