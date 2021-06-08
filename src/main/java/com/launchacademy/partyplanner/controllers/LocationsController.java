package com.launchacademy.partyplanner.controllers;

import com.launchacademy.partyplanner.models.Location;
import com.launchacademy.partyplanner.services.LocationService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/locations")
public class LocationsController {

  private final LocationService locationService;

  @Autowired
  public LocationsController(LocationService locationService) {
    this.locationService = locationService;
  }

  @GetMapping
  public String getLocationsIndex(Model model) {
    List<Location> locations = locationService.findAll();
    model.addAttribute("locations", locations);
    return "locations/index";
  }

  @GetMapping("/{id}")
  public String getLocationShow(@PathVariable Integer id, Model model) {
    Location location = locationService.findById(id);
    model.addAttribute("location", location);
    model.addAttribute("parties", location.getParties());
    return "locations/show";
  }













}
