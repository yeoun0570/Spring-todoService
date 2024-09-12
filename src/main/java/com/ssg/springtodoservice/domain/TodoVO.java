package com.ssg.springtodoservice.domain;

import lombok.*;
import java.time.LocalDate;

@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TodoVO {
    private int tno;
    private String title;
    private LocalDate dueDate;
    private String writer;
    private boolean finished;

}
