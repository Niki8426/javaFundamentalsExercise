package ObjectAndClassesExercise.VehicleCatalog;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input= scanner.nextLine();
        int countCar=0;
        int countTruck=0;
        List<VehicleCatalog> vehicleCatalogList=new ArrayList<>();
        double horsePowerCar=0;
        double horsePowerTruck=0;

        while(!input.equals("End")){
            String type=input.split(" ")[0];
            String model=input.split(" ")[1];
            String color=input.split(" ")[2];
            int horsepower=Integer.parseInt(input.split(" ")[3]);
            if(type.equals("car")){
                countCar++;
                VehicleCatalog vehicle=new VehicleCatalog("Car",model,color,horsepower);
                vehicleCatalogList.add(vehicle);
                horsePowerCar+=vehicle.getHorsepower();


            }else if(type.equals("truck")){
                countTruck++;
                VehicleCatalog vehicle=new VehicleCatalog("Truck",model,color,horsepower);
                vehicleCatalogList.add(vehicle);
                horsePowerTruck+=vehicle.getHorsepower();

            }



            input= scanner.nextLine();
        }
        input= scanner.nextLine();
        while(!input.contains("Close the Catalogue")){
            for (int i = 0; i < vehicleCatalogList.size() ; i++) {
               String singleVehicle= vehicleCatalogList.get(i).getModel();

               if(input.contains(singleVehicle)){
                   System.out.println(vehicleCatalogList.get(i));
               }

            }


            input= scanner.nextLine();;
        }

        if(countCar==0){
            System.out.printf("Cars have average horsepower of: %.2f.",horsePowerCar);
            System.out.println("");
        }else {
                double mainPower=horsePowerCar/countCar;
            System.out.printf("Cars have average horsepower of: %.2f.", mainPower);
            System.out.println("");
        }

        if(countTruck==0){

            System.out.printf("Trucks have average horsepower of: %.2f.",horsePowerTruck);
        }else {
            System.out.printf("Trucks have average horsepower of: %.2f.", horsePowerTruck / countTruck);
        }
    }
}
