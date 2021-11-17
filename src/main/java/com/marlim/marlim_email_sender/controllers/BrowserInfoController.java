package com.marlim.marlim_email_sender.controllers;

import com.marlim.marlim_email_sender.models.MarlimBrowserInfo;
import com.marlim.marlim_email_sender.services.BrowserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "api/v1")
public class BrowserInfoController {

    @Autowired
    private BrowserInfoService service;

    @GetMapping(path = "/browserinfo")
    public ResponseEntity<?> getAllAccess() {
        List<MarlimBrowserInfo> allInfo = service.getAllBrowserInfo();
        return ResponseEntity.ok().body(allInfo);
    }

    @PostMapping(path = "/browserinfo")
    public ResponseEntity<?> addBrowserInfo(@RequestBody MarlimBrowserInfo entry) {
        MarlimBrowserInfo info = service.addBrowserInfo(entry);
        return ResponseEntity.ok().body(info);
    }

}
