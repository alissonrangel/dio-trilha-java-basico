## Repositório para o desafio de projeto do curso de Java do Bootcamp Java DIO/Santander 2023

### Author: Alisson Rangel [@alissonrangel](https://github.com/alissonrangel)

### Decisões de projeto
- java version "20.0.2" 2023-07-18
- Uso da classe Scanner como pedido no desafio;
- Para capturar o nome do cliente, que pode ser composto, eu utilizei o método:
```
scanner.nextLine();
```
Obs.: Mas para utilizar o método nextLine() tive que colocar um outro scanner.nextLine(), para limpar o Scanner e não saltar a linha de captura de dados com scanner.nextLine();

```
//outras capturas com scanner

//usando scanner.nextLine()
System.out.print("Por favor, digite seu nome: ");
scanner.nextLine(); //limpando o scanner
String nomeDoCliente = scanner.nextLine(); //capturando o dado que eu quero
```



