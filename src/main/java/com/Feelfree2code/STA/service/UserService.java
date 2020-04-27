package com.Feelfree2code.STA.service;

import com.Feelfree2code.STA.model.domain.UserDTO;
import com.Feelfree2code.STA.model.viewModel.UserAddVM;
import com.Feelfree2code.STA.model.viewModel.UserUpdateVM;
import com.Feelfree2code.STA.model.viewModel.UserVM;
import com.Feelfree2code.STA.subStructure.IBaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * userService
 */
@Service
public class UserService implements IUserService {

    @Autowired
    private IBaseRepository repository;

    public ResponseEntity<List<UserVM>> get(boolean showIsDeleted) {
        List<UserDTO> records = repository.findByIsDeleted(showIsDeleted);
        List<UserVM> results = new ArrayList<>();

        for (UserDTO record : records) {
            UserVM vm = new UserVM();
            vm.email = record.getEmail();
            vm.userName = record.getUserName();
            vm.isAdmin = record.isAdmin();
            vm.id = record.getId();

            results.add(vm);
        }

        if (results.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<>(results, HttpStatus.OK) ;
    }

    public ResponseEntity<UserVM> getById(Integer id) {
        UserDTO record = null;
        try {
            if (isValidId(id)) {
                return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
            }
            record = repository.getOne(id);

            UserVM vm = new UserVM();

            vm.email = record.getEmail();
            vm.userName = record.getUserName();
            vm.isAdmin = record.isAdmin();
            vm.id = record.getId();

            return new ResponseEntity<>(vm, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }

    public ResponseEntity<UserDTO> add(UserAddVM model) {
        UserDTO entity = new UserDTO();

        entity.setUserName(model.userName);
        entity.setEmail(model.email);
        entity.setAdmin(model.isAdmin);
        entity.setDeleted(model.isDeleted);

        repository.save(entity);
        return new ResponseEntity<>(entity, HttpStatus.OK);

    }

    public ResponseEntity<UserDTO> update(Integer id, UserUpdateVM model) {
        UserDTO entity = null;

        if (repository.existsById(id)) {
            entity = repository.getOne(id);

            entity.setUserName(model.userName);
            entity.setEmail(model.email);
            entity.setAdmin(model.isAdmin);
            entity.setDeleted(model.isDeleted);

            return new ResponseEntity<>(repository.save(entity), HttpStatus.OK);
        }

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    public ResponseEntity<UserDTO> delete(Integer id) {
        if (isValidId(id)) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        if (repository.existsById(id)) {
            repository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    private boolean isValidId(Integer id) {
        return id == 0 || id < 0;
    }
}