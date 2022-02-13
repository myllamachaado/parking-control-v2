# Parking Control API
Projeto de uma API REST Java que gerencia vagas de estacionamento

Projeto desenvolvido no curso de Spring Boot ministrado pela [Michelle Brito](https://github.com/MichelliBrito). O projeto consiste em desenvovler um gerenciador de vagas de estacionamento. Essa é a primeira versão aprendida no curso, você pode encontrar uma v2 com melhorias [neste link](https://github.com/MichelliBrito).


Para executar o projeto na sua máquina, digite o seguinte comando:
```
mvn spring-boot:run 
```
Lista de endpoints relativos a vaga de estacioanmento:

```
http://localhost:8080/v2/parking-lots -> POST
http://localhost:8080/v2/parking-lots -> GET 
http://localhost:8080/v2/parking-lots -> GET/id
http://localhost:8080/v2/parking-lots -> PUT
http://localhost:8080/v2/parking-lots -> DELETE
```

Lista de endpoints relativos aos carros:

```
http://localhost:8080/v2/cars -> POST
http://localhost:8080/v2/cars -> GET 
http://localhost:8080/v2/cars -> GET/id
http://localhost:8080/v2/cars -> PUT
http://localhost:8080/v2/cars -> DELETE
```

Lista de endpoints relativos as marcas dos carros:
```
http://localhost:8080/v2/brands -> POST
http://localhost:8080/v2/brands -> GET 
http://localhost:8080/v2/brands -> GET/id
http://localhost:8080/v2/brands -> PUT
http://localhost:8080/v2/brands -> DELETE
```
