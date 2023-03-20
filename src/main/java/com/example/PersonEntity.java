package com.example;

import io.micronaut.data.annotation.MappedEntity;
import io.micronaut.data.annotation.Relation;
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
@MappedEntity(value = "person")
public class PersonEntity extends GenericEntity {

    @Relation(value = Relation.Kind.MANY_TO_ONE)
    @NotNull
    private CompanyEntity company;

    @NotNull
    private String name;
    private int age;
    private String address;

}
