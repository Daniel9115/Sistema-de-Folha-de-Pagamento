# 💼 Sistema de Folha de Pagamento

Sistema desenvolvido em **Java** para gerenciamento e geração de folha de pagamento de funcionários, com suporte a diferentes tipos de vínculo empregatício. O projeto aplica conceitos de **Programação Orientada a Objetos (POO)**, como herança e polimorfismo.

---

## 📋 Funcionalidades

- Cadastrar **Funcionário Padrão** (salário fixo)
- Cadastrar **Funcionário Comissionado** (salário fixo + comissão sobre vendas)
- Cadastrar **Funcionário por Produção** (remuneração por peças produzidas)
- Gerar **Folha de Pagamento** com todos os funcionários cadastrados
- Listar nome, matrícula, salário base, extras e salário final de cada funcionário

---

## 🏗️ Estrutura do Projeto

```
Sistema-de-Folha-de-Pagamento/
├── Main.java                      # Ponto de entrada e menu interativo
├── FuncionarioPadrao.java         # Classe base: salário fixo de R$ 2.000,00
├── FuncionarioComissionado.java   # Herda FuncionarioPadrao + comissão sobre vendas
├── FuncionarioProducao.java       # Herda FuncionarioPadrao + valor por peça produzida
```

---

## 🧩 Tipos de Funcionário

| Tipo               | Salário Base | Extras                                  |
|--------------------|--------------|-----------------------------------------|
| `FuncionarioPadrao`       | R$ 2.000,00  | Nenhum                                  |
| `FuncionarioComissionado` | R$ 2.000,00  | % de comissão sobre o total de vendas   |
| `FuncionarioProducao`     | R$ 2.000,00  | Qtde de peças × valor por peça          |

---

## ▶️ Como Executar

### Pré-requisitos

- [Java JDK 8+](https://www.oracle.com/java/technologies/downloads/) instalado
- (Opcional) IntelliJ IDEA ou outra IDE Java

### Via terminal

```bash
# Clone o repositório
git clone https://github.com/Daniel9115/Sistema-de-Folha-de-Pagamento.git

# Acesse a pasta
cd Sistema-de-Folha-de-Pagamento

# Compile os arquivos
javac *.java

# Execute o programa
java Main
```

---

## 🖥️ Exemplo de Uso

```
=====================================================
         SISTEMA DE FOLHA DE PAGAMENTO
=====================================================
1 - Cadastrar Funcionário Padrão
2 - Cadastrar Funcionário Comissionado
3 - Cadastrar Funcionário Produção
4 - Gerar Folha de Pagamento
0 - Sair
=========== Selecione uma opção ===========
Opção: 4

Total de pessoas cadastradas: 6
👤 Nome: João Silva       | 📄 Matrícula: 101  | 💰 Salário Fixo: R$2000.0  | 📈 Extras: 0.0  | 💵 Salário final: R$2000.0
👤 Nome: Carlos Oliveira  | 📄 Matrícula: 201  | 💰 Salário Fixo: R$2000.0  | 📈 Extras: 500.0| 💵 Salário final: R$2500.0
...
```

---

## 🛠️ Tecnologias Utilizadas

- **Java** — linguagem principal
- **ArrayList** — armazenamento dinâmico de funcionários
- **Scanner** — leitura de dados via terminal
- **POO** — herança, polimorfismo e encapsulamento

---

## 📂 Diagrama de Classes (simplificado)

```
FuncionarioPadrao
├── nome: String
├── matricula: Integer
├── salarioBase: double = 2000.0
├── calcularSalarioFinal(): double
└── mostrarDados(): String
      ↑
      ├── FuncionarioComissionado
      │     ├── percentualComissao: double
      │     ├── totalVendas: double
      │     └── calcularSalarioFinal(): double  (salarioBase + comissão)
      │
      └── FuncionarioProducao
            ├── valorPorPeca: double
            ├── quantidadeProduzida: int
            └── calcularSalarioFinal(): double  (salarioBase + peças × valor)
```

---

## 👤 Autor

**Daniel** — [@Daniel9115](https://github.com/Daniel9115)
