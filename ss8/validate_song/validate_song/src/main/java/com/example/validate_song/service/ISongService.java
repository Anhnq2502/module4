package com.example.validate_song.service;

import com.example.validate_song.model.Song;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface ISongService {
    Page<Song> getAll(PageRequest pageRequest);
    Song update(Song song);
    void delete(Integer id, Song song);
    Song getSongById(Integer id);
    Song save(Song song);
    Page<Song> findByName(PageRequest pageRequest);
}
