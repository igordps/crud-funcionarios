# Projeto Java Swing - CRUD de Funcionários com Login

Este é um projeto de exemplo em Java Swing que implementa um CRUD (Create, Read, Update, Delete) para funcionários, com uma funcionalidade de login.
Obs.: Não foi utilizado nenhum framework ORM para mapeamento de entidades, então será necessário seguir as instruções abaixo para criar o banco e as tabelas utilizadas.

## Instruções

### 1. Preparar o Banco de Dados

Para rodar o projeto, é necessário criar um banco de dados PostgreSQL e configurar as tabelas. Siga os passos abaixo:

1. **Criar o banco de dados**:
    ```sql
    CREATE DATABASE funcionariosdb;
    ```

2. **Criar as tabelas**:
    ```sql
    CREATE TABLE login (
        id SERIAL PRIMARY KEY,
        nome VARCHAR(255),
        email VARCHAR(255) UNIQUE NOT NULL,
        senha VARCHAR(255) NOT NULL
    );
    
    CREATE TABLE funcionario (
        id SERIAL PRIMARY KEY,
        nome VARCHAR(255),
        data_admissao DATE,
        valor_salario DECIMAL(10, 2),
        status BOOLEAN
    );
    ```

### 2. Configurar o Arquivo de Configurações

Você deve configurar os detalhes de acesso ao banco de dados no arquivo `config.properties`. Este arquivo está localizado no pacote de recursos do projeto.

Aqui está um exemplo de como o arquivo `config.properties` deve ser configurado:

```properties
# Configurações do banco de dados
db.url=jdbc:postgresql://localhost:5432/funcionariosdb
db.username=seu_usuario
db.password=sua_senha
