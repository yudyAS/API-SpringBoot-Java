# API-SpringBoot-Java

# Sistema API REST de Usuários e Departamentos

Este é um projeto de uma API REST simples para gerenciamento de usuários e departamentos. O sistema permite realizar operações básicas, como buscar todos os usuários, buscar um usuário específico pelo ID e inserir novos usuários. Foi desenvolvido em *Java, utilizando o framework **Spring Boot* e o banco de dados interno *H2*. 

---

## *Funcionalidades*

1. *Buscar todos os usuários*  
   Endpoint para listar todos os usuários cadastrados no sistema.

   ![Image](https://github.com/user-attachments/assets/89fd5936-7b84-482b-9db8-285b645d6b59)

3. *Buscar um usuário pelo ID*  
   Endpoint para retornar os detalhes de um usuário específico com base no seu identificador único.

   ![Image](https://github.com/user-attachments/assets/e67aab4a-cef6-4fd8-9017-3fe77fa194e9)

5. *Inserir um novo usuário*  
   Endpoint para adicionar novos usuários ao sistema.

---

## *Tecnologias Utilizadas*

- *Java*: Linguagem principal do projeto.  
- *Spring Boot*: Framework usado para a criação e gerenciamento da API REST.  
- *H2 Database*: Banco de dados interno utilizado para armazenamento dos dados.  
- *Postman*: Ferramenta para testes e validação dos endpoints.  
- *Eclipse*: IDE utilizada no desenvolvimento do projeto.

---

## *Requisitos para Execução*

- *Java 11 ou superior* instalado no sistema.
- Maven configurado (caso não esteja configurado, o Spring Boot cuida das dependências no projeto).  
- IDE compatível com projetos Spring Boot (ex: Eclipse, IntelliJ).  

---

## *Como Executar o Projeto*

1. Clone o repositório ou baixe o código-fonte.  
2. Abra o projeto no *Eclipse* ou na IDE de sua preferência.  
3. Certifique-se de que todas as dependências no arquivo pom.xml sejam resolvidas.  
4. Execute a aplicação Spring Boot a partir da classe principal (geralmente chamada Application ou Main).  
5. O sistema estará disponível no endereço padrão: http://localhost:8080.

---

## *Endpoints da API*

### *Base URL:*  
http://localhost:8080

#### *1. Buscar todos os usuários*  
- *Método:* GET  
- *Endpoint:* /users  
- *Descrição:* Retorna uma lista de todos os usuários cadastrados.  

#### *2. Buscar um usuário pelo ID*  
- *Método:* GET  
- *Endpoint:* /users/{id}  
- *Descrição:* Retorna os dados de um usuário específico.  
- *Parâmetro:*  
  - id (Long): Identificador do usuário.

#### *3. Inserir um novo usuário*  
- *Método:* POST  
- *Endpoint:* /users  
- *Descrição:* Adiciona um novo usuário ao sistema.  
- *Body (JSON):*  
```json
{
  "name": "Nome do Usuário",
  "email": "usuario@exemplo.com",
  "department": {
      "id": numero do departamento
   }
}
```

## Configuração do Banco de Dados H2

O banco de dados H2 é configurado automaticamente com o Spring Boot. Para acessar a interface do banco de dados:

#### 1. Execute o projeto.


#### 2. Acesse a URL: http://localhost:8080/h2-console.


#### 3. Use as seguintes credenciais de conexão:

JDBC URL: jdbc:h2:mem:testdb

User: sa

Password: (deixe em branco)





---

## Possíveis Melhorias

Implementar autenticação e autorização para maior segurança.

Adicionar validações nos campos dos endpoints.

Criar endpoints para editar e excluir usuários e departamentos.

Integrar com um banco de dados externo (ex: MySQL, PostgreSQL).



---

### Desenvolvido como projeto de estudo em Java e Spring Boot.
