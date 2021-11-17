package com.marlim.marlim_email_sender.repositories;

import com.marlim.marlim_email_sender.models.MarlimBrowserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrowserInfoRepository extends JpaRepository<MarlimBrowserInfo, Integer> {
    
}
