package foodservicepublisher;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FoodPublishImpl implements FoodPublish{


	int NoOfperson;
	double price;
	
	@Override
	public void FoodService() {
	
		Scanner sc = new Scanner(System.in);
		String pay;
		double fdprice=0.00;
		double price=0.00;
		
		    System.out.println("\nMenu 1 = Breakfast | (Rs.600/= per each )");
			System.out.println("Available Breakfast types are : \n Bread with chicken curry & sambol  \n String Hoppers with chicken curry & sambol  \n Hoppers & chilipaste \n MilkRice \n");
			
			System.out.println("Menu 2 = Lunch | (Rs.1300/= per each )");
			System.out.println("Available Lunch meal types are : \n Chckicken fried rice \nvVegan vegi rice  \n Seafood Mix rice \n Soya vegi meal \n Pork Indian rice \n");
			
			System.out.println("Menu 3 = Dinner | (Rs.900/= per each )");
			System.out.println("Available Dinner meal types are : \n Chicken spicy mix rice \n Cheese & chicken kottu \n Special vegan kottu \n Indian food menu \n");
			
			
			System.out.println("Menu 4 = Snacks | (Rs.300/= per each )");
			System.out.println("Available Evenning Snacks types are (Rs.300/=): \n Milk tea & choclate cake piece \n Milk tea & Biscuits \n Plain tea & butter cake \n Plain tea & chocklate cake \n");
			
			System.out.println("6% service charges for more than five heads");
			System.out.println("5% service charges includes for all prices below 5 heads");
			
			System.out.println("\nEnter the Menu number:\n");
			String smenu = sc.nextLine();			
			int menu  = Integer.parseInt(smenu);
			System.out.println("\nEnter no of person\n");
			String sNoOfperson = sc.nextLine();
			int NoOfperson  = Integer.parseInt(sNoOfperson);
			
			
			if (menu==1) 
			{
				System.out.println("Breakfast");	

				if(NoOfperson == 1)
				{
					fdprice = 600 * 1 ;
					price = fdprice + (fdprice * 0.50);
					System.out.println("Your food price is:" +fdprice);
					System.out.println("Total food price is (  plus service charges ):" +price);
				}
				else if(NoOfperson == 2)
				{
					fdprice = 600 * 2 ;
					price = fdprice + (fdprice * 0.50);
					System.out.println("Your food price is:" +fdprice);
					System.out.println("Total food price is (  plus service charges ):" +price);
				}
				else if(NoOfperson == 3)
				{
					fdprice = 600 * 3 ;
					price = fdprice + (fdprice * 0.50);
					System.out.println("Your food price is:" +fdprice);
					System.out.println("Total food price is (  plus service charges ):" +price);
				}
				else if(NoOfperson == 4)
				{
					fdprice = 600 * 4 ;
					price = fdprice + (fdprice * 0.50);
					System.out.println("Your food price is:" +fdprice);
					System.out.println("Total food price is (  plus service charges ):" +price);	
				}
				else if(NoOfperson == 5)
				{
					fdprice = 600 * 5 ;
					price = fdprice + (fdprice * 0.50);
					System.out.println("Your food price is:" +fdprice);
					System.out.println("Total food price is (  plus service charges ):" +price);	
				}
				else
					
					fdprice = 600 * 6 ;
					price = fdprice + (fdprice * 0.60);
					System.out.println("Your food price is:" +fdprice);
					System.out.println("Total food price is (  plus service charges ):" +price);	
				}
					
			
					
			else if(menu == 2) 
			{
						
				System.out.println("Lunch");
	
				if(NoOfperson == 1)
				{
					fdprice = 1300 * 1 ;
					price = fdprice + (fdprice * 0.50);
					System.out.println("Your food price is:" +fdprice);
					System.out.println("Total food price is (  plus service charges ):" +price);
				}
				else if(NoOfperson == 2)
				{
					fdprice = 1300 * 2 ;
					price = fdprice + (fdprice * 0.50);
					System.out.println("Your food price is:" +fdprice);
					System.out.println("Total food price is (  plus service charges ):" +price);
				}
				else if(NoOfperson == 3)
				{
					fdprice = 1300 * 3 ;
					price = fdprice + (fdprice * 0.50);
					System.out.println("Your food price is:" +fdprice);
					System.out.println("Total food price is (  plus service charges ):" +price);
				}
				else if(NoOfperson == 4)
				{
					fdprice = 1300 * 4 ;
					price = fdprice + (fdprice * 0.50);
					System.out.println("Your food price is:" +fdprice);
					System.out.println("Total food price is (  plus service charges ):" +price);
				}
				else if(NoOfperson == 5)
				{
					fdprice = 1300 * 5 ;
					price = fdprice + (fdprice * 0.50);
					System.out.println("Your food price is:" +fdprice);
					System.out.println("Total food price is (  plus service charges ):" +price);
				}
				else
				{
					fdprice = 1300 * 6 ;
					price = fdprice + (fdprice * 0.60);
					System.out.println("Your food price is:" +fdprice);
					System.out.println("Total food price is (  plus service charges ):" +price);	
					
				
				}
					
					
			}
			else if(menu == 3) 
			{
						
				System.out.println("Dinner");

				if(NoOfperson == 1)
				{
					fdprice = 900 * 1 ;
					price = fdprice + (fdprice * 0.50);
					System.out.println("Your food price is:" +fdprice);
					System.out.println("Total food price is (  plus service charges ):" +price);
				}
				else if(NoOfperson == 2)
				{
					fdprice = 900 * 2 ;
					price = fdprice + (fdprice * 0.50);
					System.out.println("Your food price is:" +fdprice);
					System.out.println("Total food price is (  plus service charges ):" +price);
				}
				else if(NoOfperson == 3)
				{
					fdprice = 900 * 3 ;
					price = fdprice + (fdprice * 0.50);
					System.out.println("Your food price is:" +fdprice);
					System.out.println("Total food price is (  plus service charges ):" +price);
				}
				else if(NoOfperson == 4)
				{
					fdprice = 900 * 4 ;
					price = fdprice + (fdprice * 0.50);
					System.out.println("Your food price is:" +fdprice);
					System.out.println("Total food price is (  plus service charges ):" +price);
				}
				else if(NoOfperson == 5)
				{
					fdprice = 900 * 5 ;
					price = fdprice + (fdprice * 0.50);
					System.out.println("Your food price is:" +fdprice);
					System.out.println("Total food price is (  plus service charges ):" +price);
				}
				else
				{
					fdprice = 900 * 6;
					price = fdprice + (fdprice * 0.60);
					System.out.println("Your food price is:" +fdprice);
					System.out.println("Total food price is (  plus service charges ):" +price);	
				}
							
			}
			else if(menu == 4) 
			{
						
				System.out.println("Snacks");
	
				if(NoOfperson == 1)
				{
					fdprice = 300 * 1 ;
					price = fdprice + (fdprice * 0.50);
					System.out.println("Your food price is:" +fdprice);
					System.out.println("Total food price is (  plus service charges ):" +price);
				}
				else if(NoOfperson == 2)
				{
					fdprice = 300 * 2 ;
					price = fdprice + (fdprice * 0.50);
					System.out.println("Your food price is:" +fdprice);
					System.out.println("Total food price is (  plus service charges ):" +price);
				}
				else if(NoOfperson == 3)
				{
					fdprice = 300 * 3 ;
					price = fdprice + (fdprice * 0.50);
					System.out.println("Your food price is:" +fdprice);
					System.out.println("Total food price is (  plus service charges ):" +price);
				}
				else if(NoOfperson == 4)
				{
					fdprice = 300 * 4 ;
					price = fdprice + (fdprice * 0.50);
					System.out.println("Your food price is:" +fdprice);
					System.out.println("Total food price is (  plus service charges ):" +price);	
				}
				else if(NoOfperson == 5)
				{
					fdprice = 300 * 5 ;
					price = fdprice + (fdprice * 0.50);
					System.out.println("Your food price is:" +fdprice);
					System.out.println("Total food price is (  plus service charges ):" +price);	
				}
				else
				{
					fdprice = 300 * 6 ;
					price = fdprice + (fdprice * 0.60);
					System.out.println("Your food price is:" +fdprice);
					System.out.println("Total food price is (  plus service charges ):" +price);	
				}
				
							
			}
			else
			{
				System.out.println("Not valid menu number");	
			}
	}

}
