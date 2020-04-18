package com.Feelfree2code.STA.subStructure;

import java.io.Serializable;

import com.Feelfree2code.STA.common.AddVM;
import com.Feelfree2code.STA.common.BaseVM;
import com.Feelfree2code.STA.common.UpdateVM;
import com.Feelfree2code.STA.model.domain.UserDTO;

/**
 * IBaseService
 */
public interface IBaseService<T extends UserDTO, V extends BaseVM, A extends AddVM, U extends UpdateVM, ID extends Serializable> {

    Iterable<T> get(boolean showIsDeleted);
    T getById(ID id);
    boolean add(A model);
    boolean update(U model);
    boolean delete(ID model);
}