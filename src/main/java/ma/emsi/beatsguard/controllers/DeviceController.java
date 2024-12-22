package ma.emsi.beatsguard.controllers;

import ma.emsi.beatsguard.entities.Device;
import ma.emsi.beatsguard.services.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/devices")
public class DeviceController {

    @Autowired
    private DeviceService deviceService;

    @PostMapping("/{userId}")
    public ResponseEntity<Device> addDevice(@PathVariable Long userId, @RequestBody Device device) {
        Device createdDevice = deviceService.addDevice(userId, device);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdDevice);
    }

    @GetMapping("/{userId}")
    public ResponseEntity<List<Device>> getDevices(@PathVariable Long userId) {
        return ResponseEntity.ok(deviceService.getDevicesByUser(userId));
    }

    @DeleteMapping("/{deviceId}")
    public ResponseEntity<Void> removeDevice(@PathVariable Long deviceId) {
        deviceService.removeDevice(deviceId);
        return ResponseEntity.noContent().build();
    }
}

