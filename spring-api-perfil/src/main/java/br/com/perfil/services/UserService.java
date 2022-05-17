package br.com.perfil.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.perfil.dtos.UserDTO;
import br.com.perfil.entities.UserEntity;
import br.com.perfil.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public List<UserDTO> getAll() {
		List<UserEntity> lista = repository.findAll();

		List<UserDTO> listaDTO = new ArrayList<>();

		for (UserEntity UserEntity : lista) {

			listaDTO.add(UserEntity.toDTO());
		}

		return listaDTO;
	}

	public UserDTO getOne(int id) {

		Optional<UserEntity> optional = repository.findById(id);

		UserEntity usuario = optional.orElse(new UserEntity());

		return usuario.toDTO();
	}

	public UserDTO save(UserEntity usuario) {
		return repository.save(usuario).toDTO();
	}

	public UserDTO update(int id, UserEntity usuario) {

		Optional<UserEntity> optional = repository.findById(id);

		if (optional.isPresent() == true) {

			UserEntity usuarioBD = optional.get();
			usuarioBD.setNome(usuario.getNome());
			usuarioBD.setCep(usuario.getCep());
			usuarioBD.setCpf(usuario.getCpf());
			usuarioBD.setNumero(usuario.getNumero());
			usuarioBD.setRua(usuario.getRua());

			return repository.save(usuarioBD).toDTO();
		}

		else {
			return new UserEntity().toDTO();
		}
	}

	public void delete(int id) {

		repository.deleteById(id);

	}
}
