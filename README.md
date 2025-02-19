# Projeto de Exemplos de Padrões de Projeto
Este projeto demonstra o uso de dois padrões de projeto (Design Patterns) em Java 23 com Spring: Factory Pattern e Singleton Pattern.  
## Padrões de Projeto
### Factory Pattern
O Factory Pattern é um padrão de design criacional que fornece uma interface para criar objetos em uma superclasse, mas permite que as subclasses alterem o tipo de objetos que serão criados. Neste projeto, a classe CarFactory é usada para criar diferentes tipos de carros (BMW, Audi, Jeep). A lógica de criação de objetos é centralizada em um único lugar, facilitando a manutenção e a adição de novos tipos de carros.
#### Exemplo de Uso:
```java
Car bmw = CarFactory.getCar("BMW");
Car audi = CarFactory.getCar("Audi");
```
### Singleton Pattern
O Singleton Pattern é um padrão de design criacional que garante que uma classe tenha apenas uma instância e fornece um ponto global de acesso a essa instância. Neste projeto, a classe Car implementa o padrão Singleton para garantir que apenas um carro seja criado com um modelo e ano específicos.
#### Exemplo de Uso:
```java
Car car = Car.getInstance("Toyota Camry", 2025);
System.out.println(car.getModel()); // Toyota Camry
System.out.println(car.getYear());  // 2025
```
### Tecnologias Utilizadas
- Java 23
- Spring Framework
#### Como Executar
Clone o repositório.
Importe o projeto em sua IDE preferida (recomendado: IntelliJ IDEA).
Execute a classe Main para ver os exemplos dos padrões de projeto em ação.
### Estrutura do Projeto
- src/main/java/org/example/factory/patterns/factoties/CarFactory.java: Implementação do Factory Pattern.
- src/main/java/org/example/singleton/Car.java: Implementação do Singleton Pattern.
- src/main/java/org/example/Main.java: Classe principal que demonstra o uso dos padrões de projeto
