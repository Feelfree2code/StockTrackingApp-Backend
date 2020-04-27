package com.Feelfree2code.STA.controller;

import com.Feelfree2code.STA.model.domain.UserDTO;
import com.Feelfree2code.STA.model.viewModel.UserAddVM;
import com.Feelfree2code.STA.model.viewModel.UserUpdateVM;
import com.Feelfree2code.STA.model.viewModel.UserVM;
import com.Feelfree2code.STA.service.IUserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(path = "/api/users")
public class UserController {

    private IUserService service;

    public UserController(IUserService service) {
        this.service = service;
    }

    // /api/users; /api/users/{showIsDeleted}
    @GetMapping
    public ResponseEntity<List<UserVM>> get(@RequestParam boolean showIsDeleted) {
        return service.get(showIsDeleted);
    }

    //routing should be like: /api/users/getById/{id}
    @GetMapping("/getById/{id}")
    public ResponseEntity<UserVM> getById(@PathVariable Integer id) {
        return service.getById(id);
    }

    // /api/users
    @PostMapping
    public ResponseEntity<UserDTO> add(@RequestBody @Valid UserAddVM newUser) {
        return service.add(newUser);
    }

    // /api/users
    @PutMapping(path = "{id}")
    public ResponseEntity<UserDTO> update(@PathVariable Integer id, @RequestBody @Valid UserUpdateVM user) {
        return service.update(id, user);
    }

    // /api/users
    @DeleteMapping(path = "{id}")
    public ResponseEntity<UserDTO> delete(@PathVariable Integer id) {
        return service.delete(id);
    }
}