import java.util.Scanner;
class Games{
    public static void main(String args[])
    {
        String name,city,country,food,animal;
        int age;
        Scanner input = new Scanner(System.in);

        System.out.println("enter your name:");
        name = input.nextLine();
        System.out.println("my name is :"+name);

        System.out.println("enter your city");
        city = input.nextLine();
        System.out.println("my city is :"+city);

        System.out.println("enter your country");
        country = input.nextLine();
        System.out.println("my country is :"+country);

        System.out.println("enter your food");
        food = input.nextLine();
        System.out.println("my food is :"+food);

        System.out.println("enter your favorite animal");
        animal = input.nextLine();
        System.out.println("my favorite animal is :"+animal);

        System.out.println("enter your age");
        age = input.nextInt();
        System.out.println("my age is :"+age);

    }
}