package com.api.parkingcontrol.exceptions;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class ErrorMessage implements Serializable {

   public ErrorMessage(String mensagem) {
      this.mensagem = mensagem;
   }

   private String mensagem;

}