package com.marlim.marlim_email_sender.services;

import java.util.List;

import com.marlim.marlim_email_sender.models.MarlimAccess;
import com.marlim.marlim_email_sender.repositories.AcessoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccessService {

    @Autowired
    private AcessoRepository repo;

    public List<MarlimAccess> getAllAccess() {
        return repo.findAll();
    }

    public MarlimAccess addAccess(MarlimAccess access) {
        return repo.save(access);
    }
}
