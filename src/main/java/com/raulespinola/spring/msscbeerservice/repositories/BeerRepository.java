package com.raulespinola.spring.msscbeerservice.repositories;

import com.raulespinola.spring.msscbeerservice.domain.Beer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

@NoRepositoryBean
public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
