package com.ericlam.main.dao;

import com.ericlam.main.model.Club;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClubRepository extends CrudRepository<Club,Integer> {
}
