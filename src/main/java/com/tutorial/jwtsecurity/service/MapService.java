package com.tutorial.jwtsecurity.service;

import com.tutorial.jwtsecurity.repository.MapRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MapService {
    private final MapRepository mapRepository;
}
