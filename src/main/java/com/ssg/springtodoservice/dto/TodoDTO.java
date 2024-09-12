package com.ssg.springtodoservice.dto;

import lombok.*;

import java.time.LocalDate;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TodoDTO {
    private int tno;
    private String title;
    private LocalDate dueDate;
    private String writer;
    private boolean finished;

}
