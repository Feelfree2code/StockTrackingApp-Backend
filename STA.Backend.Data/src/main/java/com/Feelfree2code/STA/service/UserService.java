package com.Feelfree2code.STA.service;

import com.Feelfree2code.STA.common.APIResultVM;
import com.Feelfree2code.STA.model.domain.UserDTO;
import com.Feelfree2code.STA.model.viewModel.UserAddVM;
import com.Feelfree2code.STA.model.viewModel.UserUpdateVM;
import com.Feelfree2code.STA.model.viewModel.UserVM;

import com.Feelfree2code.STA.subStructure.IBaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * userService
 */
@Service
public class UserService implements IUserService {

    @Autowired
    private IBaseRepository<UserDTO, Integer> repository;

    public List<UserVM> get(boolean showIsDeleted) {
        List<UserDTO> records = repository.findAll();
        List<UserVM> results = new ArrayList<>();

        for (UserDTO record: records) {
            UserVM vm = new UserVM();
            vm.email = record.getEmail();
            vm.userName = record.getUser_name();
            vm.isAdmin = record.getIsAdmin();
            vm.id = record.getId();

            results.add(vm);
        }

        return results;
    }

    public UserVM getById(Integer id) {
        UserDTO record = null;
        try {
            record = repository.findById(id).get();

            UserVM vm = new UserVM();

            vm.email = record.getEmail();
            vm.userName = record.getUser_name();
            vm.isAdmin = record.getIsAdmin();
            vm.id = record.getId();

            return vm;
        } catch (Exception e) {
           return new UserVM();
        }
    }

    public APIResultVM add(UserAddVM model) {
        UserDTO entity = null;
        APIResultVM returnValue = new APIResultVM();

        try {
            entity.setUser_name(model.userName);
            entity.setEmail(model.email);
            entity.setIs_admin(model.isAdmin);

            repository.save(entity);

            returnValue.setId(entity.getId());
            returnValue.setSucceed(true);
        } catch (Exception e) {
            returnValue.setSucceed(false);
        }

        return returnValue;
    }

    public APIResultVM update(Integer id, UserUpdateVM model) {
        UserDTO entity = null;
        APIResultVM returnValue = new APIResultVM();

        try {
            entity = repository.findById(id).get();

            entity.setUser_name(model.userName);
            entity.setEmail(model.email);
            entity.setIs_admin(model.isAdmin);

            repository.save(entity);

            returnValue.setId(entity.getId());
            returnValue.setSucceed(true);
        } catch (Exception e) {
            returnValue.setSucceed(false);
        }

        return returnValue;
    }

    public APIResultVM delete(Integer id) {
        UserDTO entity = null;
        APIResultVM returnValue = new APIResultVM();

        try {
            entity = repository.findById(id).get();
            repository.delete(entity);

            returnValue.setSucceed(true);
        } catch (Exception e) {
            returnValue.setSucceed(false);
        }

        return returnValue;
    }
}