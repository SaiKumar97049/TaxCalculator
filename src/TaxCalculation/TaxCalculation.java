package TaxCalculation;

import java.util.Scanner;

public class TaxCalculation {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Get property details

        System.out.println("Enter property location (Y/N): ");

        String propertyLocation = sc.nextLine();

        System.out.println("Enter age of construction (years): ");

        int ageOfConstruction = sc.nextInt();

        sc.nextLine();

        // Get vehicle details

        System.out.println("Enter Vehicle registration number: ");

        String registrationNumber = sc.nextLine();

        System.out.println("Enter Vehicle brand: ");

        String brand = sc.nextLine();

        System.out.println("Enter vehicle purchase cost (INR): ");

        int purchaseCost = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter vehicle maximum velocity (kmph): ");

        int maximumVelocity = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter  vehicle capacity (number of seats): ");

        int capacity = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter vehicle type of vehicle (1-3): ");

        int typeOfVehicle = sc.nextInt();

        sc.nextLine();

        // Calculate property tax

        double propertyTax = 0;

        if (propertyLocation.equalsIgnoreCase("Y")) 

       {

            if (ageOfConstruction > 0) {

                propertyTax = 0.05 * purchaseCost;

            }

        }
        // Calculate vehicle tax

        double vehicleTax = 0;

        if (registrationNumber.matches("[1-9][0-9]{3}")) 

        {

            if (brand != null && !brand.isEmpty()) 

            {

                if (purchaseCost >= 50000 && purchaseCost <= 1000000)

                {

                    if (maximumVelocity >= 120 && maximumVelocity <= 300) 

                    {

                        if (capacity >= 2 && capacity <= 50) 

                        {

                            if (typeOfVehicle >= 1 && typeOfVehicle <= 3) 

                            {

                                switch (typeOfVehicle) 

                                {

                                    case 1:

                                        vehicleTax = 0.05 * purchaseCost;

                                        break;

                                }

                            }

                        }

                    }

                }

            }

        }

        System.out.println(propertyTax);

        System.out.println(vehicleTax);

        sc.close();

    }
}