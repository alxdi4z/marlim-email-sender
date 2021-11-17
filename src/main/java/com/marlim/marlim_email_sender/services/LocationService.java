package com.marlim.marlim_email_sender.services;

import com.marlim.marlim_email_sender.models.MarlimLocation;
import com.marlim.marlim_email_sender.repositories.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationService {

    @Autowired
    private LocationRepository repo;

    public List<MarlimLocation> getAllLocation() {
        return repo.findAll();
    }

    public MarlimLocation addLocation(MarlimLocation info) {
        return repo.save(info);
    }
}
