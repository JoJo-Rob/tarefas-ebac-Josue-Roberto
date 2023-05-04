public class Car {

    private int horsePower;
    private String fuelSource;
    private String color;

    public Car(int horsePower, String fuelSource, String color) {
        this.horsePower = horsePower;
        this.fuelSource = fuelSource;
        this.color = color;
    }

    public void startEngine(){
        System.out.println(getClass().getSimpleName());
        System.out.println("O motor está abastecido com " + fuelSource + ", foi iniciado e está pronto para utilizar " + horsePower + " cavalos de potência!");
    }
    public void clean(){
        System.out.println("O carro foi limpo e a cor " + color.toLowerCase() + " está brilhando com a limpeza!");
    }
    public void mechanicCheck(){
        System.out.println("O carro foi verificado pelo mecânico. Tudo parece em ordem!");
    }
    public void fuelCar(){
        System.out.println("O carro está sendo abastecido com " + fuelSource.toLowerCase() + "!");
    }
}
