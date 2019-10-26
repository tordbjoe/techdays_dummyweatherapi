package com.bisnode.techdaysdummyapi.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class DummyWeatherApiController {

    @RequestMapping(value = "/api/weather/{city}", method = RequestMethod.GET)
    @ResponseBody
    public String getWeather(@PathVariable String city) {
        return "You called the dummy weather API for " + city;
    }
}
