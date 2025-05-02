package com.shreya.spring.model;

import com.fasterxml.jackson.annotation.JsonInclude;

public record StudentUpdate(
        @JsonInclude(JsonInclude.Include.NON_EMPTY) String name,
        @JsonInclude(JsonInclude.Include.NON_EMPTY)double percentage) {
}