# Cálculo de Frete/Desconto

Aplicação em Spring Boot para cálculo de frete, utilizando o valor da mercadoria e desconto aplicados.  

Esse é um projeto criado para o curso "Dev Superior" do Nélio Alves.

## 🚀 Tecnologias
- Java 24+
- Spring Boot
- Maven

## ▶️ Como executar
Rodar pelo PS do Windows:
```> mvnw.cmd spring-boot:run```   

Irá abrir no próprio console do Spring para inserir os dados.

## Regras de negócio do sistema   
DESAFIO: Componentes e injeção de dependência   

Você deve criar um sistema para calcular o valor total de um pedido, considerando uma porcentagem
de desconto e o frete. O cálculo do valor total do pedido consiste em aplicar o desconto ao valor
básico do pedido, e adicionar o valor do frete. A regra para cálculo do frete é a seguinte:   

Valor básico do pedido (sem desconto)                                  | Frete   
Abaixo de R$ 100.00 -------------------------------> R$ 20.00   
De R$ 100.00 até R$ 200.00 exclusive --------------> R$ 12.00   
R$ 200.00 ou mais ---------------------------------> Grátis

   
Valor do desconto: em percentual (%)


- <img width="812" height="462" alt="Image" src="https://github.com/user-attachments/assets/38e2d42a-09de-4386-897f-8ad7f3a63004" />
