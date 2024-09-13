package com.ssg.springtodoservice.mapper;

import com.ssg.springtodoservice.domain.TodoVO;

import java.util.List;

public interface TodoMapper {
    String getTime();

    void insert(TodoVO todoVO);

    List<TodoVO> selectAll();

    TodoVO selectOne(Long tno);


}
