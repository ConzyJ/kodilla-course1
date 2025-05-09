package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.invoice.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import jakarta.transaction.Transactional;

@Transactional
@Repository
public interface ProductDao extends CrudRepository<Product, Integer> {
}
