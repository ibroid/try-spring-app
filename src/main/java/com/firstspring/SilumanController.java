package com.firstspring;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.firstspring.entity.Siluman;
import com.firstspring.services.SilumanService;

@RestController
@RequestMapping("/siluman")
public class SilumanController {

    @Autowired
    private SilumanService silumanService;

    @GetMapping()
    public Iterable<Siluman> index() {
        return silumanService.findAll();
    }

    @PostMapping()
    public Siluman create(@RequestBody Siluman siluman) {
        return silumanService.create(siluman);
    }

    @GetMapping("/{id}")
    public Optional<Siluman> findOne(@PathVariable("id") int id) {
        return silumanService.findOne(id);
    }

    @PutMapping()
    public Siluman updateOne(@RequestBody Siluman siluman) {
        return silumanService.updateOne(siluman);
    }

    @DeleteMapping("/{id}")
    public String deleteOne(@PathVariable("id") int id) {
        return silumanService.deleteOne(id);
    }
}
