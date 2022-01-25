package com.giko.covid19.controller;


import com.giko.covid19.model.Location;
import com.giko.covid19.service.Covid19DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    Covid19DataService covid19DataService;

    @GetMapping("/")
    public String getData(Model model){
        List<Location> locationStats = covid19DataService.getLocations();

        int totalReportedCases = locationStats.stream().mapToInt(Location::getLatestTotalCases).sum();
        int totalNewCases = locationStats.stream().mapToInt(Location::getDifferenceFromPreviousDay).sum();

        model.addAttribute("locationStats", locationStats);
        model.addAttribute("totalReportedCases", totalReportedCases);
        model.addAttribute("totalNewCases", totalNewCases);

        return "index";
    }
}
