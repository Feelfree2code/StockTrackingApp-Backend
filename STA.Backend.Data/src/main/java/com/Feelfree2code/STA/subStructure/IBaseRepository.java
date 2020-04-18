package com.Feelfree2code.STA.subStructure;

import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

/**
 * IBaseRepository
 */
public interface IBaseRepository<T, ID extends Serializable>
        extends JpaRepository<T, ID> {


}