package com.shreya.spring.domain;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Training {
    private int id;
    private String name;
    private int duration;
    private String prerequisite;

}
