package com.Feelfree2code.STA.subStructure;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * IBaseRepository
 */
@Repository
public interface IBaseRepository<T, ID extends Serializable>
        extends JpaRepository<T, ID> {


}