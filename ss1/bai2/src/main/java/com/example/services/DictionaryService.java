package com.example.services;

import com.example.models.Dictionary;
import com.example.repository.DictionaryRepository;
import java.util.List;


public class DictionaryService implements IDictionaryService {
    DictionaryRepository repository = new DictionaryRepository();
    @Override
    public List<Dictionary> findAll() {
        return repository.findAll();
    }
}
