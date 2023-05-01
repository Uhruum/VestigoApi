package com.example.vestigoapi.services;


import com.example.vestigoapi.dtos.LetterCounterResponseDto;
import vestigo.library.services.LetterCounterService;

/**
 * Wrapper for {@link LetterCounterService}
 */
public interface VestigoLibraryService {
    /**
     * Invokes {@link LetterCounterService} count
     * @param value text
     * @return {@link LetterCounterResponseDto}
     */
    LetterCounterResponseDto count(String value);
}
