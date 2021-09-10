package com.cms.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cms.entities.Custumers;

public interface CustumerDao extends JpaRepository<Custumers, Integer> {

}
