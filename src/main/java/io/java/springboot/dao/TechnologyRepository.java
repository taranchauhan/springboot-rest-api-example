package io.java.springboot.dao;

import org.springframework.data.repository.CrudRepository;

import io.java.springboot.model.Technology;

public interface TechnologyRepository extends CrudRepository<Technology, String> {

}