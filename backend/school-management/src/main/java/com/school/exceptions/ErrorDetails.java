package com.school.exceptions;

import lombok.Data;
import lombok.Getter;

import java.time.LocalDateTime;

@Data
public class ErrorDetails {

    private LocalDateTime timeStamp;
    private String message;
    private String description;
}
