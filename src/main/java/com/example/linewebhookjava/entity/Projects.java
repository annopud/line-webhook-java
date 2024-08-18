package com.example.linewebhookjava.entity;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "projects")
public class Projects implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "project_name", nullable = false)
    private String projectName;

    @ElementCollection
//    @ElementCollection(fetch = jakarta.persistence.FetchType.EAGER)
    @CollectionTable(name = "project_items", joinColumns = @JoinColumn(name = "project_id"))
    private List<ProjectItems> itemUpdates;

    public Projects() {
        this.itemUpdates = new ArrayList<>();
    }

    public Projects(String projectName) {
        this.projectName = projectName;
        this.itemUpdates = new ArrayList<>();
    }

    public void addItem(ProjectItems item) {
        this.itemUpdates.add(item);
    }
}
