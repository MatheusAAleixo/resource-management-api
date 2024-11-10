# API REST - Java 17, Spring Boot 3, Spring Data JPA

Este repositório contém a implementação de uma API REST desenvolvida com Java 17, Spring Boot 3, Spring Data JPA, e documentada utilizando Swagger OpenAPI. A API permite a gestão de usuários, com funcionalidades para criar, listar, atualizar e excluir registros de usuários.

## Funcionalidades

- **Cadastro de Usuários**: Permite criar um novo usuário com informações de nome e e-mail.
- **Listagem de Usuários**: Exibe todos os usuários cadastrados no banco de dados.
- **Atualização de Usuários**: Permite atualizar as informações de um usuário existente.
- **Exclusão de Usuários**: Permite remover um usuário do banco de dados.

## Tecnologias Utilizadas

- **Java 17**: Versão LTS mais recente do Java.
- **Spring Boot 3**: Framework utilizado para a construção da API.
- **Spring Data JPA**: Facilita a interação com o banco de dados e manipulação de entidades JPA.
- **Swagger (OpenAPI)**: Documentação automática da API.
- **H2 Database**: Banco de dados em memória para fins de desenvolvimento.
- **Railway**: Ferramenta para deployment da API na nuvem.

## Endpoints da API

### 1. Listar todos os usuários

- **Endpoint**: `GET /api/users`
- **Descrição**: Retorna todos os usuários cadastrados.
- **Exemplo de resposta**:
  ```json
  [
      {
          "id": 1,
          "name": "João Silva",
          "email": "joao.silva@example.com"
      },
      {
          "id": 2,
          "name": "Maria Souza",
          "email": "maria.souza@example.com"
      }
  ]

# Documentação da API REST

## 2. Criar um novo usuário
- **Endpoint:** `POST /api/users`
- **Descrição:** Cria um novo usuário com nome e e-mail.
- **Exemplo de requisição:**

  ```json
  {
      "name": "Carlos Pereira",
      "email": "carlos.pereira@example.com"
  }
- **Exemplo de Resposta**

  ```json
  {
    "id": 3,
    "name": "Carlos Pereira",
    "email": "carlos.pereira@example.com"
  }

## 3. Atualizar um usuário existente
- **Endpoint:** `PUT /api/users/{id}`
- **Descrição:** Atualiza as informações de um usuário existente.
- **Exemplo de requisição:**

  ```json
  {
      "name": "Carlos Pereira Atualizado",
      "email": "carlos.pereira.updated@example.com"
  }

- **Exemplo de Resposta**

  ```json
  {
    "id": 3,
    "name": "Carlos Pereira",
    "email": "carlos.pereira@example.com"
  }

## 4. Excluir um usuário
- **Endpoint:** `DELETE /api/users/{id}`
- **Descrição:** Exclui o usuário com o ID especificado.
- **Exemplo de requisição:**

  ```json
  {
      "message": "Usuário excluído com sucesso."
  }

## Documentação da API
A documentação da API é gerada automaticamente e pode ser acessada pelo Swagger UI. Para visualizar a documentação, basta acessar a URL do Swagger no navegador:
http://localhost:8080/swagger-ui/


## Configuração do Banco de Dados
Por padrão, a aplicação utiliza o banco de dados H2 em memória para o armazenamento dos dados. Se preferir usar outro banco, como MySQL ou PostgreSQL, edite o arquivo `application.properties` com as configurações do banco desejado.

### Exemplo de configuração para o H2:

```properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=password
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.h2.console.enabled=true
```

### Exemplo de configuração para o MySQL:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/your_database
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.database-platform=org.hibernate.dialect.MySQL5Dialect
```

## Deploy na Nuvem
Esta API foi configurada para ser facilmente implantada na nuvem usando o Railway. Para fazer o deploy da aplicação:

1. Crie uma conta no Railway e crie um novo projeto.
2. Conecte seu repositório GitHub ao Railway.
3. Configure o deploy para o seu repositório e execute.
4. Após o deploy, a API estará disponível online.

## Como Executar Localmente
Para rodar a API localmente, siga os passos abaixo:

1. Clone o repositório:

   ```bash
   git clone https://github.com/seu-usuario/api-rest-java17-springboot.git
2. Navegue até o diretório do projeto:
    ```bash
    cd api-rest-java17-springboot
3. Execute o projeto com o comando:
    ```bash
    ./mvnw spring-boot:run

A API estará disponível em http://localhost:8080.

## Contribuindo

1. Faça um fork deste repositório.
2. Crie uma nova branch (git checkout -b minha-nova-feature).
3. Realize as alterações necessárias e faça o commit (git commit -am 'Adicionando nova funcionalidade').
4. Envie a branch para o seu repositório (git push origin minha-nova-feature).
5. Abra um pull request.