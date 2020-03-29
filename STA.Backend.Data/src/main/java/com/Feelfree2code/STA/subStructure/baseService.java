package com.Feelfree2code.STA.subStructure;

import java.io.Serializable;

import com.Feelfree2code.STA.common.AddVM;
import com.Feelfree2code.STA.common.BaseVM;
import com.Feelfree2code.STA.common.UpdateVM;
import com.Feelfree2code.STA.model.domain.UserDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * baseService
 */
@Service
public class BaseService<T extends UserDTO, V extends BaseVM, A extends AddVM, U extends UpdateVM, ID extends Serializable>
        implements IBaseService<T, V, A, U, ID> {

    @Autowired
    private IBaseRepository<T, V, A, U, ID> repository;

    @Override
    public Iterable<T> get(boolean showIsDeleted) {
        return repository.findAll();
    }

    @Override
    public V getById(ID id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean add(A model) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean update(U model) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean delete(ID model) {
        // TODO Auto-generated method stub
        return false;
    }
}