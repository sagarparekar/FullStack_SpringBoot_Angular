package com.learn.service;

import com.learn.entities.Project;

import java.util.List;
import java.util.Optional;

public interface ProjectService {

    public List<Project> getAllprojects();

    public Project saveProject(Project project);

    public Project updateProject(int projectId);

    public void deleteProjectById(long projectId);

    public Optional<Project> getProjectById(long projectId);
}