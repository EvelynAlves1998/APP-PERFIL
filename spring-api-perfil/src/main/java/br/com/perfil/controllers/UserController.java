package br.com.perfil.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.perfil.dtos.UserDTO;
import br.com.perfil.services.UserService;

@RestController
@RequestMapping("usuarios")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
	@Autowired
	private UserService service;

	@GetMapping()
	public ResponseEntity<List<UserDTO>> getAll() {

		return ResponseEntity.status(HttpStatus.OK).body(service.getAll());
	}

	@GetMapping("{id}")
	public ResponseEntity<UserDTO> getOne(@PathVariable int id) {

		return ResponseEntity.status(HttpStatus.OK).body(service.getOne(id));
	}

	@PostMapping()
	public ResponseEntity<UserDTO> save(@Valid @RequestBody UserDTO usuario) {

		return ResponseEntity.status(HttpStatus.OK).body(service.save(usuario.toEntity()));
	}

	@PatchMapping("{id}")
	public ResponseEntity<UserDTO> update(@PathVariable int id, @RequestBody UserDTO usuario) {

		return ResponseEntity.status(HttpStatus.OK).body(service.update(id, usuario.toEntity()));
	}

	@DeleteMapping("{id}")
	public ResponseEntity<Void> delete(@PathVariable int id) {

		service.delete(id);

		return ResponseEntity.ok().build();
	}
}
