package com.launchacademy.partyplanner.seeders;

import com.launchacademy.partyplanner.models.Location;
import com.launchacademy.partyplanner.models.Party;
import com.launchacademy.partyplanner.services.LocationService;
import com.launchacademy.partyplanner.services.PartyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class LocationSeeder implements CommandLineRunner {
  private LocationService locationService;
  private PartyService partyService;

  @Autowired
  public LocationSeeder(LocationService locationService, PartyService partyService) {
    this.locationService = locationService;
    this.partyService = partyService;
  }

  @Override
  public void run(String... args) throws Exception {
    Location location = new Location();
    Party party = new Party();

    if (locationService.findAll().size() < 2) {
      location.setName("Launch");
      location.setCity("Boston");
      location.setState("MA");
      location.setRentalPrice(72.59);
      locationService.save(location);

      party.setName("new years party");
      party.setDescription("starts at 10");
      party.setLocation(location);
      partyService.save(party);

      party.setId(null);
      party.setName("birthday");
      party.setDescription("starts at 10");
      party.setLocation(location);
      partyService.save(party);

      party.setId(null);
      party.setName("dim sum");
      party.setDescription("starts at 10");
      party.setLocation(location);
      partyService.save(party);

      Location location2 = new Location();
      location2.setName("5guys");
      location2.setState("NY");
      location2.setCity("New York");
      locationService.save(location2);
    }
  }
}
