# Spring Boot API com ChatGPT

Este projeto é uma API Spring Boot desenvolvida com a versão 3.2.2, Java 21 e Maven. A finalidade principal é demonstrar como consumir a API do ChatGPT utilizando o `RestTemplate` para fins de teste e estudo.

## Pré-requisitos
- Java 21
- Maven
- Conta no ChatGPT para obter a chave de API

## Configuração

### 1. Obtenha uma chave de API do ChatGPT
Certifique-se de ter uma conta no ChatGPT e obtenha sua chave de API.

### 2. Configure a chave de API
No arquivo `application.properties` ou `application.yml`, adicione a chave de API obtida como:

```properties
chatgpt.api.key=<<Sua chave de API>>
