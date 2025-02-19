package org.example.singleton;

/**
 * <h2>Singleton Pattern</h2>
 * <p>
 * O padrão Singleton é um padrão de design criacional que garante que uma classe tenha apenas uma instância e
 * fornece um ponto global de acesso a essa instância.
 * </p>
 * <p>
 * A classe {@code Car} implementa o padrão Singleton para garantir que apenas um carro seja criado com um modelo
 * e ano específicos. O construtor é privado para impedir a instanciação direta, e um método estático
 * {@link #getInstance(String, int)} é fornecido para retornar a instância única.
 * </p>
 * <p>
 * Exemplo de uso:
 * <pre>
 *     Car car = Car.getInstance("Toyota Camry", 2025);
 *     System.out.println(car.getModel()); // Toyota Camry
 *     System.out.println(car.getYear());  // 2025
 * </pre>
 * </p>
 */
public class Car {
    private static Car instance;
    private String model;
    private int year;

    // Construtor privado pra impedir a instanciação direta
    private Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    // Método estático para retornar a instância única
    public static Car getInstance(String model, int year) {
        if (instance == null) {
            instance = new Car(model, year);
        }
        return instance;
    }

    // Getter para o modelo
    public String getModel() {
        return model;
    }

    // Getter para o ano
    public int getYear() {
        return year;
    }
}
