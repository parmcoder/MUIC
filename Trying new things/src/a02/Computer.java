package a02;

public class Computer {
    private int serialNo;
    Memory[] memory;

    public Computer(int s){
        this.serialNo = s;
    }

    public int getSerialNo(){
        return this.serialNo;
    }

    public void setSerialNo(int s){
        this.serialNo = s;
    }
}

