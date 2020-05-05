		/* Name: Logan G.
		 * Date: Jan. 17th 2020
		 * Purpose: As part of the ISU, my job is to work on the airplane portion of the ISU
		 */
		import java.util.*;
		public class isucode {
			public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean correct;
		int trip = 0;
		int month =0;
		int flight_here = 0;
		int days =0;
		int month1=0;
		int days1 = 0;
		
		
		final int porter_cost = 296;
		final int return_porter_cost=296;
		final int air_canada = 325;
		final int return_air_canada = 560;
		int num_people=0;
		String[] assigned_seats;
		Random seat_place = new Random();
		Random seat_num = new Random();
		int DAY[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};
		String MONTH[]= {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		do
		{
		System.out.println("To begin, please enter your month of travel as a number form 1-12 as terms of months, ie. January=1");
		month = input.nextInt();
		}
		while (month >= 13 && month <= 0); 
		System.out.println(MONTH[month-1]);
		
		do
		{
		System.out.println("Now enter the day that you plan on leaving, depending on the month.");
		days = input.nextInt();
		days = DAY[days-1];
		if (month == 1 && days > 0 && days <=31) 
		{
			correct = true;
		}
		else if (month == 2 && days > 0 && days <=29)
		{
			correct = true;
		}
		else if (month==3 && days > 0 && days<=31) 
		{
			correct = true;
		}
		else if (month==4 &&days > 0 && days <=30)
		{
			correct = true;
		}
		else if (month==5 && days > 0 &&days<=31) 
		{
			correct = true;
		}
		else if (month==6 &&days > 0 && days <=30) 
		{
			correct = true;
		}
		else if (month==7 && days > 0 &&days<=31)
		{
		correct = true;
		}
		else if (month==8 && days > 0 &&days<=31)
		{
			correct = true;
		}
		else if (month==9 && days > 0 &&days<=30)
		{
			correct=true;
		}
		else if (month == 10 &&days > 0 && days<=31)
		{
			correct = true;
		}
		else if (month==11 && days > 0 &&days<=30)
		{
			correct = true;
		}
		else if (month == 12 &&days > 0 && days <=31)
		{
			correct = true;
		}
		}
		while (correct = false);
		System.out.println(MONTH[month-1] +"," + days +","+ "2020");
		String COMING_FROM[]= {"Toronto", "Quebec City","PEI", "Vancouver", "Banff", "Newfoundland"};
		String GOING_TO[]= {"Toronto", "Quebec City","PEI", "Vancouver", "Banff", "Newfoundland"};
		System.out.println("Welcome to the airplane portion of our Travel Agency.");
		System.out.println("Here you will be able to set your flight plans for your trip in Canada");
		System.out.println("Now, list the area in which you are begin at.");
		System.out.println("1. Toronto \n2. Quebec City \n3. PEI \n4. Vancouver \n5. Banff \n6. Newfoundland");
		System.out.println("Select the number of the location you are traveling to.");
		int location = input.nextInt();
		if (location==1)
		{
			System.out.println("Toronto");
			System.out.println("1. Quebec City \n 2. PEI \n 3. Vancouver \n 4. Banff \n 5. Newfoundland");
			System.out.println("Now select the place you're traveling to.");
			int destination = input.nextInt();
			if (destination ==1)
			{
				System.out.println("Quebec City");
				System.out.println("Toronto-Qucbec City");
				System.out.println("Is your trip one-way or return trip?");
				System.out.println("1. One-way \n2.Return trip");
				trip = input.nextInt();
				if (trip==1)
				{
					System.out.println("Now how many poeple are in your group in total");
		      num_people = input.nextInt();
		      assigned_seats = findSeat(num_people);
					
					System.out.println("Here is your total: $" + (porter_cost*num_people));
		    
				}
				else if (trip==2)
				{
					do
					{
					System.out.println("Now select your return date of travel, starting with the month. Do it the same way as your starting date and make sure it's not before your starting date.");
					month1 = input.nextInt();
					System.out.println(MONTH[month1-1]);
					}
				while (month1<month);
					do 
					{
					System.out.println("Please enter your day of return like before.");
					days1=input.nextInt();
					days1 = DAY[days1];
					if (month1 == 1 && days1 > 0 && days1 <=31) 
					{
						correct = true;
					}
					else if (month1 == 2 && days1 > 0 && days1 <=29)
					{
						correct = true;
					}
					else if (month1==3 && days1 > 0 && days1<=31) 
					{
						correct = true;
					}
					else if (month1==4 &&days1 > 0 && days1 <=30)
					{
						correct = true;
					}
					else if (month1==5 && days1 > 0 &&days1<=31) 
					{
						correct = true;
					}
					else if (month1==6 &&days1 > 0 && days1 <=30) 
					{
						correct = true;
					}
					else if (month1==7 && days1 > 0 &&days1<=31)
					{
					correct = true;
					}
					else if (month1==8 && days1 > 0 &&days1<=31)
					{
						correct = true;
					}
					else if (month1==9 && days1 > 0 &&days1<=30)
					{
						correct=true;
					}
					else if (month1 == 10 &&days1 > 0 && days1<=31)
					{
						correct = true;
					}
					else if (month1==11 && days1 > 0 &&days1<=30)
					{
						correct = true;
					}
					else if (month1 == 12 &&days1 > 0 && days1 <=31)
					{
						correct = true;
					}
					}
					while (correct = false);
					System.out.println("Available times:\n 1. Porter Airlines: 11:35 A.M.-1:05 P.M., doesn't include overhead bin, $319 \n2. Air Canada: 4:50 P.M.-6:17 P.M., $325\n 3. West Jet: 10:05 A.M.-11:53 A.M., $560");
					System.out.println("Now select the flight that you want to choose.");
					flight_here = input.nextInt();
					if (flight_here==1)			
					{
					System.out.println("This will be your returning flight for " + month1 + "," + days1 + "2020" );
					System.out.println("Porter Airlines: 1:40 P.M.-3:30 P.M., doesn't include overhead bin, $296");
								System.out.println("Here is your total: $" + (porter_cost*num_people) + (return_porter_cost*num_people));
		    
					}
					}
					if (flight_here==2)	//Toronto-Quebec Air Canada
					{
					System.out.println("This will be your returning flight for " + month1 + "," + days1 + "2020" );
					System.out.println("Air Canada: 5:00 A.M.-6:36 A.M., $560");
					
					System.out.println("Here is your total: $" + (air_canada*num_people) + (return_air_canada*num_people));
					}
		     
					}
				
			
		}
		 	if (flight_here==3)	//Toronto-Quebec 
					{
					System.out.println("This will be your returning flight for " + month1 + "," + days1 + "2020" );
					System.out.println("Air Canada: 5:00 A.M.-6:36 A.M., $560");
					
					System.out.println("Here is your total: $" + (air_canada*num_people) + (return_air_canada*num_people));
					}
		     
					}
				
			
		
		
		    
		  
		
		//End of main method
		
			private static String[] findSeat(int numPeople) {
				// TODO Auto-generated method stub
				Scanner input = new Scanner(System.in);
				int rand = 0;
				Random seat_place = new Random();
				Random seat_num = new Random();
			
				System.out.println("Now input the number of people are traveling with you in total.");
				numPeople = input.nextInt();
				for (int i = 0;i <=numPeople;i++)
				{
					rand = seat_place.nextInt(7);
					if (rand == 0)
					{
						System.out.println("Row A");
						int rand1=seat_num.nextInt(7);
						if (rand1==0)
						{
							System.out.println("Seat number:1");
						}
						else if (rand1==1)
						{
							System.out.println("Seat number:2");
						}
						else if (rand1==2)
						{
							System.out.println("Seat number:3");
						}
						else if (rand1==3)
						{
							System.out.println("Seat number:4");
						}
						else if (rand1==4)
						{
							System.out.println("Seat number:5");
						}
						else if (rand1==5)
						{
							System.out.println("Seat number:6");
						}
						else if (rand1==6)
						{
							System.out.println("Seat number:7");
						}
					}
					
				else if (rand == 1)
				{
					System.out.println("Row B");
					int rand1=seat_num.nextInt(7);
					if (rand1==0)
					{
						System.out.println("Seat number:1");
					}
					else if (rand1==1)
					{
						System.out.println("Seat number:2");
					}
					else if (rand1==2)
					{
						System.out.println("Seat number:3");
					}
					else if (rand1==3)
					{
						System.out.println("Seat number:4");
					}
					else if (rand1==4)
					{
						System.out.println("Seat number:5");
					}
					else if (rand1==5)
					{
						System.out.println("Seat number:6");
					}
					else if (rand1==6)
					{
						System.out.println("Seat number:7");
					}
				}
				else if (rand == 2)
				{
					System.out.println("Row C");
					int rand1=seat_num.nextInt(7);
					if (rand1==0)
					{
						System.out.println("Seat number:1");
					}
					else if (rand1==1)
					{
						System.out.println("Seat number:2");
					}
					else if (rand1==2)
					{
						System.out.println("Seat number:3");
					}
					else if (rand1==3)
					{
						System.out.println("Seat number:4");
					}
					else if (rand1==4)
					{
						System.out.println("Seat number:5");
					}
					else if (rand1==5)
					{
						System.out.println("Seat number:6");
					}
					else if (rand1==6)
					{
						System.out.println("Seat number:7");
					}
				}
				else if (rand == 3)
				{
					System.out.println("Row D");
					int rand1=seat_num.nextInt(7);
					if (rand1==0)
					{
						System.out.println("Seat number:1");
					}
					else if (rand1==1)
					{
						System.out.println("Seat number:2");
					}
					else if (rand1==2)
					{
						System.out.println("Seat number:3");
					}
					else if (rand1==3)
					{
						System.out.println("Seat number:4");
					}
					else if (rand1==4)
					{
						System.out.println("Seat number:5");
					}
					else if (rand1==5)
					{
						System.out.println("Seat number:6");
					}
					else if (rand1==6)
					{
						System.out.println("Seat number:7");
					}
				}
				else if (rand == 4)
				{
					System.out.println("Row E");
					int rand1=seat_num.nextInt(7);
					if (rand1==0)
					{
						System.out.println("Seat number:1");
					}
					else if (rand1==1)
					{
						System.out.println("Seat number:2");
					}
					else if (rand1==2)
					{
						System.out.println("Seat number:3");
					}
					else if (rand1==3)
					{
						System.out.println("Seat number:4");
					}
					else if (rand1==4)
					{
						System.out.println("Seat number:5");
					}
					else if (rand1==5)
					{
						System.out.println("Seat number:6");
					}
					else if (rand1==6)
					{
						System.out.println("Seat number:7");
					}
				}
				else if (rand == 5)
				{
					System.out.println("Row F");
					int rand1=seat_num.nextInt(7);
					if (rand1==0)
					{
						System.out.println("Seat number:1");
					}
					else if (rand1==1)
					{
						System.out.println("Seat number:2");
					}
					else if (rand1==2)
					{
						System.out.println("Seat number:3");
					}
					else if (rand1==3)
					{
						System.out.println("Seat number:4");
					}
					else if (rand1==4)
					{
						System.out.println("Seat number:5");
					}
					else if (rand1==5)
					{
						System.out.println("Seat number:6");
					}
					else if (rand1==6)
					{
						System.out.println("Seat number:7");
					}
				}
				else if (rand == 6)
				{
					System.out.println("Row G");
					int rand1=seat_num.nextInt(7);
					if (rand1==0)
					{
						System.out.println("Seat number:1");
					}
					else if (rand1==1)
					{
						System.out.println("Seat number:2");
					}
					else if (rand1==2)
					{
						System.out.println("Seat number:3");
					}
					else if (rand1==3)
					{
						System.out.println("Seat number:4");
					}
					else if (rand1==4)
					{
						System.out.println("Seat number:5");
					}
					else if (rand1==5)
					{
						System.out.println("Seat number:6");
					}
					else if (rand1==6)
					{
						System.out.println("Seat number:7");
					}
				}
				}
					String seats[]=new String[numPeople];
					return seats;
			
		
		
		
		
		
		
		
				
				
			
			}//End of findSeat method
			public static (int month1,int days1, int month, int days) {
				Scanner input = new Scanner(System.in);
				String MONTH[]= {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
				int DAY[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};
				do
			{
			System.out.println("Now select your return date of travel, starting with the month. Do it the same way as your starting date and make sure it's not before your starting date.");
			month1 = input.nextInt();
			System.out.println(MONTH[month1-1]);
			}
		while (month1<month);
			boolean correct;
			do 
			{
			System.out.println("Please enter your day of return like before.");
			days1=input.nextInt();
			days1 = DAY[days1];
			if (month1 == 1 && days1 > 0 && days1 <=31) 
			{
				correct = true;
			}
			else if (month1 == 2 && days1 > 0 && days1 <=29)
			{
				correct = true;
			}
			else if (month1==3 && days1 > 0 && days1<=31) 
			{
				correct = true;
			}
			else if (month1==4 &&days1 > 0 && days1 <=30)
			{
				correct = true;
			}
			else if (month1==5 && days1 > 0 &&days1<=31) 
			{
				correct = true;
			}
			else if (month1==6 &&days1 > 0 && days1 <=30) 
			{
				correct = true;
			}
			else if (month1==7 && days1 > 0 &&days1<=31)
			{
			correct = true;
			}
			else if (month1==8 && days1 > 0 &&days1<=31)
			{
				correct = true;
			}
			else if (month1==9 && days1 > 0 &&days1<=30)
			{
				correct=true;
			}
			else if (month1 == 10 &&days1 > 0 && days1<=31)
			{
				correct = true;
			}
			else if (month1==11 && days1 > 0 &&days1<=30)
			{
				correct = true;
			}
			else if (month1 == 12 &&days1 > 0 && days1 <=31)
			{
				correct = true;
			}
			}
			while (correct = false);
			
			}
			
		
		}//End of program
		
		
		
		
		
