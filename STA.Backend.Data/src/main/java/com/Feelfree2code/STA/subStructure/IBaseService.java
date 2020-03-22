package com.Feelfree2code.STA.subStructure;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

import com.Feelfree2code.STA.common.AddVM;
import com.Feelfree2code.STA.common.BaseDTO;
import com.Feelfree2code.STA.common.BaseVM;
import com.Feelfree2code.STA.common.UpdateVM;

/**
 * IBaseService
 */
public interface IBaseService<T extends BaseDTO, V extends BaseVM, A extends AddVM, U extends UpdateVM, ID extends Serializable> {

    Iterable<T> get(boolean showIsDeleted);
    V getById(ID id);
    boolean add(A model);
    boolean update(U model);
    boolean delete(ID model);
}