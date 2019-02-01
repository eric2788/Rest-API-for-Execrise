package com.ericlam.main.controllers;

import com.ericlam.main.dao.ClubRepository;
import com.ericlam.main.model.Club;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/club")
public class MainController {

    private final ClubRepository clubRepository;

    @Autowired
    public MainController(ClubRepository clubRepository) {
        this.clubRepository = clubRepository;
    }

    @GetMapping
    public @ResponseBody Iterable<Club> getAllMembers(){
        return clubRepository.findAll();
    }

    @PostMapping
    public Club createMembers(@RequestBody Club club){
        return clubRepository.save(club);
    }

    @PutMapping("{id}")
    public Club updateMembers(@RequestBody Club newclub,@PathVariable int id){
        return clubRepository.findById(id).map(club->{
            club.setFamilyname(newclub.getFamilyname());
            club.setGivenname(newclub.getGivenname());
            club.setLevel(newclub.getLevel());
            club.setPhone(newclub.getPhone());
            club.setSex(newclub.getSex());
            club.setSport(newclub.getSport());
            return clubRepository.save(newclub);
        }).orElseGet(()->{
            newclub.setId(id);
            return clubRepository.save(newclub);
        });
    }

    @DeleteMapping("{id}")
    public Map deleteMember(@PathVariable int id){
        boolean success;
        Map<String,Boolean> result = new HashMap<>();
        if (clubRepository.findById(id).isPresent()){
            clubRepository.deleteById(id);
            success = true;
        }else{
            success = false;
        }
        result.put("success",success);
        return result;
    }





}
