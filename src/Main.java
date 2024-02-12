//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


@FunctionalInterface
interface Kawasaki {
   public  void bookBike();
}


public class Main  {
    public static void main(String[] args) {
       Kawasaki z650=()-> System.out.println("z650 is booked!");
       z650.bookBike();

    }


        }

