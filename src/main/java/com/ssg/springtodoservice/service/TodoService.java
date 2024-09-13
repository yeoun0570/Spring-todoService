package com.ssg.springtodoservice.service;

import com.ssg.springtodoservice.domain.TodoVO;
import com.ssg.springtodoservice.dto.TodoDTO;

import java.time.LocalDate;
import java.util.List;

public interface TodoService {

    void register(TodoDTO todoDTO);

    List<TodoDTO> getAll();
    TodoDTO getOne(Long tno);

    void remove(Long tno);
    void modify(TodoDTO todoDTO);
}
