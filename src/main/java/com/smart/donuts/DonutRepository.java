package com.smart.donuts;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DonutRepository extends CrudRepository<DonutEntity, Long> {
    List<DonutEntity> findByNameIgnoreCase(String name);
}
