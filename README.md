# Mini Bank em Java

Aplicação de terminal que simula operações bancárias básicas, desenvolvida em Java seguindo o padrão MVC.

## Funcionalidades

- Criação e login de contas corrente ou poupança
- Depósito e saque
- Consulta de saldo

## Pré-requisitos

- Git
- JDK 17 ou superior

Confirme a instalação do Java:

```bash
java --version
```

## Como clonar e executar

```bash
git clone https://github.com/FabioCoutinho1/Mini-Bank-using-Java-with-MVC.git
cd Mini-Bank-using-Java-with-MVC
mkdir -p out
javac -d out $(find src -name "*.java")
java -cp out Main
```

Após iniciar, use o menu no terminal para criar uma conta, entrar nela e realizar as operações.

## Estrutura

- `src/model`: entidades e regras do domínio
- `src/controller`: lógica de controle da aplicação
- `src/view`: interação com o usuário pelo terminal
- `src/Main.java`: ponto de entrada

