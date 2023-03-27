package com.example.repository;

import com.example.models.Dictionary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DictionaryRepository implements IDictionaryRepository{
    private static Map<Integer, Dictionary> dictionaryMap = new HashMap<>();

    static {
        dictionaryMap.put(1, new Dictionary("hello", "xin chào"));
        dictionaryMap.put(2, new Dictionary("dog", "con chó"));
        dictionaryMap.put(3, new Dictionary("cat", "con mèo"));
        dictionaryMap.put(4, new Dictionary("goodbye", "tạm biệt"));
        dictionaryMap.put(5, new Dictionary("rat", "con chuột"));
    }
    @Override
    public List<Dictionary> findAll() {
        return new ArrayList<>(dictionaryMap.values());
    }
}
