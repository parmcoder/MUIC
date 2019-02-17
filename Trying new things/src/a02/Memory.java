package a02;

public class Memory {
    private int size;

    public  int getSize(){
        return this.size;
    }
    public void setSize(int s){
        this.size = s;
    }

    public void performSelfTest(){
        int i;
        for(i=0; i<3; i++){
            System.out.println("Beep");
        }
        performHaHa();
    }

    public void performHaHa(){
        int i;
        for(i=0; i<2; i++){
            System.out.println("Ha");
        }
        performYahoo();
    }

    public void performYahoo(){
        int i;
        for(i=0; i<2; i++){
            System.out.println("Yahoo");
        }
    }
}
