package com.Feelfree2code.STA.subStructure;

import java.io.Serializable;

import com.Feelfree2code.STA.common.AddVM;
import com.Feelfree2code.STA.common.BaseVM;
import com.Feelfree2code.STA.common.UpdateVM;
import com.Feelfree2code.STA.model.domain.UserDTO;

import org.springframework.data.repository.CrudRepository;

/**
 * IBaseRepository
 */
// @NoRepositoryBean

public interface IBaseRepository<T extends UserDTO, V extends BaseVM, A extends AddVM, U extends UpdateVM, ID extends Serializable>
        extends CrudRepository<T, ID> {

    // Iterable<T> findByAttributeContainsText(String attributeName, String text);

}