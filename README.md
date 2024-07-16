# Java API de Conversão de Moedas

Este projeto consiste em uma API Java para conversão de moedas, utilizando a ExchangeRate-API para obter taxas de câmbio em tempo real.

## Instruções de Uso

### Requisitos
- Java JDK 8 ou superior
- Maven

### Configuração Inicial
1. Clone o repositório: `git clone https://github.com/seu-usuario/seu-projeto.git`
2. Configure sua chave de API da ExchangeRate-API no arquivo `src/main/java/com/example/api/ApiService.java`

### Como Executar
1. Compile o projeto: `mvn clean install`
2. Execute a aplicação: `java -jar target/nome-do-arquivo.jar`

## Exemplos de Uso

```java
// Exemplo de código para converter 100 USD para EUR
CurrencyConverter converter = new CurrencyConverter();
double amount = 100;
double convertedAmount = converter.convertCurrency(amount, "USD", "EUR");
System.out.println(amount + " USD equivalem a " + convertedAmount + " EUR");


