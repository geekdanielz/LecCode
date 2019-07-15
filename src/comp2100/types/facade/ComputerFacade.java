package comp2100.types.facade;

/* Complex parts */

class CPU {
	private long position = 0;
	
	public void freeze() {}
	
    public void jump(long position) {
    	this.position = position;
    }
    
    public void execute() {
    	System.out.println("CPU execute: " + position);
    }
}

class HardDrive {
    public byte[] read(long lba, int size) {
    	System.out.println("HD read: " + lba + ", " + size);
    	return null;
    }
}

class Memory {
    public void load(long position, byte[] data) {
    	System.out.println("Mem load: " + position);
    }
}

/* Facade */

public class ComputerFacade {
	private final long BOOT_ADDRESS = 11111;
	private final long BOOT_SECTOR = 22;
	private final int SECTOR_SIZE = 64;
	
    private final CPU processor;
    private final Memory ram;
    private final HardDrive hd;

    public ComputerFacade() {
        this.processor = new CPU();
        this.ram = new Memory();
        this.hd = new HardDrive();
    }

    public void start() {
        processor.freeze();
        ram.load(BOOT_ADDRESS, hd.read(BOOT_SECTOR, SECTOR_SIZE));
        processor.jump(BOOT_ADDRESS);
        processor.execute();
    }
}
