package com.ehv.ycdoorloop621.controller;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.ehv.ycdoorloop621.domein.Gerecht;

@Component
public interface GerechtRepository extends CrudRepository<Gerecht, Long> {

}
