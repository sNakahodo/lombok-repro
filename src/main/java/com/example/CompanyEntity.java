package com.example;

import io.micronaut.data.annotation.MappedEntity;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@MappedEntity(value = "company")
public class CompanyEntity extends GenericEntity {

    private String name;
    private String location;

}
