package com.example.mdCloneMapStruct.repository;

import com.example.mdCloneMapStruct.entity.Manager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ManagerRepository extends JpaRepository<Manager,Integer> {

    Optional<Manager> findByFirstNameAndLastName(String firstName, String lastName);
}
