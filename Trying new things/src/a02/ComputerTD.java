package a02;

public class ComputerTD {
    public static void main(String[] args) {
        Computer c = new Computer(999);

        c.memory = new Memory[3];

        c.memory[0] = new Memory();
        c.memory[1] = new Memory();
        c.memory[2] = new Memory();
        c.memory[2].performSelfTest();
    }
}
