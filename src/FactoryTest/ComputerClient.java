package FactoryTest;

public class ComputerClient {

    public static void main(String[] args) {

        Computer pc = ComputerFactory.createComputer(ComputerType.PC, "1GB", "256GB", "Intel Core 2 Duo");
        Computer server = ComputerFactory.createComputer(ComputerType.Server, "32GB", "1TB", "AMD Ryzen 7 2700X");

        System.out.println("PC System: " + pc);
        System.out.println("Server System: " + server);
    }



}

