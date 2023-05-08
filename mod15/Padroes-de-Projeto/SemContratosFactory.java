public class SemContratosFactory extends Factory{
    @Override
    Car retrieveCar(String requestedGrade) {
        if ("A".equals(requestedGrade)) {
            return new Fusca(120, "gasolina", "preto");
        } else {
            return null;
        }
    }
}