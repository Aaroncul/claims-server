package com.allstate.smallclaims.control;

import com.allstate.smallclaims.domain.Claim;
import com.allstate.smallclaims.domain.TaskTodo;
import com.allstate.smallclaims.service.TaskTodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/tasks")
public class TaskTodoController {
    @Autowired
    TaskTodoService tasksTodoService;

    @GetMapping("claim/{id}")
    public List<TaskTodo> FindByClaimId(@PathVariable("id")Integer id)
    {
        return tasksTodoService.findTasksTodoByClaimId(id);
    }

    @GetMapping(value = "/{id}")
    public TaskTodo FindById(@PathVariable("id")Integer id)
    {
        return tasksTodoService.findById(id);
    }

    @PostMapping(value = "/{id}")
    public TaskTodo add(@RequestBody TaskTodo task)
    {
        return tasksTodoService.save(task);
    }
}
