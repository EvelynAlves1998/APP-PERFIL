package br.com.api.controllers;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.patch;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import java.nio.charset.StandardCharsets;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;

import com.fasterxml.jackson.databind.ObjectMapper;
import br.com.perfil.dtos.UserDTO;
import br.com.perfil.entities.UserEntity;
import br.com.perfil.services.UserService;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
public class UserControllerTests {

	/*@Autowired
	private MockMvc mockMvc;

	@Autowired
	private UserService service;

	@Test
	void getAllTest() throws Exception {

		ResultActions response = mockMvc.perform(get("/usuarios").contentType("application/json"));
		MvcResult result = response.andReturn();
		String responseStr = result.getResponse().getContentAsString();

		System.out.println(responseStr);

		ObjectMapper mapper = new ObjectMapper();

		UserDTO[] lista = mapper.readValue(responseStr, UserDTO[].class);

		assertThat(lista).isNotEmpty();
	}

	@Test
	void getOneTest() throws Exception {

		ResultActions response = mockMvc.perform(get("/usuarios/1").contentType("application/json"));

		MvcResult result = response.andReturn();

		String responseStr = result.getResponse().getContentAsString();

		System.out.println(responseStr);

		ObjectMapper mapper = new ObjectMapper();

		UserDTO usuario = mapper.readValue(responseStr, UserDTO.class);

		assertThat(usuario.getId()).isEqualTo(1);
		assertThat(result.getResponse().getStatus()).isEqualTo(200);
	}

	@Test
	void saveTest() throws Exception {

		ObjectMapper mapper = new ObjectMapper();

		UserDTO usuario = new UserDTO();
		usuario.setCep("04567895");
		usuario.setNome("Evelyn Alves");
		usuario.setNumero(3);
		usuario.setRua("Rua de Teste");

		ResultActions response = mockMvc
				.perform(post("/usuarios").content(mapper.writeValueAsString(usuario)).contentType("application/json"));

		MvcResult result = response.andReturn();

		String responseStr = result.getResponse().getContentAsString(StandardCharsets.UTF_8);

		System.out.println(responseStr);

		UserDTO usuarioSalvo = mapper.readValue(responseStr, UserDTO.class);

		assertThat(usuarioSalvo.getId()).isPositive();
		assertThat(usuarioSalvo.getCep()).isEqualTo(usuario.getCep());
		assertThat(usuarioSalvo.getNome()).isEqualTo(usuario.getNome());
		assertThat(usuarioSalvo.getNumero()).isEqualTo(usuario.getNumero());
		assertThat(usuarioSalvo.getRua()).isEqualTo(usuario.getRua());

		assertThat(result.getResponse().getStatus()).isEqualTo(200);

	}

	@Test
	void updateTest() throws Exception {

		ObjectMapper mapper = new ObjectMapper();

		UserDTO usuario = new UserDTO();
		usuario.setCep("04567895");
		usuario.setNome("Evelyn Alves");
		usuario.setNumero(3);
		usuario.setRua("Rua de Teste");

		ResultActions response = mockMvc.perform(
				patch("/usuario/1").content(mapper.writeValueAsString(usuario)).contentType("application/json"));

		MvcResult result = response.andReturn();

		String responseStr = result.getResponse().getContentAsString(StandardCharsets.UTF_8);

		System.out.println(responseStr);

		UserDTO usuarioSalvo = mapper.readValue(responseStr, UserDTO.class);

		assertThat(usuarioSalvo.getId()).isPositive();
		assertThat(usuarioSalvo.getCep()).isEqualTo(usuario.getCep());
		assertThat(usuarioSalvo.getNome()).isEqualTo(usuario.getNome());
		assertThat(usuarioSalvo.getNumero()).isEqualTo(usuario.getNumero());
		assertThat(usuarioSalvo.getRua()).isEqualTo(usuario.getRua());

		assertThat(result.getResponse().getStatus()).isEqualTo(200);
	}

	@Test
	void deleteTest() throws Exception {

		UserEntity obj = this.createValidUsuario();
		UserDTO dto = this.service.save(obj);

		ResultActions response = mockMvc.perform(delete("/usuarios/" + dto.getId()).contentType("application/json"));

		MvcResult result = response.andReturn();

		assertThat(result.getResponse().getStatus()).isEqualTo(200);
	}

	private UserEntity createValidUsuario() {

		UserEntity UsuarioEntidade = new UserEntity();

		UsuarioEntidade.setCep("04567895");
		UsuarioEntidade.setNome("Evelyn Alves");
		UsuarioEntidade.setNumero(3);
		UsuarioEntidade.setRua("Rua de Teste");

		return UsuarioEntidade;
	}*/

}
