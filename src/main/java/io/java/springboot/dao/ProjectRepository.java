package io.java.springboot.dao;

import org.springframework.data.repository.CrudRepository;

import io.java.springboot.model.Project;

public interface ProjectRepository extends CrudRepository<Project, String> {

}