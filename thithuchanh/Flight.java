package java.thithuchanh;

public class Flight {
    private int Number;
    private String Destination;

    public Flight(){
       this.Number = 0 ;
       this.Destination = "";
    }

    public Flight(int number, String destination){
        this.Number = number;
        this.Destination = destination;
    }

    public void display(){
        System.out.println("number :" + Number + "," + "Destination" + Destination );
    }

    public int getNumber() {
        return Number;
    }

    public String getDestination(){
        return Destination;
    }
}
