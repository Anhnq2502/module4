package com.example.repository;

import com.example.models.Dictionary;

import java.util.List;

public interface IDictionaryRepository {
    List<Dictionary> findAll();
}
