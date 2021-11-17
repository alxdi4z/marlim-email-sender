package com.marlim.marlim_email_sender.services;

import com.marlim.marlim_email_sender.models.MarlimBrowserInfo;
import com.marlim.marlim_email_sender.repositories.BrowserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrowserInfoService {

    @Autowired
    private BrowserInfoRepository repo;

    public List<MarlimBrowserInfo> getAllBrowserInfo() {
        return repo.findAll();
    }

    public MarlimBrowserInfo addBrowserInfo(MarlimBrowserInfo info) {
        return repo.save(info);
    }
}
