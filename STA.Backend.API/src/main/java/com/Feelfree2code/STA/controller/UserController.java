package com.Feelfree2code.STA.controller;

import com.Feelfree2code.STA.common.APIBadRequestModel;
import com.Feelfree2code.STA.common.APIResultVM;
import com.Feelfree2code.STA.model.viewModel.UserAddVM;
import com.Feelfree2code.STA.model.viewModel.UserUpdateVM;
import com.Feelfree2code.STA.model.viewModel.UserVM;
import com.Feelfree2code.STA.service.IUserService;
import com.sun.deploy.net.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping(path = "/api/users")
public class UserController {

	private IUserService service;

	public UserController(IUserService service) {
		this.service = service;
	}

	// /api/users; /api/users/{showIsDeleted}
	@GetMapping
	public ResponseEntity<?> get(boolean showIsDeleted) {

		List<UserVM> results = service.get(showIsDeleted);

		if(results.size() <= 0) {
			return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<List<UserVM>>(results, HttpStatus.OK);
	}

	//routing should be like: /api/users/getById/{id}
	@GetMapping("/getById")
	public ResponseEntity<?> getById(Integer id) {

		if(id == 0 || id < 0) {
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}

		UserVM result = service.getById(id);

		if(result.id == 0) {
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<UserVM>(result, HttpStatus.OK);
	}

	// /api/users
	@PostMapping
	public ResponseEntity<?> add(@RequestBody UserAddVM newUser) {

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();

		Set<ConstraintViolation<UserAddVM>> violations = validator.validate(newUser);

		if(newUser == null || !violations.isEmpty()) {
			APIBadRequestModel badRequestModel = new APIBadRequestModel();
			List<String> requiredFields = new ArrayList<>();

			for (ConstraintViolation<UserAddVM> violation : violations) {
				requiredFields.add(violation.getMessage());
			}

			badRequestModel.setRequiredFields(requiredFields);

			return new ResponseEntity<APIBadRequestModel>(badRequestModel, HttpStatus.BAD_REQUEST);
		}

		APIResultVM result = service.add(newUser);

		if(!result.isSucceed()){
			return new ResponseEntity<>(null, HttpStatus.CONFLICT);
		}

		return  new ResponseEntity<APIResultVM>(result, HttpStatus.OK);
	}

	// /api/users
	@PutMapping
	public ResponseEntity<?> update(Integer id, @RequestBody UserUpdateVM user) {

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();

		Set<ConstraintViolation<UserUpdateVM>> violations = validator.validate(user);

		if(user == null || id == 0 || id < 0 || !violations.isEmpty()) {
			APIBadRequestModel badRequestModel = new APIBadRequestModel();
			List<String> requiredFields = new ArrayList<>();

			for (ConstraintViolation<UserUpdateVM> violation : violations) {
				requiredFields.add(violation.getMessage());
			}

			badRequestModel.setRequiredFields(requiredFields);

			return new ResponseEntity<APIBadRequestModel>(badRequestModel, HttpStatus.BAD_REQUEST);
		}

		APIResultVM result = service.update(id, user);

		if(!result.isSucceed()){
			return new ResponseEntity<>(null, HttpStatus.CONFLICT);
		}

		return  new ResponseEntity<APIResultVM>(result, HttpStatus.OK);
	}

	// /api/users
	@DeleteMapping
	public ResponseEntity<?> delete(Integer id) {
		if(id == 0 || id < 0) {
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}

		APIResultVM result = service.delete(id);

		if(!result.isSucceed()){
			return new ResponseEntity<>(null, HttpStatus.CONFLICT);
		}

		return  new ResponseEntity<APIResultVM>(result, HttpStatus.NO_CONTENT);
	}
}