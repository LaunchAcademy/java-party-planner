package com.launchacademy.partyplanner.services;

import com.launchacademy.partyplanner.models.Party;
import com.launchacademy.partyplanner.repositories.PartyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartyService {

    private PartyRepository partyRepo;

    @Autowired
    public PartyService(PartyRepository partyRepo) {
        this.partyRepo = partyRepo;
    }

    public List<Party> findAll() {
        return (List<Party>) this.partyRepo.findAll();
    }

    public Party findById(Integer id) {
        return this.partyRepo.findById(id).get();
    }

    public void add(Party party) {
        this.partyRepo.save(party);
    }
}
