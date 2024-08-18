package com.example.linewebhookjava.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class ProjectItems {



    @Column(name = "project_item_name")
    private String projectItemNameTest;

}
