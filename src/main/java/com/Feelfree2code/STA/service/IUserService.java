package com.Feelfree2code.STA.service;

import com.Feelfree2code.STA.model.domain.UserDTO;
import com.Feelfree2code.STA.model.viewModel.UserAddVM;
import com.Feelfree2code.STA.model.viewModel.UserUpdateVM;
import com.Feelfree2code.STA.model.viewModel.UserVM;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IUserService {
    ResponseEntity<List<UserVM>> get(String showIsDeleted);

    ResponseEntity<UserVM> getById(Integer id);

    ResponseEntity<UserDTO> add(UserAddVM model);

    ResponseEntity<UserDTO> update(Integer id, UserUpdateVM model);

    ResponseEntity<UserDTO> delete(Integer id);
}
