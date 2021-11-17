import java.util.Scanner;
  class  NO OF Egges{
      public static void main( String []args){
        Scanner input = new Scanner (System.in);
        int N_eggs = 144;
        int dozen_of_eggs = 12;
        int number_of_eggs  = N_eggs/dozen_of_eggs;
        System.out.println( "number of eggs is" + number_of_eggs);
        int dozen = N_eggs % dozen_of_eggs;
        System.out.println(" dozen " + dozen);

        
       //system.out.println("How many eggs that you hava  ");
       //int N_eggs = input.Scanner();
      }
  }