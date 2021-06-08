package com.launchacademy.partyplanner.services;

import com.launchacademy.partyplanner.models.Party;
import com.launchacademy.partyplanner.repositories.PartiesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PartyService {
  private PartiesRepository partiesRepository;

  @Autowired
  public PartyService(PartiesRepository partiesRepository) {
    this.partiesRepository = partiesRepository;
  }

  public void save(Party party) {
    partiesRepository.save(party);
  }
}
