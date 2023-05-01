package com.example.vestigoapi.services;

import com.example.vestigoapi.dtos.ErrorDto;
import com.example.vestigoapi.dtos.LetterCounterResponseDto;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Service;
import vestigo.library.services.*;

@Service
@Log4j
public class VestigoLibraryServiceImpl implements VestigoLibraryService {

    public LetterCounterResponseDto count(String value) {
        try {
            LetterCounterService letterCounterService = new LetterCounterServiceImpl();
            LetterCounterReadDto letterCounterReadDto = letterCounterService.count(value);
            return LetterCounterResponseDto.builder().data(letterCounterReadDto).build();
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return LetterCounterResponseDto.builder().
                    error(ErrorDto.builder()
                            .message(e.getMessage())
                            .build())
                    .build();
        }
    }
}
