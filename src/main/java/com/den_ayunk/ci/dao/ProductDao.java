package com.den_ayunk.ci.dao;

import com.den_ayunk.ci.entity.Product;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProductDao extends PagingAndSortingRepository<Product, String>{ }
