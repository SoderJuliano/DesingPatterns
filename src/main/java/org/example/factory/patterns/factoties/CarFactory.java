package org.example.factory.patterns.factoties;

import org.example.factory.patterns.interfaces.Car;
import org.example.factory.patterns.model.Audi;
import org.example.factory.patterns.model.BMW;
import org.example.factory.patterns.model.Jeep;

/**
 * <h2>Factory Pattern</h2>
 * <p>
 * O padrão Factory é um padrão de design criacional que fornece uma interface para criar objetos em uma superclasse,
 * mas permite que as subclasses alterem o tipo de objetos que serão criados.
 * </p>
 * <p>
 * A classe {@code CarFactory} é um exemplo de implementação do padrão Factory. Ela contém um método estático
 * {@link #getCar(String)} que recebe o nome de um carro como parâmetro e retorna uma instância do tipo de carro
 * correspondente. Isso permite que a lógica de criação de objetos seja centralizada em um único lugar, facilitando
 * a manutenção e a adição de novos tipos de carros.
 * </p>
 * <p>
 * Exemplo de uso:
 * <pre>
 *     Car bmw = CarFactory.getCar("BMW");
 *     Car audi = CarFactory.getCar("Audi");
 * </pre>
 * </p>
 */
public class CarFactory {

    public static Car getCar(String carName) {

        return switch (carName) {
            case "BMW" -> new BMW();
            case "Audi" -> new Audi();
            case "Jeep" -> new Jeep();
            default -> throw new IllegalArgumentException("Car not found");
        };
    }
}
