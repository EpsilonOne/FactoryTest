package FactoryTest;

public class ComputerFactory {

    public static Computer createComputer(ComputerType type, String ram, String hdd, String cpu) {

        Computer comp = null;
        switch (type) {
            case PC:
                comp = new PC(ram, hdd, cpu);
                break;
            case Server:
                comp = new Server(ram, hdd, cpu);
                break;
        }

        return comp;
    }
}