# 📚 Library Management System

Sistema de gerenciamento de biblioteca desenvolvido em **Java puro**, com foco em boas práticas de Programação Orientada a Objetos e arquitetura em camadas.

---

## 🚀 Funcionalidades

| Funcionalidade | Status |
|---|---|
| Cadastro de livros | ✅ |
| Cadastro de usuários | ✅ |
| Empréstimo de livros | ✅ |
| Devolução de livros | ✅ |
| Controle de disponibilidade | ✅ |
| Validação de usuários e livros | ✅ |
| Listagem de livros por usuário | ✅ |
| Status de livros via Enum | ✅ |

---

## 🛠️ Tecnologias

- **Java** — linguagem principal
- **IntelliJ IDEA** — IDE
- **Git & GitHub** — versionamento

---

## 📂 Estrutura do projeto

```
src/
 └── main/
      └── java/
           ├── app/         → ponto de entrada da aplicação
           ├── domain/      → entidades do sistema (Livro, Usuario, Biblioteca)
           ├── service/     → regras de negócio e validações
           └── enums/       → estados dos livros (StatusLivro)
```

---

## 🧠 Conceitos aplicados

- **Encapsulamento** — atributos privados com getters/setters
- **Enums** — controle de estado dos livros
- **Arquitetura em camadas** — domain / service / app
- **Modelagem de domínio** — entidades com responsabilidades bem definidas
- **Validações** — regras de negócio centralizadas no service
- **Arrays** — gerenciamento manual de coleções

---

## 📖 Entidades

### 📘 Livro
Representa um livro dentro da biblioteca.

```java
private String titulo;
private String autor;
private int paginas;
private StatusLivro status; // DISPONIVEL | EMPRESTADO
```

### 👤 Usuario
Representa um usuário cadastrado na biblioteca.

```java
private String nome;
private String CPF;
private Livro[] livrosEmprestados;
```

### 🏛️ Biblioteca
Armazena e gerencia os dados da biblioteca.

```java
private Livro[] livros;
private Usuario[] usuarios;
```

---

## 🔄 Fluxo de empréstimo

```
1. Verifica se o livro existe
2. Verifica se o livro está DISPONIVEL
3. Verifica se o usuário existe
4. Adiciona o livro ao usuário
5. Atualiza status → EMPRESTADO
```

---

## 📌 Status dos livros

```java
public enum StatusLivro {
    DISPONIVEL,
    EMPRESTADO
}
```

---

## 🚧 Próximos passos

- [ ] Menu interativo no console
- [ ] Busca de livros e usuários
- [ ] Limite de empréstimos por usuário
- [ ] Migração para `ArrayList`
- [ ] Persistência com banco de dados (JDBC + MySQL)
- [ ] API REST com Spring Boot

---

## 👨‍💻 Autor

Desenvolvido por **Alevir Coelho Neto**

[![GitHub](https://img.shields.io/badge/GitHub-alevir--dev-181717?style=flat&logo=github)](https://github.com/alevir-dev)
[![LinkedIn](https://img.shields.io/badge/LinkedIn-alevir--coelho--neto-0077B5?style=flat&logo=linkedin)](https://linkedin.com/in/alevir-coelho-neto)
