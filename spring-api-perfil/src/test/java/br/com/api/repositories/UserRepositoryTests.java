package br.com.api.repositories;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import br.com.perfil.entities.UserEntity;
import br.com.perfil.repositories.UserRepository;

@SpringBootApplication
@ExtendWith(SpringExtension.class)
public class UserRepositoryTests {

	// @Autowired
	@MockBean
	private UserRepository repository;

	// @Autowired
	@MockBean
	private TestEntityManager testEntityManager;

	@Test
	void findByIdWhenFoundTest() {

		UserEntity usuarioEntidade = createValidUsuario();

		testEntityManager.persist(usuarioEntidade);

		Optional<UserEntity> usuario = repository.findById(usuarioEntidade.getId());

		assertThat(usuario).isNotNull();
	}

	@Test
	void findByIdWhenNotFoundTest() {

		Optional<UserEntity> usuario = repository.findById(1);

		assertThat(usuario.isPresent()).isFalse();
	}

	
	/*@Test
	void findAllTest() {

		UserEntity usuarioEntidade = createValidUsuario();

		testEntityManager.persist(usuarioEntidade);

		List<UserEntity> usuarios = this.repository.findAll();

		assertThat(usuarios.size()).isEqualTo(1);
	}*/

	/*@Test
	void saveTest() {

		UserEntity usuarioEntidade = createValidUsuario();

		testEntityManager.persist(usuarioEntidade);

		UserEntity usuariorSalvo = repository.save(usuarioEntidade);

		assertThat(usuariorSalvo.getId()).isNotNull();
		assertThat(usuariorSalvo.getCep()).isEqualTo(usuarioEntidade.getCep());
		assertThat(usuariorSalvo.getNome()).isEqualTo(usuarioEntidade.getNome());
		assertThat(usuariorSalvo.getNumero()).isEqualTo(usuarioEntidade.getNumero());
		assertThat(usuariorSalvo.getRua()).isEqualTo(usuarioEntidade.getRua());
	}*/

	/*@Test
	void deleteById() {

		UserEntity usuarioEntidade = createValidUsuario();

		UserEntity usuarioTemporario = testEntityManager.persist(usuarioEntidade);

		repository.deleteById(usuarioTemporario.getId());

		Optional<UserEntity> deletado = repository.findById(usuarioTemporario.getId());

		assertThat(deletado.isPresent()).isFalse();
	}*/

	private UserEntity createValidUsuario() {

		UserEntity usuarioEntidade = new UserEntity();

		usuarioEntidade.setCep("04567895");
		usuarioEntidade.setNome("Evelyn Alves");
		usuarioEntidade.setNumero(3);
		usuarioEntidade.setRua("Rua de Teste");

		return usuarioEntidade;
	}
}
