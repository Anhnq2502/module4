package com.example.service.impl;

import com.example.models.Dictionary;
import com.example.repository.impl.DictionaryRepository;
import org.springframework.ui.Model;

import java.util.List;


public class DictionaryService implements com.example.services.IDictionaryService {
    DictionaryRepository repository = new DictionaryRepository();
    @Override
    public List<Dictionary> findAll(String keyword) {
        Model model = null;
        List<Dictionary> dictionaries = this.repository.findAll();
        for (int i = 0; i < dictionaries.size(); i++) {
            if (keyword.equalsIgnoreCase(dictionaries.get(i).getEn())) {
                model.addAttribute("word", dictionaries.get(i).getVn());
                model.addAttribute("key", keyword);
            }
        }
        return repository.findAll();
    }
}
