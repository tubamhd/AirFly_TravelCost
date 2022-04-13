import java.util.Scanner;

public class TicketPrice {
    public static void main(String[] args) {
        double distance, age, travel, updatedtotal;
        double km = 0.10;
        double total;

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Air Fly.\nPlease Enter Your Information Below.");

        //----------COST CALCULATİNG PART------
        System.out.print("Enter Distance (km):  ");
        distance = input.nextDouble();
        total = distance * km;
        System.out.println("Distance Cost: "+ total);

        System.out.print("Enter Your Age:  ");
        age = input.nextDouble();

        //---------DİSCOUNT PART-------

        if (age < 12){
            double discount = total * 0.50;
            updatedtotal = total - discount;
            System.out.println("Discount amount: "+ updatedtotal);

            System.out.print("Choose the travel type.\n1-One Way.\n2-Round Trip.");
            travel = input.nextDouble();
            if (travel == 1){
                System.out.println("One Way Trip, Total Amount:  "+ updatedtotal);
            }else if (travel == 2){
                travel = updatedtotal * 0.20;
                double travel1 = (updatedtotal - travel)* 2;
                System.out.println("Round Trip, Total Amount: "+ travel1);
            }else{
                System.out.println("Wrong Input! Please Try Again!");
            }
        }

        if (age > 12 && age < 24){
            double discount = total * 0.10;
            updatedtotal = total - discount;
            System.out.println("Discount amount: "+ updatedtotal);

            System.out.print("Choose the travel type.\n1-One Way.\n2-Round Trip.");
            travel = input.nextDouble();
            if (travel == 1){
                System.out.println("One Way Trip, Total Amount:  "+ updatedtotal);
            }else if (travel == 2){
                travel = updatedtotal * 0.20;
                double travel1 = (updatedtotal - travel)* 2;
                System.out.println("Round Trip, Total Amount: "+ travel1);
            }else{
                System.out.println("Wrong Input! Please Try Again!");
            }
        }
        if (age > 25 && age < 63){

            System.out.print("Choose the travel type.\n1-One Way.\n2-Round Trip.");
            travel = input.nextDouble();
            if (travel == 1){
                System.out.println("One Way Trip, Total Amount:  "+ total);
            }else if (travel == 2){
                travel = total * 0.20;
                double travel1 = (total - travel)* 2;
                System.out.println("Round Trip, Total Amount: "+ travel1);
            }else{
                System.out.println("Wrong Input! Please Try Again!");
            }
        }

        if (age > 63){
            double discount = total * 0.30;
            updatedtotal = total - discount;
            System.out.println("Discount amount: "+ updatedtotal);

            System.out.print("Choose the travel type.\n1-One Way.\n2-Round Trip.");
            travel = input.nextDouble();
            if (travel == 1){
                System.out.println("One Way Trip, Total Amount:  "+ updatedtotal);
            }else if (travel == 2){
                travel = updatedtotal * 0.20;
                double travel1 = (updatedtotal - travel)* 2;
                System.out.println("Round Trip, Total Amount: "+ travel1);
            }else{
                System.out.println("Wrong Input! Please Try Again!");
            }
        }

    }
}


