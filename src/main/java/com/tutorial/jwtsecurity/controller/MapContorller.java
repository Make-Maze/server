package com.tutorial.jwtsecurity.controller;

import com.tutorial.jwtsecurity.service.MapService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/map")
public class MapContorller {
    private final MapService mapService;

}
