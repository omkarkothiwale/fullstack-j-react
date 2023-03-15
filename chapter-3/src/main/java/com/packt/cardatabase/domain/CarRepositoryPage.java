package com.packt.cardatabase.domain;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface CarRepositoryPage  extends PagingAndSortingRepository<Car, Long> {

}
