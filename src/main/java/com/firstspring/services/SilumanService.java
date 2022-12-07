package com.firstspring.services;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.firstspring.entity.Siluman;
import com.firstspring.repo.SilumanRepository;

@Service
@Transactional
public class SilumanService {

    @Autowired
    private SilumanRepository silumanRepo;

    public Siluman create(Siluman siluman) {
        return silumanRepo.save(siluman);
    }

    public Iterable<Siluman> findAll() {
        return silumanRepo.findAll();
    }

    public Optional<Siluman> findOne(int id) {
        return silumanRepo.findById(id);
    }

    public Siluman updateOne(Siluman siluman) {
        return silumanRepo.save(siluman);
    }

    public String deleteOne(int id) {
        try {
            silumanRepo.deleteById(id);
            return "Delete Success";
        } catch (Exception e) {
            System.out.println("ada kesalahan :" + e.getMessage());
            return "Delete gagal";
        }
    }
}
