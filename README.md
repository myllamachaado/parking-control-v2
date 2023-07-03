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

- [x] Adição do Spring Security (basic auth)

- [x] Adição de endpoints (GET / POST / PUT / UPDATE) para manipular o Usuário 



### - Execução do projeto localmente

1) Faça um clone do repositório: git clone `https://github.com/myllamachaado/projeto-algalog-api-entregas.git`
2) Compile o projeto: `mvn clean install`
3) Ajuste o application.properties para comportaras configurações do seu banco de dados nos seguintes localis:
```
spring.datasource.url=jdbc:mysql://<endereço do seu servidor local>:3306/parking
spring.datasource.username=<seu usuário>
spring.datasource.password=<sua senha>

spring.flyway.url=jdbc:mysql://<endereço do seu servidor local>:3306/parking
spring.flyway.user=<seu usuario>
spring.flyway.password=<sua senha>
```
4) Execute o projeto: mvn spring-boot::run


### - Execução do projeto utilizando o Docker
1)  Faça um clone do repositório:
`git clone https://github.com/myllamachaado/projeto-algalog-api-entregas.git`
2) Compile o projeto:
`mvn clean install`
3)  Execute o projeto:
`docker-compose up -d`


### - Basic Auth
Os usuários pré cadastrados são:
`user1 -> senha123`
`user2 -> senha123`
`user3 -> senha123`


### - Postman collection

A coleção com todos os endpoints para a execução se encontra no próprio projeto com o nome `Algawork.postman_collection.json`. Basta importar o arquivo json no postman para ter acesso a todos os endpoints. 
