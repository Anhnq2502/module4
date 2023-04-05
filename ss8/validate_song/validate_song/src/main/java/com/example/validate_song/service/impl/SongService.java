package com.example.validate_song.service.impl;

import com.example.validate_song.model.Song;
import com.example.validate_song.repository.ISongRepository;
import com.example.validate_song.service.ISongService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class SongService implements ISongService {
    private final ISongRepository iSongRepository;

    public SongService(ISongRepository iSongRepository) {
        this.iSongRepository = iSongRepository;
    }

    @Override
    public Page<Song> getAll(PageRequest pageRequest) {
        return iSongRepository.findAll(pageRequest);
    }

    @Override
    public Song update(Song song) {
        return iSongRepository.save(song);
    }

    @Override
    public void delete(Integer id, Song song) {
        iSongRepository.delete(song);
    }

    @Override
    public Song getSongById(Integer id) {
        return iSongRepository.findById(id).get();
    }

    @Override
    public Song save(Song song) {
        return iSongRepository.save(song);
    }

    @Override
    public Page<Song> findByName(PageRequest pageRequest) {
        return null;
    }
}
