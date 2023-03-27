package com.example.services;

import com.example.models.Dictionary;
import com.example.repository.DictionaryRepositoryImpl;
import java.util.List;


public class DictionaryServiceImpl implements IDictionaryService {
    DictionaryRepositoryImpl repository = new DictionaryRepositoryImpl();
    @Override
    public List<Dictionary> findAll() {
        return repository.findAll();
    }
}
