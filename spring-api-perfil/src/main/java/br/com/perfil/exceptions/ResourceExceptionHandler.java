package br.com.perfil.exceptions;

import javax.servlet.http.HttpServletRequest;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;

import br.com.perfil.exceptions.StandardError;

public class ResourceExceptionHandler {
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<StandardError> methodValidation(MethodArgumentNotValidException e, 
			HttpServletRequest request) {
		
		StandardError error = new StandardError();
		error.setTimestamp(System.currentTimeMillis());
		error.setStatus(HttpStatus.BAD_REQUEST.value());
		error.setError("Erro de validação");
		error.setMessage("Erro ao validar a operação");
		error.setPath(request.getRequestURI());
		
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error);
	}
	
	@ExceptionHandler(EmptyResultDataAccessException.class)
	public ResponseEntity<StandardError> deleteException(EmptyResultDataAccessException e, 
			HttpServletRequest request) {
		
		StandardError error = new StandardError();
		error.setTimestamp(System.currentTimeMillis());
		error.setStatus(HttpStatus.OK.value());
		error.setError("Erro de deletar registro");
		error.setMessage("Erro de deletar registro");
		error.setPath(request.getRequestURI());
		
		return ResponseEntity.status(HttpStatus.OK).body(error);
	}
}
