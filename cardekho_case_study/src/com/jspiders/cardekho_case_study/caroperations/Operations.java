package com.jspiders.cardekho_case_study.caroperations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.jspiders.cardekho_case_study.main.Menu;
import com.jspiders.cardekho_case_study.entity.Car;

public class Operations {
	List<Car> cars = new ArrayList<Car>();
	Scanner sc = new Scanner(System.in);
	Car c = new Car();
	
	//ADD CAR DETAILS
	public  void addCarDetails() {
		System.out.println("How Many Car Details You Want To Add?");
		int val = sc.nextInt();
		for(int i = 0; i<val; i++) {
			Car car = new Car();
			System.out.println("Enter Car Id : ");
			car.setCarID(sc.nextInt());
			System.out.println("Enter Car Name : ");
			car.setName(sc.next());
			System.out.println("Enter Car Model : ");
			car.setModel(sc.next());
			System.out.println("Enter Car Brand : ");
			car.setBrand(sc.next());
			System.out.println("Enter Car Fuel Type : ");
			car.setFuelType(sc.next());
			System.out.println("Enter Car Price : ");
			car.setPrice(sc.nextDouble());
			cars.add(car);
			System.out.println(car.getName() + " Added Successfully!!");
			}
		getCarDetails();
	}
	
	//SEARCH CAR DETAILS
	public void searchCarDetails() {
		System.out.println("Search Car By \n1.Name\n2.Brand\n3.Fuel Type\n4.Go Back To Main Menu");
		System.out.println("Enter Your Choice : ");
		int ch = sc.nextInt();
		
		switch (ch) {
		case 1:
			if(cars.isEmpty()) {
				System.out.println("No Car Details Available!");
			}else {
				System.out.println("Enter Car Name: ");
				String name = sc.next();
				List<Car> carr = new ArrayList<Car>();
//				for(int i = 0; i<cars.size(); i++) {
//					String str = cars.get(i).getName();
//					int compare = str.compareToIgnoreCase(name);
//					if(compare == 0){
////						carr.add(cars);
//					}
//				}
				for(Car car: cars) {
					if(car.getName().equalsIgnoreCase(name)) {
						carr.add(car);
					}
				}
				System.out.println("Total car details : " + carr.size());
				 System.out.println("CAR_ID "+ "CAR_NAME "+"CAR_MODEL " +"CAR_BRAND "+"FUEL_TYPE "+"PRICE" );
					System.out.println("====================================================================");
					for(Car car : carr) {
						System.out.println(car.getCarID() + "  " + car.getName() + "  " + car.getModel() + "  " + car.getBrand() + "  " + car.getFuelType() + "  " + car.getPrice());
					}
			}
			break;
		
		case 2:
			if(cars.isEmpty()) {
				System.out.println("No Car Details Available!");
			}else {
				System.out.println("Enter Car Brand: ");
				String brand = sc.next();
				List<Car> carr = new ArrayList<Car>();
				for(Car car: cars) {
					if(car.getName().equalsIgnoreCase(brand)) {
						carr.add(car);
					}
				}
				System.out.println("Total car details : " + carr.size());
				 System.out.println("CAR_ID "+ "CAR_NAME "+"CAR_MODEL " +"CAR_BRAND "+"FUEL_TYPE "+"PRICE" );
					System.out.println("====================================================================");
					for(Car car : carr) {
						System.out.println(car.getCarID() + "  " + car.getName() + "  " + car.getModel() + "  " + car.getBrand() + "  " + car.getFuelType() + "  " + car.getPrice());
					}
			}
			break;
		
		case 3:
			
			if(cars.isEmpty()) {
				System.out.println("No Car Details Available!");
			}else {
				System.out.println("Enter Car Fuel Type: ");
				String fuel = sc.next();
				List<Car> carr = new ArrayList<Car>();
				for(Car car: cars) {
					if(car.getName().equalsIgnoreCase(fuel)) {
						carr.add(car);
					}
				}
				System.out.println("Total car details : " + carr.size());
				 System.out.println("CAR_ID "+ "CAR_NAME "+"CAR_MODEL " +"CAR_BRAND "+"FUEL_TYPE "+"PRICE" );
					System.out.println("====================================================================");
					for(Car car : carr) {
						System.out.println(car.getCarID() + "  " + car.getName() + "  " + car.getModel() + "  " + car.getBrand() + "  " + car.getFuelType() + "  " + car.getPrice());
					}
				
			}
			break;
		
		case 4:
//			System.out.println("Go Back To Main Menu!");
			Menu.MenuOptions();
			break;
		
		default:
			System.out.println("Invalid Input!!Try Again");
		break;
		}
	}
	
	public void getCarDetails() {
		if(cars.isEmpty()) {
			System.out.println("Total No of Available Car Details : " +cars.size());
			System.out.println("No Car Details Available!");
		}
		else {
		 System.out.println();
		 System.out.println("Total No of Available Car Details : " +cars.size());
		 //System.out.println("CAR_ID" + "\t" + "CAR_NAME" + "\t" +"CAR_MODEL" + "\t" + "CAR_BRAND" + "\t" +"FUEL_TYPE" + "\t" +"PRICE" );
		 System.out.println("CAR_ID "+ "CAR_NAME "+"CAR_MODEL " +"CAR_BRAND "+"FUEL_TYPE "+"PRICE" );
		System.out.println("=========================================================================");
		for(Car c : cars) {
			System.out.println("    "+c);
		}
		}
	}
	
	//UPDATE CAR DETAILS
	public void updateCarDetails() {
		if(cars.isEmpty()) {
			System.out.println("Total No of Available Car Details : " +cars.size());
			System.out.println("No Car Details Available!");
		}
		else {
			getCarDetails();
		System.out.println("Update Car Details By \n1.Name\n2.Brand\n3.Fuel Type\n4.Go Back To Main Menu");
		System.out.println("Enter Your Choice : ");
		int ch = sc.nextInt();
		
		switch(ch) {
		case 1:
			System.out.println("Enter Car ID :");
			int val = sc.nextInt();
			System.out.println("Enter New Car Name :");
			String name1 = sc.next();
			for(int i = 0; i<cars.size(); i++) {
				//String name2 = cars.get(i).getName();
				if(cars.get(i).getCarID() == val) {
					cars.get(i).setName(name1);
				}
			}
				getCarDetails();
			break;
		
		case 2:
			System.out.println("Enter Car ID :");
			int val1 = sc.nextInt();
			System.out.println("Enter New Car Brand :");
			String brand1 = sc.next();
			for(int i = 0; i<cars.size(); i++) {
				//String brand2 = cars.get(i).getName();
				if(cars.get(i).getCarID() == val1) {
					cars.get(i).setBrand(brand1);
				}
			}
				getCarDetails();
			break;
		
		case 3:
			System.out.println("Enter Car ID :");
			int val2 = sc.nextInt();
			System.out.println("Enter New Fuel Type :");
			String fuelType1 = sc.next();
			for(int i = 0; i<cars.size(); i++) {
				//String brand2 = cars.get(i).getName();
				if(cars.get(i).getCarID() == val2) {
					cars.get(i).setFuelType(fuelType1);
				}
			}
			break;
		
		case 4:
			Menu.MenuOptions();
			break;
		
		default:
			System.out.println("Invalid Input!!Try Again");
			break;
		}
		}
	}
		
	//REMOVE CAR DETAILS
    public void removeCarDetails() {
    	if(cars.isEmpty()) {
			System.out.println("No Car Details Available!");
			System.out.println("Total No of Available Car Details : " +cars.size());
		}
		else {
    	System.out.println("Enter Car ID :");
    	int id = sc.nextInt();
    	if(id <= cars.size()) {
    		cars.remove(id-1);
    		getCarDetails();
		}
    	else {
    		System.out.println("Please Enter Valid Car id");
    	}
	}
    }
}

//103 if(cars.isEmpty()) {
//	System.out.println("No Car Details Available");
//	System.out.println("Total No of Available Car Details : " +cars.size());
//}
//else {
//	System.out.println("Total No of Availablr Car Details : " +cars.size());
//	System.out.println("Enter Car id :");
//	int id = sc.nextInt();
//	for(int i = 0; i<cars.size(); i++) {
//		int val = cars.get(i).getCarID();
//		if(id == val) {
//			cars.get(i).setCarID(id);
//		}
//	}
//117 }

//46 for(int i = 0; i<cars.size(); i++) {
//String str = cars.getName();
//System.out.println(str);
//if((cars.get(0).getName().compareToIgnoreCase(name)))) {
//	carr.add(cars);
//}
//int val = cars.get(0).getName().compareToIgnoreCase(name);
//if(val == 0) 
//	carr.add(cars);
//}
//}
//for(int i = 0; i<cars.size(); i++) {
//int val = cars.get(i).getName().compareToIgnoreCase(name);
//if(val == 0) {
//	carr.add(cars);
//}
//62 }
	
		
