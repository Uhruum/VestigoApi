package com.example.vestigoapi.dtos;

import com.example.vestigoapi.services.VestigoLibraryService;
import lombok.Builder;
import lombok.Data;
import vestigo.library.services.LetterCounterReadDto;

/**
 * Contains response of {@link VestigoLibraryService} count method
 */
@Data
@Builder
public class LetterCounterResponseDto {
    public LetterCounterReadDto data;
    public ErrorDto error;
}
