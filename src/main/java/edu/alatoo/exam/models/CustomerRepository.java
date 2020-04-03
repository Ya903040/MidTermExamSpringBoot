package edu.alatoo.exam.models;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    @Override
    List<Customer> findAll();

    @Override
    <S extends Customer> S save(S entity);
}
