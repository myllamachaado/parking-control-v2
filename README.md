# Parking Control V2
Projeto de uma API REST Java que gerencia vagas de estacionamento - V2

![image](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white) ![image](https://img.shields.io/badge/apache_maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white) ![image](https://img.shields.io/badge/Hibernate-59666C?style=for-the-badge&logo=Hibernate&logoColor=white) ![image](https://img.shields.io/badge/MariaDB-003545?style=for-the-badge&logo=mariadb&logoColor=white)


Projeto desenvolvido no curso de Spring Boot ministrado pela [Michelle Brito](https://github.com/MichelliBrito). O projeto consiste em desenvovler um gerenciador de vagas de estacionamento. Essa versão possui as seguintes melhorias citadas no curso:


- [x] Criar entidades próprias para o carro e a marca (junto com seus respectivos services e controllers)

- [x] Utilização de Mappers no lugar da propriedade BeanUtils.copyProperties

- [x] Adição de um ExceptionHadler




### Execução do projeto

Para executar o projeto na sua máquina, digite o seguinte comando:
```
mvn spring-boot:run 
```

Observação: Como é possível observar no arquivo application.properties a porta padrão desse projeto é 8081 e não 8080.

A descrição com todos os endpoints da aplicação pode ser encontrada [neste link](https://documenter.getpostman.com/view/18686677/UVeNm2nE).
