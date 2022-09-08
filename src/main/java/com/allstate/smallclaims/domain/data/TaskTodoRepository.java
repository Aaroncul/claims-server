package com.allstate.smallclaims.domain.data;

import com.allstate.smallclaims.domain.Claim;
import com.allstate.smallclaims.domain.TaskTodo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TaskTodoRepository extends JpaRepository<TaskTodo,Integer> {
    public Optional<TaskTodo> findById(Integer id);
    public TaskTodo save(TaskTodo task);
    public List<TaskTodo> findByClaimId(Integer id);
}
