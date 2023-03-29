package com.example.repository;

import org.springframework.stereotype.Repository;

@Repository
public interface IMailBoxRepository {
    public String[] languages();

    public Integer[] pageSizes();
}
