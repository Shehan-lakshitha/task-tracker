package com.example.tasktracker.service;

import com.example.tasktracker.model.Task;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TaskService {

    private final List<Task> tasks = new ArrayList<>();
    private Long nextId = 1L;

    public Task createTask(String title, String description, String status, LocalDate dueDate) {
        Task task = new Task(nextId++, title, description, status, dueDate);
        tasks.add(task);
        return task;
    }

    public List<Task> getAllTasks() {
        return tasks;
    }

    public Optional<Task> getTaskById(Long id) {
        return tasks.stream().filter(task -> task.getId().equals(id)).findFirst();
    }

    public List<Task> getTasksByStatus(String status) {
        return tasks.stream()
                .filter(task -> task.getStatus().equalsIgnoreCase(status))
                .collect(Collectors.toList());
    }

    public Task updateTask(Long id, String title, String description, String status, LocalDate dueDate) {
        Task task = getTaskById(id).orElseThrow(() -> new RuntimeException("Task not found"));
        task.setTitle(title);
        task.setDescription(description);
        task.setStatus(status);
        task.setDueDate(dueDate);
        return task;
    }

    public boolean deleteTask(Long id) {
        return tasks.removeIf(task -> task.getId().equals(id));
    }

    public List<Task> searchTasksByTitle(String title) {
        return tasks.stream()
                .filter(task -> task.getTitle().toLowerCase().contains(title.toLowerCase()))
                .collect(Collectors.toList());
    }
}
