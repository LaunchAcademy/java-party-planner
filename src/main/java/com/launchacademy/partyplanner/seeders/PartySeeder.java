package com.launchacademy.partyplanner.seeders;

import com.launchacademy.partyplanner.models.Party;
import com.launchacademy.partyplanner.repositories.PartyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PartySeeder implements CommandLineRunner {

    private PartyRepository partyRepo;

    @Autowired
    public PartySeeder(PartyRepository partyRepo) {
        this.partyRepo = partyRepo;
    }

    @Override
    public void run(String... args) throws Exception {
        Party party1 = new Party();
        party1.setName("Bob");
        party1.setDescription("First party");
        party1.setLocation("Your cubicle");

        Party party2= new Party();
        party2.setName("Mary");
        party2.setDescription("Evening party");
        party2.setLocation("Your house");

        Party party3 = new Party();
        party3.setName("Ellen");
        party3.setDescription("Midnight party");
        party3.setLocation("Your dreams");

        List<Party> parties = (List<Party>) partyRepo.findAll();

        if(parties.size() == 0) {
            partyRepo.save(party1);
            partyRepo.save(party2);
            partyRepo.save(party3);
        }
    }
}
