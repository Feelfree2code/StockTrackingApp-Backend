package com.Feelfree2code.STA.service;

import com.Feelfree2code.STA.model.domain.UserDTO;
import com.Feelfree2code.STA.model.viewModel.UserAddVM;
import com.Feelfree2code.STA.model.viewModel.UserUpdateVM;
import com.Feelfree2code.STA.model.viewModel.UserVM;
import com.Feelfree2code.STA.subStructure.IBaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * userService
 */
@Service
@Transactional
public class UserService implements IUserService {

    @Autowired
    private IBaseRepository repository;

    public List<UserVM> get(boolean showIsDeleted) {
        List<UserDTO> records = repository.findAll();
        List<UserVM> results = new ArrayList<>();

        for (UserDTO record : records) {
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

    public boolean add(UserAddVM model) {
        UserDTO entity = null;

        try {
            entity.setUser_name(model.userName);
            entity.setEmail(model.email);
            entity.setIs_admin(model.isAdmin);

            repository.save(entity);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean update(Integer id, UserUpdateVM model) {
        UserDTO entity = null;

        try {
            entity = repository.findById(id).get();

            entity.setUser_name(model.userName);
            entity.setEmail(model.email);
            entity.setIs_admin(model.isAdmin);

            repository.save(entity);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean delete(Integer id) {
        UserDTO entity = null;
        try {
            entity = repository.findById(id).get();
            repository.delete(entity);

            return true;
        } catch (Exception e) {
            return false;
        }
    }
}