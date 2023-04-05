package com.example.validate_song.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name", columnDefinition = "varchar(50)")
    @NotBlank(message = "Không được để trống tên bài hát")
    @Size(max = 800, message = "Không được quá 800 ký tự")
    private String name;
    @Column(name = "song_type", columnDefinition = "varchar(50)")
    @NotBlank(message = "Không được để trống tên loại nhạc")
    @Size(max = 1000, message = "Không được quá 1000 ký tự")
    private String songType;
    @Column(name = "musician", columnDefinition = "varchar(50)")
    @NotBlank(message = "Không được để trống tên nhạc sĩ")
    @Size(max = 300, message = "Không được quá 300 ký tự")
    private String musician;
    @Column(name = "singer",columnDefinition = "varchar(50)")
    @NotBlank(message = "Không được để trống tên ca sĩ trình bày")
    @Size(max = 300, message = "Không được quá 300 ký tự")
    private String singer;
    @Column(name = "composition_day", columnDefinition = "varchar(50)")
    @NotBlank(message = "Không được để trống ngày sáng tác")
    private String compositionDay;

    public Song() {
    }

    public Song(Integer id, String name, String songType, String musician, String singer, String compositionDay) {
        this.id = id;
        this.name = name;
        this.songType = songType;
        this.musician = musician;
        this.singer = singer;
        this.compositionDay = compositionDay;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSongType() {
        return songType;
    }

    public void setSongType(String songType) {
        this.songType = songType;
    }

    public String getMusician() {
        return musician;
    }

    public void setMusician(String musician) {
        this.musician = musician;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getCompositionDay() {
        return compositionDay;
    }

    public void setCompositionDay(String compositionDay) {
        this.compositionDay = compositionDay;
    }
}
