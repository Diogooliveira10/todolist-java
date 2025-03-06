# Projeto: To-Do List ✅

Uma API para gerenciamento de tarefas (To-Do List) desenvolvida com Java e Spring Boot. O projeto inclui a criação de rotas HTTP, validação de parâmetros, integração com banco de dados e autenticação segura utilizando JWT com Spring Security. A aplicação foi implantada na plataforma Render.

## 📌 Funcionalidades

- Criação, atualização, exclusão e listagem de tarefas.
- Autenticação segura com JWT e Spring Security.
- Integração com banco de dados H2 Database Engine.
- Validação de parâmetros.
- Criptografia de senhas com bcrypt.
- Deploy da aplicação na plataforma Render.

## 🚀 Tecnologias Utilizadas

- **Java**
- **Spring Boot**
- **Spring Web**
- **Spring Security**
- **Spring Data JPA**
- **H2 Database Engine**
- **Lombok**
- **Maven**
- **Developer Tools**
- **Insomnia** - Testes manuais da API

## 🛠️ Como Executar o Projeto

### Pré-requisitos
Antes de começar, você precisará ter instalado em sua máquina:
- **Java 17**
- **Maven**

### Passos para rodar o projeto localmente

1. Clone o repositório:
```sh
git clone https://github.com/Diogooliveira10/todolist-java.git
```
2. Acesse a pasta do projeto:
```sh
cd todolist-java
```
3. Compile e execute a aplicação:
```sh
mvn spring-boot:run
```

## 🚀 Deploy da Aplicação

A aplicação foi implantada utilizando Render. O link para acessar a API em produção é:
[To-Do List API - Deploy](https://todolist-java-hgve.onrender.com)

### Configuração do Docker

Foi criado um arquivo `Dockerfile` para configurar a imagem de construção da aplicação e facilitar sua implantação em ambientes Dockerizados.

## 📚 Conteúdo de Estudos

Este projeto faz parte dos estudos realizados pela plataforma **Rocketseat**, na trilha de formação de **Java**.