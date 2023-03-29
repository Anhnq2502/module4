package com.example.services;

import com.example.models.Dictionary;

import java.util.List;

public interface IDictionaryService {
    List<Dictionary> findAll(String keyword);
}
