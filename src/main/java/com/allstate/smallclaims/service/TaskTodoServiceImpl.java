package com.allstate.smallclaims.service;

import com.allstate.smallclaims.domain.TaskTodo;
import com.allstate.smallclaims.domain.data.TaskTodoRepository;
import com.allstate.smallclaims.exceptions.TaskTodoNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class TaskTodoServiceImpl implements TaskTodoService{
    @Autowired
    TaskTodoRepository taskTodoRepository;

    @Override
    public TaskTodo findById(Integer id) {
        Optional<TaskTodo> optionalTaskTodo = taskTodoRepository.findById(id);

        if (optionalTaskTodo.isPresent()) {
            return optionalTaskTodo.get();
        }

        throw new TaskTodoNotFoundException("There is no task with an ID of " + id);

    }

    @Override
    public TaskTodo save(TaskTodo task) {
        return taskTodoRepository.save(task);
    }

    @Override
    public List<TaskTodo> findTasksTodoByClaimId(Integer id) {
        return taskTodoRepository.findByClaimId(id);
    }
}
