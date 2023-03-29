package com.example.service.impl;

import com.example.repository.impl.MailBoxRepository;
import com.example.service.IMailBoxService;
import org.springframework.stereotype.Service;

@Service
public class MailBoxService implements IMailBoxService {
    private final MailBoxRepository mailBoxRepository;

    public MailBoxService(MailBoxRepository mailBoxRepository) {
        this.mailBoxRepository = mailBoxRepository;
    }

    @Override
    public String[] languages() {
        return mailBoxRepository.languages();
    }

    @Override
    public Integer[] pageSizes() {
        return mailBoxRepository.pageSizes();
    }
}
