package com.allstate.smallclaims.service;

import com.allstate.smallclaims.domain.Claim;
import com.allstate.smallclaims.domain.TaskTodo;

import java.util.List;

public interface TaskTodoService {
    TaskTodo findById(Integer id);
    TaskTodo save(TaskTodo task);
    List<TaskTodo> findTasksTodoByClaimId(Integer id);
}
