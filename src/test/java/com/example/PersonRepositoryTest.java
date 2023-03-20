package com.example;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@MicronautTest
public class PersonRepositoryTest {

  @Inject
  private PersonRepository personRepository;

  @Test
  void shouldCreate() {
    final CompanyEntity companyEntity = CompanyEntity.builder().name("Google").build();
    final PersonEntity personEntity = PersonEntity.builder()
        .id(1L)
        .company(companyEntity)
        .name("Joe")
        .age(25)
        .address("Melbourne VIC 3000")
        .build();

    PersonEntity savedPersonEntity = personRepository.save(personEntity);

    Assertions.assertEquals(1L, savedPersonEntity.getId());
    Assertions.assertEquals("Joe", savedPersonEntity.getName());
    Assertions.assertNotNull(savedPersonEntity.getCreatedAt());
    Assertions.assertNotNull(savedPersonEntity.getUpdatedAt());
  }

}
