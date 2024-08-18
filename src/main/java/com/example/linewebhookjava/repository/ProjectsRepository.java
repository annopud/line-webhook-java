package com.example.linewebhookjava.repository;

import com.example.linewebhookjava.entity.ProjectItems;
import com.example.linewebhookjava.entity.Projects;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProjectsRepository extends JpaRepository<Projects, Long>, JpaSpecificationExecutor<Projects> {

    @Query("SELECT m.itemUpdates FROM Projects m WHERE m.id = :id")
    List<ProjectItems> findItemUpdatesByProjectId(@Param("id") Long id);

}