package comp2100.types.facade;

public class FacadeDemo {
	
    public static void main(String[] args) {
        ComputerFacade computer = new ComputerFacade();
        computer.start();	// don't need to care about internal structure of computer
    }

}
