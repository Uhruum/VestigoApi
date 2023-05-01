package com.example.vestigoapi.controllers;

import com.example.vestigoapi.dtos.LetterCounterResponseDto;
import com.example.vestigoapi.services.VestigoLibraryService;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/v1")
public class ApplicationController {

    private final VestigoLibraryService _vestigoLibraryService;

    public ApplicationController(VestigoLibraryService vestigoLibraryService) {
        _vestigoLibraryService = vestigoLibraryService;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/countLetters")
    public LetterCounterResponseDto countLetters(@RequestBody String value) {
        return _vestigoLibraryService.count(value);
    }
}
