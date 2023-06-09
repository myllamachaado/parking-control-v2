package com.api.parkingcontrol.exceptions;

import org.hibernate.exception.ConstraintViolationException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import javax.persistence.EntityNotFoundException;
import javax.servlet.http.HttpServletRequest;
import java.net.MalformedURLException;

@ControllerAdvice
public class PersonalizedExceptionHandler {

   @ExceptionHandler(value = {LicensePlateInUse.class})
   public ResponseEntity<ErrorMessage> licensePlateInUse(LicensePlateInUse e, HttpServletRequest request) {
      String errorDescription = e.getLocalizedMessage();
      return new ResponseEntity<>(
              new ErrorMessage(errorDescription),
              new HttpHeaders(),
              HttpStatus.NOT_FOUND
      );
   }

   @ExceptionHandler(value = {ParkingSpotInUse.class})
   public ResponseEntity<ErrorMessage> parkingSpotInUse(ParkingSpotInUse e, HttpServletRequest request) {
      String errorDescription = e.getLocalizedMessage();
      return new ResponseEntity<>(
              new ErrorMessage(errorDescription),
              new HttpHeaders(),
              HttpStatus.NOT_FOUND
      );
   }

   @ExceptionHandler(value = {EntityNotFoundException.class})
   public ResponseEntity<ErrorMessage> entityNotFound(EntityNotFoundException e, HttpServletRequest request) {
      String errorDescription = e.getLocalizedMessage();
      return new ResponseEntity<>(
              new ErrorMessage(errorDescription),
              new HttpHeaders(),
              HttpStatus.NOT_FOUND
      );
   }

   @ExceptionHandler(value = {ParkingSpotAlreadyRegistred.class})
   public ResponseEntity<ErrorMessage> entityNotFound(ParkingSpotAlreadyRegistred e, HttpServletRequest request) {
      String errorDescription = e.getLocalizedMessage();
      return new ResponseEntity<>(
              new ErrorMessage(errorDescription),
              new HttpHeaders(),
              HttpStatus.NOT_FOUND
      );
   }

   @ExceptionHandler(value = {MalformedURLException.class})
   public ResponseEntity<ErrorMessage> entityNotFound(MalformedURLException e, HttpServletRequest request) {
      String errorDescription = "Verifique a URL inserida no campo imagem. | " + e.getLocalizedMessage();
      return new ResponseEntity<>(
              new ErrorMessage(errorDescription),
              new HttpHeaders(),
              HttpStatus.BAD_REQUEST
      );
   }

   @ExceptionHandler(value = {MethodArgumentTypeMismatchException.class})
   public ResponseEntity<ErrorMessage> entityNotFound(MethodArgumentTypeMismatchException e, HttpServletRequest request) {
      String errorDescription = "Verifique os argumentos da URL. | " + e.getLocalizedMessage();
      return new ResponseEntity<>(
              new ErrorMessage(errorDescription),
              new HttpHeaders(),
              HttpStatus.BAD_REQUEST
      );
   }

   @ExceptionHandler(value = {HttpRequestMethodNotSupportedException.class})
   public ResponseEntity<ErrorMessage> methodNotSupportedException(HttpRequestMethodNotSupportedException e, HttpServletRequest request) {
      String errorDescription = e.getLocalizedMessage();
      return new ResponseEntity<>(
              new ErrorMessage(errorDescription),
              new HttpHeaders(),
              HttpStatus.METHOD_NOT_ALLOWED
      );
   }

   @ExceptionHandler(value = {EmptyResultDataAccessException.class})
   public ResponseEntity<ErrorMessage> emptyResultDataAccess(EmptyResultDataAccessException e, HttpServletRequest request) {
      String errorDescription = "Registro não encontrado no banco de dados.";

      return new ResponseEntity<>(new ErrorMessage(errorDescription),
              new HttpHeaders(), HttpStatus.NOT_FOUND);

   }

   @ExceptionHandler(value = {DataIntegrityViolationException.class})
   public ResponseEntity<ErrorMessage> dataIntegrityViolation(DataIntegrityViolationException e, HttpServletRequest request) {

      String errorDescription;

      if (request.getMethod().equals("DELETE")) {
         errorDescription = "Não é possível excluir o registro pois ele já está atrelado a outros lançamentos.";
      } else if (request.getMethod().equals("POST")) {
         errorDescription = "Não é possível incluiur o registro, verifique os dados inseridos";
      } else {
         errorDescription = "Erro ao executar a operação";
      }

      return new ResponseEntity<>(new ErrorMessage(errorDescription),
              new HttpHeaders(), HttpStatus.BAD_REQUEST);
   }

   @ExceptionHandler(value = {javax.validation.ConstraintViolationException.class})
   public ResponseEntity<ErrorMessage> javaxConstraintViolation(javax.validation.ConstraintViolationException e, HttpServletRequest request) {
      String errorDescription = "Alguma constraint foi violada, verifique os dados";

      return new ResponseEntity<>(
              new ErrorMessage(errorDescription),
              new HttpHeaders(),
              HttpStatus.BAD_REQUEST
      );
   }

   @ExceptionHandler(value = {ConstraintViolationException.class})
   public ResponseEntity<ErrorMessage> hibernateConstraintViolationException(ConstraintViolationException e, HttpServletRequest request) {
      String errorDescription;

      if (request.getMethod().equals("DELETE")) {
         errorDescription = "Não é possível excluir o registro pois ele já está atrelado a outros lançamentos.";
      }
      else if (request.getMethod().equals("POST")) {
         errorDescription = "Não é possível incluiur o registro, verifique os dados inseridos";
      }
      else {
         errorDescription = "Erro ao executar a operação";
      }

      return new ResponseEntity<>(new ErrorMessage(errorDescription),
              new HttpHeaders(), HttpStatus.BAD_REQUEST);
   }

}
