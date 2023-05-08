public class ContratosFactory extends Factory {
    @Override
    Car retrieveCar(String requestedGrade) {
        if ("A".equals(requestedGrade)) {
            return new Gol(100, "etanol", "azul-bebê");
        } else {
            return null;
        }
    }
}