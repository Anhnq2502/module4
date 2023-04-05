package com.example.validate_song.repository;

import com.example.validate_song.model.Song;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ISongRepository extends PagingAndSortingRepository<Song,Integer> {
}
