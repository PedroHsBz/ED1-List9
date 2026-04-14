# Estrutura de dados
# ED1-List9

Este repositório contém a implementação de uma Lista Sequencial em Java focada no gerenciamento de uma **Booklist** de livros, atividade integrante da disciplina de Estrutura de Dados I. O projeto consiste no desenvolvimento de uma estrutura baseada em arrays de tamanho fixo para armazenar IDs de livros, com foco no aprendizado da manipulação de índices, lógica de deslocamento de elementos (shift) e encapsulamento de dados.

---

## 📚 Exercícios

O objetivo principal desta atividade é criar uma estrutura do zero onde os livros permaneçam organizados sequencialmente na memória, garantindo integridade e ausência de "buracos" na booklist.

---

### 🧩 Arquivos e Estrutura

1. **`BookListTAD.java`**: A interface que define o contrato da estrutura de dados. Contém as assinaturas de todos os métodos que uma booklist deve obrigatoriamente implementar (inserção, remoção, busca e estado).
2. **`BookList.java`**: A classe concreta que implementa a `BookListTAD`. Utiliza um array unidimensional de inteiros (`int[] book`) de tamanho fixo para guardar os IDs dos livros, gerenciando o deslocamento seguro de elementos para evitar espaços em branco ("buracos") na memória.
3. **`main.java`**: A classe principal que arranca a aplicação. Possui um menu interativo executado no console que permite ao utilizador definir o tamanho da booklist e testar todas as funcionalidades desenvolvidas em tempo real.

---

## 🚀 Funcionalidades (Menu Interativo)

Ao executar o programa, o utilizador tem acesso ao seguinte menu de operações:

- **1. Adicionar livro (addBook)**: Insere o ID de um novo livro na primeira posição livre ao final da fila.
- **2. Inserir livro (insertBook)**: Insere um livro num índice específico. Realiza um *Shift Right* (deslocamento para a direita) dos elementos seguintes para não sobrescrever dados existentes.
- **3. Remover livro (removeBook)**: Localiza o ID informado e remove-o da booklist, aplicando um *Shift Left* (deslocamento para a esquerda) nos elementos seguintes para manter o array contíguo.
- **4. Encontrar livro por id (findBook)**: Vasculha o array e retorna em que índice (posição) um determinado ID de livro está armazenado.
- **5. Encontrar livro por índice (getBook)**: Retorna qual é o ID do livro que se encontra numa posição específica da fila.
- **6. Setar um livro (setBook)**: Substitui diretamente o livro de um índice específico por um novo ID.
- **7. Exibir informações de estado**: Retorna em tempo real:
  - Quantidade atual de livros (`countBook`).
  - Se a booklist atingiu o limite máximo (`bookListFull`).
  - Se a booklist está totalmente sem livros (`bookListEmpty`).
- **8. Exibir todos os livros (display)**: Imprime a booklist formatada no console (ex: `[ 10 20 30 ]`).
- **0. Sair**: Encerra a execução do programa.

---

## 🛠️ Tratamento de Erros Implementado

A classe `BookList` foi construída para ser segura e evitar falhas de execução (como o temido `ArrayIndexOutOfBoundsException`). Os seguintes tratamentos foram incluídos:
- Bloqueio de inserção caso a booklist já tenha atingido a capacidade máxima informada pelo utilizador.
- Validação de índices negativos ou maiores do que a quantidade de elementos armazenados ao tentar inserir, ler ou modificar dados.
- Verificação de lista vazia ao tentar remover ou buscar livros.
- Avisos via console se o utilizador tentar remover ou procurar um ID que não existe na booklist.

---

## 🚀 Recursos Implementados

O projeto inclui:

- Código em Java puro (sem frameworks).
- Organização lógica focada no controle de estado interno com variáveis encapsuladas (`private`).
- Lógica de deslocamento de dados no array (shift right e shift left) para as operações de inserção e remoção de livros.
- Tratamento básico de erros com impressões no console para índices inválidos e bloqueio de inserção quando a booklist atinge a capacidade máxima.

---

## 🧩 Estrutura de Pastas

```text
├── src
|   └── main.java
│   └── BookList.java
└────── BookListTAD.java
- **7. Exibir informações de estado**: Retorna em tempo real:
  - Quantidade atual de músicas (`countMusic`).
  - Se a playlist atingiu o limite máximo (`playListFull`).
  - Se a playlist está totalmente sem músicas (`playListEmpty`).
- **8. Exibir todos as músicas (display)**: Imprime a playlist formatada no console (ex: `[ 10 20 30 ]`).
- **0. Sair**: Encerra a execução do programa.

---

## 🛠️ Tratamento de Erros Implementado

A classe `PlayList` foi construída para ser segura e evitar falhas de execução (como o temido `ArrayIndexOutOfBoundsException`). Os seguintes tratamentos foram incluídos:
- Bloqueio de inserção caso a playlist já tenha atingido a capacidade máxima informada pelo utilizador.
- Validação de índices negativos ou maiores do que a quantidade de elementos armazenados ao tentar inserir, ler ou modificar dados.
- Verificação de lista vazia ao tentar remover ou buscar músicas.
- Avisos via console se o utilizador tentar remover ou procurar um ID que não existe na playlist.

---
## 🚀 Recursos Implementados

O projeto inclui:

- Código em Java puro (sem frameworks).
- Organização lógica focada no controle de estado interno com variáveis encapsuladas (`private`).
- Lógica de deslocamento de dados no array (shift right e shift left) para as operações de inserção e remoção de músicas.
- Tratamento básico de erros com impressões no console para índices inválidos e bloqueio de inserção quando a playlist atinge a capacidade máxima.

---

## 🧩 Estrutura de Pastas

```text
├── src
|   └── main.java
│   └── PlayList.java
└────── PlayListTAD.java



# ED1-List9
