package br.com.api.services;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import br.com.perfil.dtos.UserDTO;
import br.com.perfil.entities.UserEntity;
import br.com.perfil.repositories.UserRepository;
import br.com.perfil.services.UserService;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
public class UserServiceTests {
	/*@MockBean
	private UserService service;

	@MockBean
	private UserRepository repository;

	@Test
	void getAllTest() {

		List<UserEntity> listaMockada = new ArrayList<UserEntity>();

		UserEntity usuarioEntidade = createValidUsuario();

		listaMockada.add(usuarioEntidade);

		when(repository.findAll()).thenReturn(listaMockada);

		List<UserDTO> retorno = service.getAll();

		isUsuarioValid(retorno.get(0), listaMockada.get(0));

	}

	@Test
	void getOneWhenFoundObjectTest() {

		UserEntity usuarioEntidade = createValidUsuario();

		Optional<UserEntity> optional = Optional.of(usuarioEntidade);

		when(repository.findById(1)).thenReturn(optional);

		UserDTO obj = service.getOne(1);

		isUsuarioValid(obj, usuarioEntidade);
	}

	@Test
	void getOneWhenNotFoundObjectTest() {

		Optional<UserEntity> optional = Optional.empty();

		when(repository.findById(1)).thenReturn(optional);

		UserDTO obj = service.getOne(1);

		UserEntity usuarioEntidade = new UserEntity();

		isUsuarioValid(obj, usuarioEntidade);
	}

	@Test
	void saveTest() {

		UserEntity usuarioEntidade = createValidUsuario();

		when(repository.save(usuarioEntidade)).thenReturn(usuarioEntidade);

		UserDTO usuarioSalvo = service.save(usuarioEntidade);

		isUsuarioValid(usuarioSalvo, usuarioEntidade);

	}

	@Test
	void updateWhenFoundObj() {

		UserEntity usuarioEntidade = createValidUsuario();
		Optional<UserEntity> optional = Optional.of(usuarioEntidade);

		when(repository.findById(usuarioEntidade.getId())).thenReturn(optional);
		when(repository.save(usuarioEntidade)).thenReturn(usuarioEntidade);

		UserDTO usuarioAlterado = service.update(usuarioEntidade.getId(), usuarioEntidade);

		isUsuarioValid(usuarioAlterado, usuarioEntidade);
	}

	@Test
	void updateWhenNotFoundObj() {

		Optional<UserEntity> optional = Optional.empty();

		UserEntity usuarioEntidade = createValidUsuario();

		when(repository.findById(1)).thenReturn(optional);

		UserDTO usuarioAlterado = service.update(1, usuarioEntidade);

		isUsuarioValid(usuarioAlterado, new UserEntity());
	}

	@Test
	void deleteTest() {

		assertDoesNotThrow(() -> service.delete(1));

		verify(repository, times(1)).deleteById(1);
	}

	private void isUsuarioValid(UserDTO obj, UserEntity usuarioEntidade) {

		assertThat(obj.getCep()).isEqualTo(usuarioEntidade.getCep());
		assertThat(obj.getNome()).isEqualTo(usuarioEntidade.getNome());
		assertThat(obj.getNumero()).isEqualTo(usuarioEntidade.getNumero());
		assertThat(obj.getRua()).isEqualTo(usuarioEntidade.getRua());
		assertThat(obj.getId()).isEqualTo(usuarioEntidade.getId());
	}

	private UserEntity createValidUsuario() {

		UserEntity usuarioEntidade = new UserEntity();

		usuarioEntidade.setCep("04567895");
		usuarioEntidade.setNome("Evelyn Alves");
		usuarioEntidade.setNumero(3);
		usuarioEntidade.setRua("Rua de Teste");
		usuarioEntidade.setId(1);

		return usuarioEntidade;
	}*/

}
