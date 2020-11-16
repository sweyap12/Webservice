package com.example.demo;
 
import static org.assertj.core.api.Assertions.assertThat;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import com.example.demo.details.EmpDetails;
import com.example.demo.repository.EmpRepository;
 
@DataJpaTest
public class RepositoryTest {
    @Autowired
    private TestEntityManager entityManager;
     
    @Autowired
    private EmpRepository repository;
     
    @Test
    public void testSaveNewProduct() {
        entityManager.persist(new EmpDetails("1", "athira"));
                 
        Optional<EmpDetails> product = repository.findByName("athira");
         
        assertThat(product.get()).isEqualTo("athira");
    }
}