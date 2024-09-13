package com.ssg.springtodoservice.dto;

import lombok.*;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder

// 스프링VMC에서는 파라미터 검증 작업은 컨트롤러에서진행한다.
// @Valid 와 BindingResult 객체를 이용하여 처리한다.
// hibernate-validate 라이브러리가 필요하다.
public class TodoDTO {
    private int tno;

    @NotEmpty
    private String title;

    @Future
    private LocalDate dueDate;

    @NotEmpty
    private String writer;

    private boolean finished;

}
