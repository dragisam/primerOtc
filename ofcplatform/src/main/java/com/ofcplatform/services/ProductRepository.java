package com.ofcplatform.services;

import com.ofcplatform.domain.Product;
import com.ofcplatform.domain.Supplier;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Nenad on 4/16/2017.
 */
public interface ProductRepository extends CrudRepository<Product, Long> {

}
