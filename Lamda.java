interface Car {
    public void drive(String source , String destination);
}

//class Ola implements Car{
//
//    @Override
//    public void drive(String source , String destination) {
//        System.out.println("This car is driving from "+source+ " to "+destination);
//    }
//}


public class Lamda {
    public static void main(String[] args) {
//        Ola cab = new Ola();
//        cab.drive("Chennai" , "Bangalore");
        Car cab = (source , destination)-> System.out.println("This car is driving from "+source+ " to "+destination);
        cab.drive("Chennai" , "Bangalore");
    }
}
