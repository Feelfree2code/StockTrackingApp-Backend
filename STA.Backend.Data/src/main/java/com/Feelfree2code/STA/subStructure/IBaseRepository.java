package com.Feelfree2code.STA.subStructure;

import com.Feelfree2code.STA.model.domain.UserDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * IBaseRepository
 */
//@Repository
public interface IBaseRepository extends JpaRepository<UserDTO, Integer> {


}