package com.example.vestigoapi.dtos;

import lombok.Builder;
import lombok.Data;

/**
 * Contains error message
 */
@Data
@Builder
public class ErrorDto {
    public String message;
}
