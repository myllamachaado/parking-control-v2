# Parking Control V2
Projeto de uma API REST Java que gerencia vagas de estacionamento - V2

<p align="center">
    <a alt="Java">
          <img src="https://img.shields.io/badge/Java-v17-blue.svg" />
    </a>
    <a alt="Spring Boot">
        <img src="https://img.shields.io/badge/Spring_Boot-v3.1.0-red.svg" />
    </a>
    <a alt="Spring Security">
        <img src="https://img.shields.io/badge/Spring_Security-v5.3.1-blueviolet.svg" />
    </a>
  <a alt="Maven">
        <img src="https://img.shields.io/badge/Maven-v3.1.1-orange.svg" />
  </a>
    <a alt="JPA">
        <img src="https://img.shields.io/badge/JPA-v3.1.0-brightgreen.svg" />
    </a>
     <a alt="Validation">
        <img src="https://img.shields.io/badge/Validation-v3.0.2-red.svg" />
  </a>
     <a alt="Model Mapper">
        <img src="https://img.shields.io/badge/Model_Mapper-v3.1.1-orange.svg" />
  </a>
  <a alt="Lombok">
          <img src="https://img.shields.io/badge/Lombok-v1.18.20.0-blue.svg" />
    </a>
    <a alt="MySql">
        <img src="https://img.shields.io/badge/MySql-v2.1.214-brightgreen.svg" />
    </a>
     <a alt="JUnit">
        <img src="https://img.shields.io/badge/JUnit-v4.13.2-red.svg" />
    </a>
</p>


Projeto desenvolvido no curso de Spring Boot ministrado pela [Michelle Brito](https://github.com/MichelliBrito). O projeto consiste em desenvovler um gerenciador de vagas de estacionamento. Essa versão possui as seguintes melhorias citadas no curso:


- [x] Criar entidades próprias para o carro e a marca (junto com seus respectivos services e controllers)

- [x] Utilização de Mappers no lugar da propriedade BeanUtils.copyProperties

- [x] Adição de um ExceptionHadler

- [x] Adição do Spring Security

- [x] Adição de endpoints (GET / POST / PUT / UPDATE) para manipular o Usuário 



### Execução do projeto

Para executar o projeto na sua máquina, digite o seguinte comando:
```
mvn spring-boot:run 
```

A descrição com todos os endpoints da aplicação pode ser encontrada [neste link](https://github.com/myllamachaado/parking-control-v2/tree/main/src/postman).
