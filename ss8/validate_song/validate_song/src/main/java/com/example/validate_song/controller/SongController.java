package com.example.validate_song.controller;

import com.example.validate_song.model.Song;
import com.example.validate_song.service.ISongService;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/song")
public class SongController {
    private final ISongService iSongService;

    public SongController(ISongService iSongService) {
        this.iSongService = iSongService;
    }

    @GetMapping("")
    public String list(Model model, @RequestParam(defaultValue = "0") int page) {
        Sort sort = Sort.by("id").descending();
        model.addAttribute("songs", iSongService.getAll(PageRequest.of(page, 2, sort)));
        return "/list";
    }

    @GetMapping("/create")
    public String showPageCreate(Model model) {
        model.addAttribute("song", new Song());
        return "/create";
    }

    @PostMapping("/create")
    public String create(Model model, Song song) {
        model.addAttribute("song", iSongService.save(song));
        return "redirect:/song";
    }

    @GetMapping("/update/{id}")
    public String showPageUpdate(Model model, @PathVariable Integer id) {
        model.addAttribute("song", iSongService.getSongById(id));
        return "/update";
    }

    @PostMapping("/update")
    public String update(Model model, Song song) {
        model.addAttribute("song", iSongService.update(song));
        return "/list";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam Integer id) {
        iSongService.delete(id, iSongService.getSongById(id));
        return "redirect:/song";
    }

    @GetMapping("/findByName")
    public String findByName(Model model) {
        return "/list";
    }
}
