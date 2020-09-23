package com.ae.countryservice.country.repository;

import com.ae.countryservice.entity.CountryEntity;
import com.ae.countryservice.util.CountryMockUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@DataJpaTest
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
class CountryRepositoryTest {

    @Autowired
    private CountryRepository repository;

    private CountryEntity country;

    @BeforeEach
    public void setup() {
        country = CountryMockUtil.getCountry();
    }

    @Test
    public void shouldSaveCountryWhenSaveIsCalled() {
        CountryEntity countryEntity = repository.save(country);
        Assertions.assertNotNull(countryEntity);

        Optional<CountryEntity> founded = repository.findById(5L);
        Assertions.assertEquals(Optional.of(countryEntity), founded);
        Assertions.assertNotNull(founded.get());
        Assertions.assertNotNull(founded.get().getCode());
        Assertions.assertNotNull(founded.get().getIdCountry());
        Assertions.assertNotNull(founded.get().getName());
    }

    @Test
    public void shouldSaveCountryWhenS() {
        CountryEntity countryEntity = repository.save(country);
        Assertions.assertNotNull(countryEntity);

        Optional<CountryEntity> founded = repository.findById(5L);
        Assertions.assertEquals(Optional.of(countryEntity), founded);
        Assertions.assertNotNull(founded.get());
        Assertions.assertNotNull(founded.get().getCode());
        Assertions.assertNotNull(founded.get().getIdCountry());
        Assertions.assertNotNull(founded.get().getName());
    }

}