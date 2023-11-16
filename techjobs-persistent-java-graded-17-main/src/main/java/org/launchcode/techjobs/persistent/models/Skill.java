package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.Size;
@Entity
public class Skill extends AbstractEntity {
    @Size(min = 5, max = 250)
    public String description;

    public Skill(){

    }
}
