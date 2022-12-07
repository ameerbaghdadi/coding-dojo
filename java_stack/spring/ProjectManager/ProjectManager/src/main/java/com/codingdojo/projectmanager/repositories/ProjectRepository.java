package com.codingdojo.projectmanager.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.projectmanager.models.Project;
import com.codingdojo.projectmanager.models.User;

public interface ProjectRepository extends CrudRepository<Project, Long> {
	List<Project> findAll();
	List<Project> findByMembersNotContains(User user);
}
