package com.marlim.marlim_email_sender.controllers;

import com.marlim.marlim_email_sender.models.MarlimLocation;
import com.marlim.marlim_email_sender.services.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "api/v1")
public class LocationController {

    @Autowired
    private LocationService service;

    @GetMapping(path = "/location")
    public ResponseEntity<?> getAllLocation() {
        List<MarlimLocation> allLocation = service.getAllLocation();
        return ResponseEntity.ok().body(allLocation);
    }

    @PostMapping(path = "/location")
    public ResponseEntity<?> addLocation(@RequestBody MarlimLocation entry) {
        MarlimLocation location = service.addLocation(entry);
        return ResponseEntity.ok().body(location);
    }

}
