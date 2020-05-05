//made the only method the exit//all problems fixed
import java.util.Scanner;
	public class hotelcode {
		public static void main(String[] args) {

			//main menu options
			final String Option = "1.Book a flight to(Toronto, Quebec City, PEI, Vancouver, Banff, Newfoundland and Labrador)";
			final String OptionTwo = "2.Book a hotel to(Toronto, Quebec City, PEI, Vancouver, Banff, Newfoundland and Labrador)";
			final String OptionThree ="3.What you've booked(booking history for flights and hotels)";
			final String OptionFour ="4.Transaction Information";
			final String OptionFive = "5.Exit our site";
			final String invalid = "Input is inavlid. Please reenter a correct value.";
			String choices="";
			String answer="";
			//main menu user choice
			String choice="";
			
			//Scanner input
			Scanner input = new Scanner(System.in);
			
			//hotel
			//declare user main choices
					String place;
					String userHotel;
					String userHotelName;
					String userRoom;
					double days=0;
					double totalHotelPrice;
					String checkin[]=new String[1];//parallel array
					String checkout[]=new String [1];//parallel array
					String subchoice="";
					final String RETURN="1. Exit Program\n2. Return to Main Menu\n(Please pick a number)"; 
					
					//declare hotel names
					//Toronto
					String hotelEightyNine="Hotel 89\r\n89 Avenue Rd, Toronto, ON M5R 2G3\r\n(416) 964-1220\r\n";
					String sakar="Sakar Suites\r\n14 York St #12, Toronto, ON M5J 0A9\r\n(647) 643-9090\r\n";
					String 	clarence="The Clarence Hotel\r\n7 Clarence Square, Toronto, ON M5V 1H1\r\n(416) 591-7387\r\n";
					
					String hazelton="The Hazelton Hotel\r\n118 Yorkville Ave, Toronto, ON M5R 1C2\r\n(416) 963-6300\r\n";
					String germain="Le Germain Hotel \r\n75 Bremner Blvd, Toronto, ON M5J 0A1\r\n(416) 649-7575\r\n";
					String thomsphon="Thomsphon Hotel\r\n550 Wellington St W, Toronto, ON M5V 2V4\r\n(416) 640-7778\r\n";
					
					String ritz="The Ritz-Carleton \r\\n181 Wellington St W, Toronto, ON M5V 3G7\r\n(416) 585-2500\r\n";
					String regis="The St.Regis Hotel\r\n325 Bay St, Toronto, ON M5H 4G3\r\n(416) 306-5800\r\n"; 
					String seasons="The Four Seasons Hotel\r\n60 Yorkville Ave, Toronto, ON M4W 0A4\r\n(416) 964-0411\r\n";
					
					//Quebec
					String ambassadeur="Hôtel Ambassadeur Québec\r\n3401 Boulevard Sainte-Anne, Québec, QC G1E 3L4\r\n+1 800-363-4619\r\n";
					String bestQ="Best Western Plus City Centre/Centre-Ville\r\n330 De La Couronne, Quebec City, Quebec G1K 6E6 \r\n(418) 649-1919\r\n";
					
					String seventyOne="Hotel 71\r\n71 Rue Saint-Pierre, Quebec City, Quebec G1K 4A4\r\n(418) 692 1171\r\n";
					String port="L’Hotel Port-Royal\r\n144 Rue Saint-Pierre, Quebec City, Quebec G1K 8N8 Canada \r\n(418) 692 2777\r\n";
					
					String fairmont="Fairmont Le Chateau Frontenac\r\n1 Rue des Carrieres, Quebec City, Quebec G1R 5J5 \r\n1 (833) 896-2860\r\n";
					String auberge="Auberge Saint Antoine\r\n8 Rue Saint Antoine Auberge Saint-Antoine, Quebec City, Quebec G1K 4C9 Canada\r\n(418) 692 2211\r\n";
					
					//PEI
					String quality="Quality Inn & Suites\r\n15 York Point Road, Cornwall, Charlottetown, Prince Edward Island C0A 1H0 \r\n(902) 892-7900\r\n";
					String rodd="Rodd Royalty\r\n14 Capital Dr PO Box 2499, Charlottetown, Prince Edward Island C1E 1E7 \r\n+1 (902) 894 8566\r\n";
					
					String fairholm="Fairholm Boutique Inns\r\n230 Prince St, Charlottetown, Prince Edward Island C1A 4S1\r\n(902) 892-5022\r\n";
					String delta="Delta Hotels Prince Edward by Marriott\r\n18 Queen St, Charlottetown, Prince Edward Island C1A 4A1\r\n+1 (902) 566 2222\r\n";
					
					String george="The Great George\r\n58 Great George St, Charlottetown, Prince Edward Island C1A 4K3 \r\n(902) 892 0606\r\n";
					String sydney="The Sydney Boutique Inns\r\n55 Weymouth Street, Charlottetown, Prince Edward Island C1A 1H1 \r\n(902) 367 5888\r\n";
					
					//Vancouver
					String samesun="Samesun Vancouver\r\n+1 (844) 257-3048\r\n1018 Granville St, Vancouver, British Columbia V6Z 1L5\r\n";
					String victorian="Victorian Hotel\r\n514 Homer St, Vancouver, British Columbia V6B 2V6\r\n+1 (604) 681 6369\r\n";
					
					String regency="Hyatt Regency Vancouver\r\n655 Burrard Street, Vancouver, British Columbia V6C 2R7\r\n+1 (604) 683 1234\r\n";
					String wedgewood="Wedgewood Hotel & Spa Vancouver\r\n845 Hornby St, Vancouver, British Columbia V6Z 1V1\r\n(604) 689 7777\r\n";
					
					String waterfront="Fairmont Waterfront\r\n900 Canada Place Way, Vancouver, British Columbia V6C 3L5\r\n+ 1 (604) 691 1991\r\n";
					String pacific="Pan Pacific Vancouver\r\n300-999 Canada Place Way Suite 300, Vancouver, British Columbia V6C 3B5 \r\n+1 (604) 662 8111\r\n";
					
					//Banff
					String edward="King Edward Hotel\r\n137 Banff Avenue, T1L 1A6 Banff, Alberta\r\n(403) 985-3734\r\n";
					String elk="Elk + Avenue Hotel\r\n333 Banff Avenue, T1L 1B1 Banff, Alberta\r\n(403) 762-5666\r\n";
					
					String douglas="Douglas Fir Resort & Chalets\r\n525 Tunnel Mountain Road, T1L 1B2 Banff, Alberta\r\n+1 (800)-661-9267\r\n";
					String moose="Moose Hotel and Suites \r\n345 Banff Avenue, T1L 1H8 Banff, Alberta\r\n+1 (866)-379-0021\r\n";
					
					String banff="Fairmont Banff Springs\r\n405 Spray Avenue, T1L 1J4 Banff, Alberta\r\n(403) 762-2211\r\n";
					String rimrock="Rimrock Resort Hotel\r\n300 Mountain Avenue, P.O. Box 1110, T1L 1J2 Banff, Alberta\r\n(403) 762-1835\r\n";
					
					//Newfoundland and Labrador
					String sheraton="Sheraton Hotel Newfoundland\r\n115 Cavendish Square, A1C 3K2 St. John's, Newfoundland & Labrador\r\n(709) 726-4980\r\n";
					String westernPlus="Best Western Plus St. John Airport Hotel and Suites\r\n34 Jetstream Avenue , A1A 0R7 St. John's, Newfoundland & Labrador\r\n(506) 657-9966\r\n";
					
					String murray="Murray Premises Hotel\r\n5 Beck's Cove, Box 208, A1C 6H1 St. John's, Newfoundland & Labrador\r\n(709) 738-7773\r\n";
					String luxus="The Luxus Boutique Hotel\r\n128 Water Street, A1C 6H6 St. John's, Newfoundland & Labrador\r\n(709) 722-8899\r\n";
					
					//declare hotel tax
					final double tax=0.13;
					
					//declare user price calc Toronto
					//cheap rooms
					final double EIGHTY_NINE_SROOM=119;
					final double EIGHTY__NINE_MROOM=129;
					final double EIGHTY__NINE_LROOM=159;
					
					final double SAKAR_SROOM=89;
					final double SAKAR_MROOM=115;
					final double SAKAR_LROOM=150;
					
					final double CLARENCE_SROOM=32;
					final double CLARENCE_MROOM=55;
					final double CLARENCE_LROOM=67;
					
					//modern rooms
					final double HAZELTON_SROOM=219;
					final double HAZELTON_MROOM=314;
					final double HAZELTON_LROOM=494;
					
					final double GERMAIN_SROOM=296;
					final double GERMAIN_MROOM=314;
					final double GERMAIN_LROOM=368;
					
					final double THOMSPHON_SROOM=270;
					final double THOMSPHON_MROOM=350;
					final double THOMSPHON_LROOM=470;
					
					//expensive rooms
					final double RITZ_MROOM=610;
					final double RITZ_LROOM=645;
					
					final double REGIS_SROOM=649;
					final double REGIS_MROOM=849;
					final double REGIS_LROOM=1299;
					
					final double SEASONS_SROOM=755;
					final double SEASONS_MROOM=1475;
					final double SEASONS_LROOM=3885;
					
					//declare user price calc Quebec City
					//cheap rooms
					final double AMBASSADEUR_SROOM=109;
					final double AMBASSADEUR_MROOM=129;
					final double AMBASSADEUR_LROOM=179;

					final double BESTWEST_SROOM=79.19;
					final double BESTWEST_MROOM=82.99;
					final double BESTWEST_LROOM=100.99;
					
					//modern rooms
					final double SEVENTY_ONE_SROOM=309;
					final double SEVENTY_ONE_MROOM=329;
					final double SEVENTY_ONE_LROOM=436;

					final double PORT_ROYAL_SROOM=259;
					final double PORT_ROYAL_MROOM=299;
					final double PORT_ROYAL_LROOM=500;
				
					//expensive rooms
					final double FAIRMOUNT_SROOM=719;
					final double FAIRMOUNT_MROOM =859;
					final double FAIRMOUNT_LROOM=919.50;
					
					final double AUBERGE_SROOM=703.29;
					final double AUBERGE_MROOM=846;
					final double AUBERGE_LROOM=940;
					
					//declare user price calc PEI
					//cheap rooms
					final double RODD_SROOM=91;
					final double RODD_MROOM=111;
					final double RODD_LROOM=161;
					
					final double QUALITY_SROOM=89;
					final double QUALITY_MROOM=99;
					final double QUALITY_LROOM=139;
					
					//modern rooms
					final double FAIRHOLM_SROOM=220;
					final double FAIRHOLM_MROOM=270;
					final double FAIRHOLM_LROOM=310;
					
					final double DELTA_SROOM=204;
					final double DELTA_MROOM=234;
					final double DELTA_LROOM=269;
					
					//expensive rooms
					final double GEORGE_SROOM=730;
					final double GEORGE_MROOM=850;
					final double GEORGE_LROOM=910;
					
					final double SYDNEY_SROOM=710;
					final double SYDNEY_MROOM=770;
					final double SYDNEY_LROOM=820;
					
					//declare user price calc Vancouver
					//cheap rooms
					final double SAMESUN_SROOM=72;
					final double SAMESUN_MROOM=96;
					final double SAMESUN_LROOM=116;
					
					final double VICTORIAN_SROOM=99;
					final double VICTORIAN_MROOM=139;
					final double VICTORIAN_LROOM=159;
					
					//modern rooms
					final double REGENCY_SROOM=239;
					final double REGENCY_MROOM=398;
					final double REGENCY_LROOM=464;
					
					final double WEDGEWOOD_SROOM=246;
					final double WEDGEWOOD_MROOM=366;
					final double WEDGEWOOD_LROOM=446;
					
					//expensive rooms
					final double WATERFRONT_SROOM=743;
					final double WATERFRONT_MROOM =823;
					final double WATERFRONT_LROOM=863;
					
					final double PACIFIC_SROOM=782;
					final double PACIFIC_MROOM=869;
					final double PACIFIC_LROOM=989;
					
					//declare user price calc Banff
					//cheap rooms
					final double EDWARD_SROOM=111;
					final double EDWARD_MROOM=142;
					final double EDWARD_LROOM=162;
					
					final double ELK_SROOM=79;
					final double ELK_MROOM=95;
					final double ELK_LROOM=135;
					
					//modern rooms
					final double DOUGLAS_SROOM=275;
					final double DOUGLAS_MROOM=315;
					final double DOUGLAS_LROOM=389;
					
					final double MOOSE_SROOM=229;
					final double MOOSE_MROOM=299;
					final double MOOSE_LROOM=379;
					
					//expensive rooms
					final double BANFF_SROOM=750;
					final double BANFF_MROOM=890;
					final double BANFF_LROOM=1799;
					
					final double RIMROCK_SROOM=765;
					final double RIMROCK_MROOM=820;
					final double RIMROCK_LROOM=865;
					
					//declare user price calc Newfoundland and Labrador
					//cheap rooms
					final double SHERATON_SROOM=101;
					final double SHERATON_MROOM=114;
					final double SHERATON_LROOM=169;
					
					final double WESTERNPLUS_SROOM=107;
					final double WESTERNPLUS_MROOM=119;
					final double WESTERNPLUS_LROOM=139;
					
					//modern rooms
					final double MURRAY_SROOM=268;
					final double MURRAY_MROOM=284;
					final double MURRAY_LROOM=332;
					
					final double LUXUS_SROOM=439;
					final double LUXUS_MROOM=540;
					final double LUXUS_LROOM=630;
					
			
			
			
			//start main menu
			do
			{
			do
			{
				System.out.println("|YLD Traveling Agency|\n"+"Welcome to our traveling site!\nWhat would you like to do?\n");
		System.out.println(Option);
		System.out.println(OptionTwo);
		System.out.println(OptionThree);
		System.out.println(OptionFour);
		System.out.println(OptionFive);
		System.out.println("\nPlease pick a number? (1, 2, 3, 4 or 5):");
		choice = input.next();
		System.out.println("");
		}while (!choice.equals("1") && !choice.equals("2") && !choice.equals("3") && !choice.equals("4")&& !choice.equals("5"));
			
			if(choice.equals("1"))
			{
					
			}
			else if(choice.equals("2"))
			{
				do
				{
				System.out.println("Hello, Please choose one of the following options (1 or 2) ");
				System.out.println("1. Book a hotel");
				System.out.println("2. Exit Program or exit completly");
				//choice by the user
				subchoice = input.next();
				while(!subchoice.equals("1") && !subchoice.equals("2"))
					{
					System.out.println(invalid);
					System.out.println("Please choose one of the following options (1 or 2) ");
					System.out.println("1. Book a hotel");
					System.out.println("2. Exit Program or exit completly");
					subchoice = input.next();
					}
				if (subchoice.equals("1"))
				{
				do 
				{	
				System.out.println("What area will you be traveling?(Please pick a number)\n 1.Toronto, 2.Quebec City, 3.PEI, 4.Vancouver, 5.Banff, 6.Newfoundland and Labrador");
				place= input.next();//user input
				}
				while (!place.equals("1") && !place.equals("2") && !place.equals("3") && !place.equals("4") && !place.equals("5") && !place.equalsIgnoreCase("6"));
				//decisions for places		
			if(place.equalsIgnoreCase("1"))//if user picked Toronto
				{
					//type of hotel
					do 
					{	
					System.out.println("What type of hotel do you want to stay in?(please pick an option)\n(cheap($32-159), modern($219-494) or expensive($610=3885)?)");
					userHotel=input.next();	
					}
					while (!userHotel.equals("cheap") && !userHotel.equals("modern") && !userHotel.equals("expensive"));
					if(userHotel.equalsIgnoreCase("cheap"))//if user picked cheap choice
					{
						do 
						{
						System.out.println("Which hotel would you want to stay at?(please pick a number)\n");//Which cheap hotel in the area
						System.out.println("1."+hotelEightyNine);
						System.out.println("2."+sakar);
						System.out.println("3."+clarence);
						userHotelName=input.next();	
						}
						while (!userHotelName.equals("1") && !userHotelName.equals("2") && !userHotelName.equals("3"));
						if (userHotelName.equalsIgnoreCase("1"))//Hotel 89
						{
							do 
							{	
							System.out.println("What size room do you want?\\n(small,modern,suite");
							userRoom= input.next();//user input
							}
							while (!userRoom.equals("small") && !userRoom.equals("modern") && !userRoom.equals("suite"));
							if(userRoom.equalsIgnoreCase("small"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextDouble();
								totalHotelPrice=EIGHTY_NINE_SROOM*days+EIGHTY_NINE_SROOM*tax;	
								
							}
							else if(userRoom.equalsIgnoreCase("modern"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextInt();
								totalHotelPrice=EIGHTY__NINE_MROOM*days+EIGHTY__NINE_MROOM*tax;
							}
							else if(userRoom.equalsIgnoreCase("suite"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextInt();
								totalHotelPrice=EIGHTY__NINE_LROOM*days+EIGHTY__NINE_LROOM*tax;
							}
							userHotelName=hotelEightyNine;//to save in transaction info
						}
						else if(userHotelName.equalsIgnoreCase("2"))//Sakar Suites
						{
							do 
							{	
							System.out.println("What size room do you want?\\n(small,modern,suite");
							userRoom= input.next();//user input
							}
							while (!userRoom.equals("small") && !userRoom.equals("modern") && !userRoom.equals("suite"));
							if(userRoom.equalsIgnoreCase("small"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextDouble();
								totalHotelPrice=SAKAR_SROOM*days+SAKAR_SROOM*tax;	
							}
							else if(userRoom.equalsIgnoreCase("modern"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextInt();
								totalHotelPrice=SAKAR_MROOM*days+SAKAR_MROOM*tax;
							}
							else if(userRoom.equalsIgnoreCase("suite"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextInt();
								totalHotelPrice=SAKAR_LROOM*days+SAKAR_LROOM*tax;
							}
							userHotelName=sakar;//to save in transaction info
						}
						else if(userHotelName.equalsIgnoreCase("3"))//The Clarence Hotel
						{
							do 
							{	
							System.out.println("What size room do you want?\\n(small,modern,suite");
							userRoom= input.next();//user input
							}
							while (!userRoom.equals("small") && !userRoom.equals("modern") && !userRoom.equals("suite"));
							if(userRoom.equalsIgnoreCase("small"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextDouble();
								totalHotelPrice=CLARENCE_SROOM*days+CLARENCE_SROOM*tax;	
							}
							else if(userRoom.equalsIgnoreCase("modern"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextInt();
								totalHotelPrice=CLARENCE_MROOM*days+CLARENCE_MROOM*tax;	
							}
							else if(userRoom.equalsIgnoreCase("suite"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextInt();
								totalHotelPrice=CLARENCE_LROOM*days+CLARENCE_LROOM*tax;	
							}
							userHotelName=clarence;//to save in transaction info
						}
					
					}
					else if(userHotel.equalsIgnoreCase("modern"))//if user picked modern choice
					{	
						do 
						{	
						System.out.println("Which hotel would you want to stay at?(please pick a number)\n");//Which modern hotel in the area
						System.out.println("1."+hazelton);
						System.out.println("2."+germain);
						System.out.println("3."+thomsphon);
						userHotelName=input.next();	
						}
						while (!userHotelName.equals("1") && !userHotelName.equals("2") && !userHotelName.equals("3"));
						if (userHotelName.equalsIgnoreCase("1"))//Hazelton Hotel
						{
							do 
							{	
							System.out.println("What size room do you want?\\n(small,modern,suite");
							userRoom= input.next();//user input
							}
							while (!userRoom.equals("small") && !userRoom.equals("modern") && !userRoom.equals("suite"));
							if(userRoom.equalsIgnoreCase("small"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextDouble();
								totalHotelPrice=HAZELTON_SROOM*days+HAZELTON_SROOM*tax;	
							}
							else if(userRoom.equalsIgnoreCase("modern"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextInt();
								totalHotelPrice=HAZELTON_MROOM*days+HAZELTON_MROOM*tax;	
							}
							else if(userRoom.equalsIgnoreCase("suite"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextInt();
								totalHotelPrice=HAZELTON_LROOM*days+HAZELTON_LROOM*tax;	
							}
							userHotelName=hazelton;//to save in transaction info
						}
						else if(userHotelName.equalsIgnoreCase("2"))//Le Germain Hotel
						{
							do 
							{	
							System.out.println("What size room do you want?\n(small,modern,suite");
							userRoom= input.next();//user input
							}
							while (!userRoom.equals("small") && !userRoom.equals("modern") && !userRoom.equals("suite"));
							if(userRoom.equalsIgnoreCase("small"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextDouble();
								totalHotelPrice=GERMAIN_SROOM*days+GERMAIN_SROOM*tax;	
							}
							else if(userRoom.equalsIgnoreCase("modern"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextInt();
								totalHotelPrice=GERMAIN_MROOM*days+GERMAIN_MROOM*tax;	
							}
							else if(userRoom.equalsIgnoreCase("suite"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextInt();
								totalHotelPrice=GERMAIN_LROOM*days+GERMAIN_LROOM*tax;	
							}
							userHotelName=germain;//to save in transaction info
						}
						else if(userHotelName.equalsIgnoreCase("3"))//Thomsphon Hotel
						{
							do 
							{	
							System.out.println("What size room do you want?\\n(small,modern,suite");
							userRoom= input.next();//user input
							}
							while (!userRoom.equals("small") && !userRoom.equals("modern") && !userRoom.equals("suite"));
							if(userRoom.equalsIgnoreCase("small"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextDouble();
								totalHotelPrice=THOMSPHON_SROOM*days+THOMSPHON_SROOM*tax;	
							}
							else if(userRoom.equalsIgnoreCase("modern"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextInt();
								totalHotelPrice=THOMSPHON_MROOM*days+THOMSPHON_SROOM*tax;	
							}
							else if(userRoom.equalsIgnoreCase("suite"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextInt();
								totalHotelPrice=THOMSPHON_LROOM*days+THOMSPHON_LROOM*tax;	
							}
							userHotelName=thomsphon;//to save in transaction info
						}
					}
					else if(userHotel.equalsIgnoreCase("expensive"))//if user picked expensive choice
					{
						System.out.println("Which hotel would you want to stay at?(pick a number)\n");//Which expensive hotel in the area
						System.out.println("1."+ritz);
						System.out.println("2."+regis);
						System.out.println("3."+seasons);	
						userHotelName=input.next();
						do 
						{	
						System.out.println("What type of hotel do you want to stay in?\n(1,2 or 3)");
						userHotelName=input.next();	
						}
						while (!userHotelName.equals("1") && !userHotelName.equals("2") && !userHotelName.equals("3"));
						if (userHotelName.equalsIgnoreCase("1"))//the Ritz-Carlton Hotel
						{
							do 
							{	
							System.out.println("What size room do you want?\\n(modern or suite");
							userRoom= input.next();//user input
							}
							while (!userRoom.equals("modern") && !userRoom.equals("suite"));
							 if(userRoom.equalsIgnoreCase("modern"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextInt();
								totalHotelPrice=RITZ_MROOM*days+RITZ_MROOM*tax;	
							}
							else if(userRoom.equalsIgnoreCase("suite"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextInt();
								totalHotelPrice=RITZ_LROOM*days+RITZ_LROOM*tax;	
							}
							userHotelName=ritz;//to save in transaction info
						}
						else if(userHotelName.equalsIgnoreCase("2"))//St.Regis Hotel
						{
							do 
							{	
							System.out.println("What size room do you want?\\n(small,modern,suite");
							userRoom= input.next();//user input
							}
							while (!userRoom.equals("small") && !userRoom.equals("modern") && !userRoom.equals("suite"));
							if(userRoom.equalsIgnoreCase("small"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextDouble();
								totalHotelPrice=REGIS_SROOM*days+REGIS_SROOM*tax;	
							}
							else if(userRoom.equalsIgnoreCase("modern"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextInt();
								totalHotelPrice=REGIS_MROOM*days+REGIS_MROOM*tax;	
							}
							else if(userRoom.equalsIgnoreCase("suite"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextInt();
								totalHotelPrice=REGIS_LROOM*days+REGIS_LROOM*tax;	
							}
							userHotelName=regis;//to save in transaction info
						}
						else if(userHotelName.equalsIgnoreCase("3"))//The Four Seasons Hotel
						{
							do 
							{	
							System.out.println("What size room do you want?\\n(small,modern,suite");
							userRoom= input.next();//user input
							}
							while (!userRoom.equals("small") && !userRoom.equals("modern") && !userRoom.equals("suite"));
							if(userRoom.equalsIgnoreCase("small"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextDouble();
								totalHotelPrice=SEASONS_SROOM*days+SEASONS_SROOM*tax;	
							}
							else if(userRoom.equalsIgnoreCase("modern"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextInt();
								totalHotelPrice=SEASONS_MROOM*days+SEASONS_MROOM*tax;	
							}
							else if(userRoom.equalsIgnoreCase("suite"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextInt();
								totalHotelPrice=SEASONS_LROOM*days+SEASONS_LROOM*tax;	
							}
							userHotelName=seasons;//to save in transaction info
						}
					}
					
					System.out.println("What time do you want to check in?");//info for check in
					checkin[1]=input.next();//user input
					System.out.println("What time do you want to check out?");//info for check out
					checkout[1]=input.next();
					}
				
				
				else if(place.equalsIgnoreCase("2"))//if user picked Quebec city
				{
					//type of hotel
					do 
					{	
					System.out.println("What type of hotel do you want to stay in?(please pick an option)\n(cheap($79.19-179), modern($299-500) or expensive($703.29-940.68)?)");
					userHotel=input.next();	
					}
					while (!userHotel.equals("cheap") && !userHotel.equals("modern") && !userHotel.equals("expensive"));
					if(userHotel.equalsIgnoreCase("cheap"))//if user picked cheap choice
					{
						do 
						{
						System.out.println("Which hotel would you want to stay at?(pick a number)\n");//Which cheap hotel in the area
						System.out.println("1."+ambassadeur);
						System.out.println("2."+bestQ);	
						userHotelName=input.next();	
						}
						while (!userHotelName.equals("1") && !userHotelName.equals("2"));
						if (userHotelName.equalsIgnoreCase("1"))//Ambassadeur
						{
							do 
							{	
							System.out.println("What size room do you want?\\n(small,modern,suite");
							userRoom= input.next();//user input
							}
							while (!userRoom.equals("small") && !userRoom.equals("modern") && !userRoom.equals("suite"));
							if(userRoom.equalsIgnoreCase("small"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextDouble();
								totalHotelPrice=AMBASSADEUR_SROOM*days+AMBASSADEUR_SROOM*tax;	
							}
							else if(userRoom.equalsIgnoreCase("modern"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextInt();
								totalHotelPrice=AMBASSADEUR_MROOM*days+AMBASSADEUR_MROOM*tax;	
							}
							else if(userRoom.equalsIgnoreCase("suite"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextInt();
								totalHotelPrice=AMBASSADEUR_LROOM*days+AMBASSADEUR_LROOM*tax;	
							}
							userHotelName=ambassadeur;//to save in transaction info
						}
					
						else if (userHotelName.equalsIgnoreCase("2"))//Best Western
						{
							do 
							{	
							System.out.println("What size room do you want?\\n(small,modern,suite");
							userRoom= input.next();//user input
							}
							while (!userRoom.equals("small") && !userRoom.equals("modern") && !userRoom.equals("suite"));
							if(userRoom.equalsIgnoreCase("small"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextDouble();
								totalHotelPrice=BESTWEST_SROOM*days+BESTWEST_SROOM*tax;	
							}
							else if(userRoom.equalsIgnoreCase("modern"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextInt();
								totalHotelPrice=BESTWEST_MROOM*days+BESTWEST_MROOM*tax;	
							}
							else if(userRoom.equalsIgnoreCase("suite"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextInt();
								totalHotelPrice=BESTWEST_LROOM*days+BESTWEST_LROOM*tax;	
							}
							userHotelName=bestQ;//to save in transaction info
						}
					}
					else if(userHotel.equalsIgnoreCase("modern"))//if user picked modern choice
					{ 
						do 
						{
						System.out.println("Which hotel would you want to stay at?\n");//Which modern hotel in the area
						System.out.println("1."+seventyOne);
						System.out.println("2."+port);
						userHotelName=input.next();	
						}
						while (!userHotelName.equals("1") && !userHotelName.equals("2"));
						if (userHotelName.equalsIgnoreCase("1"))//Seventy one hotel
						{
							do
							{	
							System.out.println("What size room do you want?\\n(small,modern,suite");
							userRoom= input.next();//user input
							}
							while (!userRoom.equals("small") && !userRoom.equals("modern") && !userRoom.equals("suite"));
							if(userRoom.equalsIgnoreCase("small"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextDouble();
								totalHotelPrice=SEVENTY_ONE_SROOM*days+SEVENTY_ONE_SROOM*tax;	
							}
							else if(userRoom.equalsIgnoreCase("modern"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextInt();
								totalHotelPrice=SEVENTY_ONE_MROOM*days+SEVENTY_ONE_MROOM*tax;	
							}
							else if(userRoom.equalsIgnoreCase("suite"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextInt();
								totalHotelPrice=SEVENTY_ONE_LROOM*days+SEVENTY_ONE_LROOM*tax;	
							}
							userHotelName=seventyOne;//to save in transaction info
						}
						else if (userHotelName.equalsIgnoreCase("1"))//The Port Royal Hotel
						{
							do 
							{	
							System.out.println("What size room do you want?\\n(small,modern,suite");
							userRoom= input.next();//user input
							}
							while (!userRoom.equals("small") && !userRoom.equals("modern") && !userRoom.equals("suite"));
							if(userRoom.equalsIgnoreCase("small"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextDouble();
								totalHotelPrice=PORT_ROYAL_SROOM*days+PORT_ROYAL_SROOM*tax;	
							}
							else if(userRoom.equalsIgnoreCase("modern"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextInt();
								totalHotelPrice=PORT_ROYAL_MROOM*days+PORT_ROYAL_MROOM*tax;	
							}
							else if(userRoom.equalsIgnoreCase("suite"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextInt();
								totalHotelPrice=PORT_ROYAL_LROOM*days+PORT_ROYAL_LROOM*tax;	
							}
							
							userHotelName=port;//to save in transaction info
					}
					}
					else if(userHotel.equalsIgnoreCase("expensive"))//if user picked expensive choice
					{
						do 
						{	
						System.out.println("Which hotel would you want to stay at?\n");//Which expensive hotel in the area
						System.out.println("1."+fairmont);
						System.out.println("2."+auberge);
						userHotelName=input.next();	
						}
						while (!userHotelName.equals("1") && !userHotelName.equals("2"));
						if (userHotelName.equalsIgnoreCase("1"))//Fairmount Hotel
						{
							do 
							{	
							System.out.println("What size room do you want?\\n(small,modern,suite");
							userRoom= input.next();//user input
							}
							while (!userRoom.equals("small") && !userRoom.equals("modern") && !userRoom.equals("suite"));
							if(userRoom.equalsIgnoreCase("small"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextDouble();
								totalHotelPrice=FAIRMOUNT_SROOM*days+FAIRMOUNT_SROOM*tax;	
							}
							else if(userRoom.equalsIgnoreCase("modern"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextInt();
								totalHotelPrice=FAIRMOUNT_MROOM*days+FAIRMOUNT_MROOM*tax;	
							}
							else if(userRoom.equalsIgnoreCase("suite"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextInt();
								totalHotelPrice=FAIRMOUNT_LROOM*days+FAIRMOUNT_LROOM*tax;	
							}
							else
							{
								System.out.println("Invalid option please try again");
							}
							userHotelName=fairmont;//to save in transaction info
						}
						else if (userHotelName.equalsIgnoreCase("2"))//Auberge Hotel
						{
							do 
							{	
							System.out.println("What size room do you want?\\n(small,modern,suite");
							userRoom= input.next();//user input
							}
							while (!userRoom.equals("small") && !userRoom.equals("modern") && !userRoom.equals("suite"));
							if(userRoom.equalsIgnoreCase("small"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextDouble();
								totalHotelPrice=AUBERGE_SROOM*days+AUBERGE_SROOM*tax;	
							}
							else if(userRoom.equalsIgnoreCase("modern"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextInt();
								totalHotelPrice=AUBERGE_MROOM*days+AUBERGE_MROOM*tax;	
							}
							else if(userRoom.equalsIgnoreCase("suite"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextInt();
								totalHotelPrice=AUBERGE_LROOM*days+AUBERGE_LROOM*tax;	
							}
							userHotelName=auberge;//to save in transaction info
						}
						
					}
					System.out.println("What time do you want to check in?");//info for check in
					checkin[1]=input.next();//user input
					System.out.println("What time do you want to check out?");//info for check out
					checkout[1]=input.next();
				}
				else if(place.equalsIgnoreCase("3"))//if user picked PEI
				{
					//type of hotel
					do 
					{	
					System.out.println("What type of hotel do you want to stay in?(please pick an option)\n(cheap($89-161), modern($204-310) or expensive($710-800?)");
					userHotel=input.next();	
					}
					while (!userHotel.equals("cheap") && !userHotel.equals("modern") && !userHotel.equals("expensive"));
					if(userHotel.equalsIgnoreCase("cheap"))//if user picked cheap choice
					{
						do 
						{	
						System.out.println("Which hotel would you want to stay at?\n");//Which cheap hotel in the area
						System.out.println("1."+quality);
						System.out.println("2."+rodd);
						userHotelName=input.next();	
						}
						while (!userHotelName.equals("1") && !userHotelName.equals("2"));
						if (userHotelName.equalsIgnoreCase("1"))//Quality Inn & Hotel
						{
							do 
							{	
							System.out.println("What size room do you want?\\n(small,modern,suite");
							userRoom= input.next();//user input
							}
							while (!userRoom.equals("small") && !userRoom.equals("modern") && !userRoom.equals("suite"));
							if(userRoom.equalsIgnoreCase("small"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextDouble();
								totalHotelPrice=QUALITY_SROOM*days+QUALITY_SROOM*tax;	
							}
							else if(userRoom.equalsIgnoreCase("modern"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextInt();
								totalHotelPrice=QUALITY_MROOM*days+QUALITY_MROOM*tax;	
							}
							else if(userRoom.equalsIgnoreCase("suite"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextInt();
								totalHotelPrice=QUALITY_LROOM*days+QUALITY_LROOM*tax;	
							}
							userHotelName=quality;//to save in transaction info
						}
						else if (userHotelName.equalsIgnoreCase("2"))//Rodd Hotel
						{
							do 
							{	
							System.out.println("What size room do you want?\\n(small,modern,suite");
							userRoom= input.next();//user input
							}
							while (!userRoom.equals("small") && !userRoom.equals("modern") && !userRoom.equals("suite"));
							if(userRoom.equalsIgnoreCase("small"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextDouble();
								totalHotelPrice=RODD_SROOM*days+RODD_SROOM*tax;	
							}
							else if(userRoom.equalsIgnoreCase("modern"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextInt();
								totalHotelPrice=RODD_MROOM*days+RODD_MROOM*tax;	
							}
							else if(userRoom.equalsIgnoreCase("suite"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextInt();
								totalHotelPrice=RODD_LROOM*days+RODD_LROOM*tax;	
							}
							userHotelName=rodd;//to save in transaction info
						}
						
					}
					
					else if(userHotel.equalsIgnoreCase("modern"))//if user picked modern choice
					{
						do 
						{	
						System.out.println("Which hotel would you want to stay at?\n");//Which modern hotel in the area
						System.out.println("1."+fairholm);
						System.out.println("2."+delta);
						userHotelName=input.next();	
						}
						while (!userHotelName.equals("1") && !userHotelName.equals("2"));
						if (userHotelName.equalsIgnoreCase("1"))//Fairholm Hotel
						{
							do 
							{	
							System.out.println("What size room do you want?\\n(small,modern,suite");
							userRoom= input.next();//user input
							}
							while (!userRoom.equals("small") && !userRoom.equals("modern") && !userRoom.equals("suite"));
							if(userRoom.equalsIgnoreCase("small"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextDouble();
								totalHotelPrice=FAIRHOLM_SROOM*days+FAIRHOLM_SROOM*tax;	
							}
							else if(userRoom.equalsIgnoreCase("modern"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextInt();
								totalHotelPrice=FAIRHOLM_MROOM*days+FAIRHOLM_MROOM*tax;	
							}
							else if(userRoom.equalsIgnoreCase("suite"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextInt();
								totalHotelPrice=FAIRHOLM_LROOM*days+FAIRHOLM_LROOM*tax;	
							}
							userHotelName=fairholm;//to save in transaction info
						}
						if (userHotelName.equalsIgnoreCase("2"))//Delta Hotel
						{
							do 
							{	
							System.out.println("What size room do you want?\\n(small,modern,suite");
							userRoom= input.next();//user input
							}
							while (!userRoom.equals("small") && !userRoom.equals("modern") && !userRoom.equals("suite"));
							if(userRoom.equalsIgnoreCase("small"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextDouble();
								totalHotelPrice=DELTA_SROOM*days+DELTA_SROOM*tax;	
							}
							else if(userRoom.equalsIgnoreCase("modern"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextInt();
								totalHotelPrice=DELTA_MROOM*days+DELTA_MROOM*tax;	
							}
							else if(userRoom.equalsIgnoreCase("suite"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextInt();
								totalHotelPrice=DELTA_LROOM*days+DELTA_LROOM*tax;	
							}
							userHotelName=delta;//to save in transaction info
						}
						
					}
					else if(userHotel.equalsIgnoreCase("expensive"))//if user picked expensive choice
					{
						do 
						{	
						System.out.println("Which hotel would you want to stay at?\n");//Which expensive hotel in the area
						System.out.println("1."+george);
						System.out.println("2."+sydney);
						userHotelName=input.next();	
						}
						while (!userHotelName.equals("1") && !userHotelName.equals("2"));
						if (userHotelName.equalsIgnoreCase("1"))//George Hotel
						{
							do 
							{	
							System.out.println("What size room do you want?\\n(small,modern,suite");
							userRoom= input.next();//user input
							}
							while (!userRoom.equals("small") && !userRoom.equals("modern") && !userRoom.equals("suite"));
							if(userRoom.equalsIgnoreCase("small"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextDouble();
								totalHotelPrice=GEORGE_SROOM*days+GEORGE_SROOM*tax;	
							}
							else if(userRoom.equalsIgnoreCase("modern"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextInt();
								totalHotelPrice=GEORGE_MROOM*days+GEORGE_MROOM*tax;	
							}
							else if(userRoom.equalsIgnoreCase("suite"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextInt();
								totalHotelPrice=GEORGE_LROOM*days+GEORGE_LROOM*tax;	
							}
							userHotelName=george;//to save in transaction info
						}
						else if (userHotelName.equalsIgnoreCase("2"))//Sydney Hotel
						{
							do 
							{	
							System.out.println("What size room do you want?\\n(small,modern,suite");
							userRoom= input.next();//user input
							}
							while (!userRoom.equals("small") && !userRoom.equals("modern") && !userRoom.equals("suite"));
							if(userRoom.equalsIgnoreCase("small"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextDouble();
								totalHotelPrice=SYDNEY_SROOM*days+SYDNEY_SROOM*tax;	
							}
							else if(userRoom.equalsIgnoreCase("modern"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextInt();
								totalHotelPrice=SYDNEY_MROOM*days+SYDNEY_MROOM*tax;	
							}
							else if(userRoom.equalsIgnoreCase("suite"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextInt();
								totalHotelPrice=SYDNEY_LROOM*days+SYDNEY_LROOM*tax;	
							}
							userHotelName=sydney;//to save in transaction info
					}
					System.out.println("What time do you want to check in?");//info for check in
					checkin[1]=input.next();//user input
					System.out.println("What time do you want to check out?");//info for check out
					checkout[1]=input.next();
				 }
				}
				else if(place.equalsIgnoreCase("4"))//if user picked Vancouver
				{
					//type of hotel
					do 
					{	
					System.out.println("What type of hotel do you want to stay in?(please pick an option)\n(cheap($72-159), modern($239-464) or expensive($743-989??)");
					userHotel=input.next();	
					}
					while (!userHotel.equals("cheap") && !userHotel.equals("modern") && !userHotel.equals("expensive"));
					if(userHotel.equalsIgnoreCase("cheap"))//if user picked cheap choice
					{
						do 
						{	
						System.out.println("Which hotel would you want to stay at?\n");//Which cheap hotel in the area
						System.out.println("1."+samesun);
						System.out.println("2."+victorian);
						userHotelName=input.next();	
						}
						while (!userHotelName.equals("1") && !userHotelName.equals("2"));
						userHotelName=input.next();
						if (userHotelName.equalsIgnoreCase("1"))//Samesun Hotel
						{
							do 
							{	
							System.out.println("What size room do you want?\\n(small,modern,suite");
							userRoom= input.next();//user input
							}
							while (!userRoom.equals("small") && !userRoom.equals("modern") && !userRoom.equals("suite"));
							if(userRoom.equalsIgnoreCase("small"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextDouble();
								totalHotelPrice=SAMESUN_SROOM*days+SAMESUN_SROOM*tax;	
							}
							else if(userRoom.equalsIgnoreCase("modern"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextInt();
								totalHotelPrice=SAMESUN_MROOM*days+SAMESUN_MROOM*tax;	
							}
							else if(userRoom.equalsIgnoreCase("suite"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextInt();
								totalHotelPrice=SAMESUN_LROOM*days+SAMESUN_LROOM*tax;	
							}
							userHotelName=samesun;//to save in transaction info
						}
						else if (userHotelName.equalsIgnoreCase("2"))//Victorian Hotel
						{
							do 
							{	
							System.out.println("What size room do you want?\\n(small,modern,suite");
							userRoom= input.next();//user input
							}
							while (!userRoom.equals("small") && !userRoom.equals("modern") && !userRoom.equals("suite"));
							if(userRoom.equalsIgnoreCase("small"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextDouble();
								totalHotelPrice=VICTORIAN_SROOM*days+VICTORIAN_SROOM*tax;	
							}
							else if(userRoom.equalsIgnoreCase("modern"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextInt();
								totalHotelPrice=VICTORIAN_MROOM*days+VICTORIAN_MROOM*tax;	
							}
							else if(userRoom.equalsIgnoreCase("suite"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextInt();
								totalHotelPrice=VICTORIAN_LROOM*days+VICTORIAN_LROOM*tax;	
							}
							userHotelName=victorian;//to save in transaction info
						}
						
					}
					else if(userHotel.equalsIgnoreCase("modern"))//if user picked modern choice
					{
						do 
						{	
						System.out.println("Which hotel would you want to stay at?\n");//Which modern hotel in the area
						System.out.println("1."+regency);
						System.out.println("2."+wedgewood);
						userHotelName=input.next();	
						}
						while (!userHotelName.equals("1") && !userHotelName.equals("2"));
						if (userHotelName.equalsIgnoreCase("1"))//Regency Hotel
						{
							do 
							{	
							System.out.println("What size room do you want?\\n(small,modern,suite");
							userRoom= input.next();//user input
							}
							while (!userRoom.equals("small") && !userRoom.equals("modern") && !userRoom.equals("suite"));
							if(userRoom.equalsIgnoreCase("small"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextDouble();
								totalHotelPrice=REGENCY_SROOM*days+REGENCY_SROOM*tax;	
							}
							else if(userRoom.equalsIgnoreCase("modern"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextInt();
								totalHotelPrice=REGENCY_MROOM*days+REGENCY_MROOM*tax;	
							}
							else if(userRoom.equalsIgnoreCase("suite"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextInt();
								totalHotelPrice=REGENCY_LROOM*days+REGENCY_LROOM*tax;	
							}
							userHotelName=regency;//to save in transaction info
						}
						else if (userHotelName.equalsIgnoreCase("2"))//Wedgewood Hotel
						{
							do 
							{	
							System.out.println("What size room do you want?\\n(small,modern,suite");
							userRoom= input.next();//user input
							}
							while (!userRoom.equals("small") && !userRoom.equals("modern") && !userRoom.equals("suite"));
							if(userRoom.equalsIgnoreCase("small"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextDouble();
								totalHotelPrice=WEDGEWOOD_SROOM*days+WEDGEWOOD_SROOM*tax;	
							}
							else if(userRoom.equalsIgnoreCase("modern"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextInt();
								totalHotelPrice=WEDGEWOOD_MROOM*days+WEDGEWOOD_MROOM*tax;	
							}
							else if(userRoom.equalsIgnoreCase("suite"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextInt();
								totalHotelPrice=WEDGEWOOD_LROOM*days+WEDGEWOOD_LROOM*tax;	
							}
							userHotelName=wedgewood;//to save in transaction info
						}
						
					}
					else if(userHotel.equalsIgnoreCase("expensive"))//if user picked expensive choice
					{
						do 
						{	
						System.out.println("Which hotel would you want to stay at?\n");//Which expensive hotel in the area
						System.out.println("1."+waterfront);
						System.out.println("2."+pacific);
						userHotelName=input.next();	
						}
						while (!userHotelName.equals("1") && !userHotelName.equals("2"));
						if (userHotelName.equalsIgnoreCase("1"))//Fairmount Waterfront Hotel
						{
							do 
							{	
							System.out.println("What size room do you want?\\n(small,modern,suite");
							userRoom= input.next();//user input
							}
							while (!userRoom.equals("small") && !userRoom.equals("modern") && !userRoom.equals("suite"));
							if(userRoom.equalsIgnoreCase("small"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextDouble();
								totalHotelPrice=WATERFRONT_SROOM*days+WATERFRONT_SROOM*tax;	
							}
							else if(userRoom.equalsIgnoreCase("modern"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextInt();
								totalHotelPrice=WATERFRONT_MROOM*days+WATERFRONT_MROOM*tax;	
							}
							else if(userRoom.equalsIgnoreCase("suite"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextInt();
								totalHotelPrice=WATERFRONT_LROOM*days+WATERFRONT_LROOM*tax;	
							}
							userHotelName=waterfront;//to save in transaction info
						}
						else if (userHotelName.equalsIgnoreCase("2"))//Pacific Hotel
						{
							do 
							{	
							System.out.println("What size room do you want?\\n(small,modern,suite");
							userRoom= input.next();//user input
							}
							while (!userRoom.equals("small") && !userRoom.equals("modern") && !userRoom.equals("suite"));
							if(userRoom.equalsIgnoreCase("small"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextDouble();
								totalHotelPrice=PACIFIC_SROOM*days+PACIFIC_SROOM*tax;	
							}
							else if(userRoom.equalsIgnoreCase("modern"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextInt();
								totalHotelPrice=PACIFIC_MROOM*days+PACIFIC_MROOM*tax;	
							}
							else if(userRoom.equalsIgnoreCase("suite"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextInt();
								totalHotelPrice=PACIFIC_LROOM*days+PACIFIC_LROOM*tax;	
							}
							userHotelName=pacific;//to save in transaction info
						}
						
					}
					System.out.println("What time do you want to check in?");//info for check in
					checkin[1]=input.next();//user input
					System.out.println("What time do you want to check out?");//info for check out
					checkout[1]=input.next();
				}
				else if(place.equalsIgnoreCase("5"))//if user picked Banff
				{
					//type of hotel
					do 
					{	
					System.out.println("What type of hotel do you want to stay in?(please pick an option)\n(cheap, modern or expensive?)");
					userHotel=input.next();	
					}
					while (!userHotel.equals("cheap") && !userHotel.equals("modern") && !userHotel.equals("expensive"));
					if(userHotel.equalsIgnoreCase("cheap"))//if user picked cheap choice
					{
						do 
						{	
						System.out.println("Which hotel would you want to stay at?\n");//Which cheap hotel in the area
						System.out.println("1."+edward);
						System.out.println("2."+elk);
						userHotelName=input.next();	
						}
						while (!userHotelName.equals("1") && !userHotelName.equals("2"));
						if (userHotelName.equalsIgnoreCase("1"))//Edward Hotel
						{
							do 
							{	
							System.out.println("What size room do you want?\\n(small,modern,suite");
							userRoom= input.next();//user input
							}
							while (!userRoom.equals("small") && !userRoom.equals("modern") && !userRoom.equals("suite"));
							if(userRoom.equalsIgnoreCase("small"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextDouble();
								totalHotelPrice=EDWARD_SROOM*days+EDWARD_SROOM*tax;	
							}
							else if(userRoom.equalsIgnoreCase("modern"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextInt();
								totalHotelPrice=EDWARD_MROOM*days+EDWARD_MROOM*tax;	
							}
							else if(userRoom.equalsIgnoreCase("suite"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextInt();
								totalHotelPrice=EDWARD_LROOM*days+EDWARD_LROOM*tax;	
							}
							userHotelName=edward;//to save in transaction info
						}
						else if (userHotelName.equalsIgnoreCase("2"))//Elk Hotel
						{
							do 
							{	
							System.out.println("What size room do you want?\\n(small,modern,suite");
							userRoom= input.next();//user input
							}
							while (!userRoom.equals("small") && !userRoom.equals("modern") && !userRoom.equals("suite"));
							if(userRoom.equalsIgnoreCase("small"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextDouble();
								totalHotelPrice=ELK_SROOM*days+ELK_SROOM*tax;	
							}
							else if(userRoom.equalsIgnoreCase("modern"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextInt();
								totalHotelPrice=ELK_MROOM*days+ELK_MROOM*tax;	
							}
							else if(userRoom.equalsIgnoreCase("suite"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextInt();
								totalHotelPrice=ELK_LROOM*days+ELK_LROOM*tax;	
							}
							userHotelName=elk;//to save in transaction info
						}
						
					}
					else if(userHotel.equalsIgnoreCase("modern"))//if user picked modern choice
					{
						do 
						{	
						System.out.println("Which hotel would you want to stay at?\n");//Which modern hotel in the area
						System.out.println("1."+douglas);
						System.out.println("2."+moose);
						userHotelName=input.next();	
						}
						while (!userHotelName.equals("1") && !userHotelName.equals("2"));
						if (userHotelName.equalsIgnoreCase("1"))//Douglas Hotel
						{
							System.out.println("What size room do you want?\n(small,modern,suite");//type of room
							userRoom=input.next();
							do 
							{	
							System.out.println("What size room do you want?\\n(small,modern,suite");
							userRoom= input.next();//user input
							}
							while (!userRoom.equals("small") && !userRoom.equals("modern") && !userRoom.equals("suite"));
							if(userRoom.equalsIgnoreCase("small"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextDouble();
								totalHotelPrice=DOUGLAS_SROOM*days+DOUGLAS_SROOM*tax;	
							}
							else if(userRoom.equalsIgnoreCase("modern"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextInt();
								totalHotelPrice=DOUGLAS_MROOM*days+DOUGLAS_MROOM*tax;	
							}
							else if(userRoom.equalsIgnoreCase("suite"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextInt();
								totalHotelPrice=DOUGLAS_LROOM*days+DOUGLAS_LROOM*tax;	
							}
							userHotelName=douglas;//to save in transaction info
						}
						else if (userHotelName.equalsIgnoreCase("2"))//Moose Hotel
						{
							do 
							{	
							System.out.println("What size room do you want?\\n(small,modern,suite");
							userRoom= input.next();//user input
							}
							while (!userRoom.equals("small") && !userRoom.equals("modern") && !userRoom.equals("suite"));
							if(userRoom.equalsIgnoreCase("small"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextDouble();
								totalHotelPrice=MOOSE_SROOM*days+MOOSE_SROOM*tax;	
							}
							else if(userRoom.equalsIgnoreCase("modern"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextInt();
								totalHotelPrice=MOOSE_MROOM*days+MOOSE_MROOM*tax;	
							}
							else if(userRoom.equalsIgnoreCase("suite"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextInt();
								totalHotelPrice=MOOSE_LROOM*days+MOOSE_LROOM*tax;	
							}
							userHotelName=moose;//to save in transaction info
						}
						
					}
					else if(userHotel.equalsIgnoreCase("expensive"))//if user picked expensive choice
					{
						do 
						{	
						System.out.println("Which hotel would you want to stay at?\n");//Which expensive hotel in the area
						System.out.println("1."+banff);
						System.out.println("2."+rimrock);
						userHotelName=input.next();	
						}
						while (!userHotelName.equals("1") && !userHotelName.equals("2"));
						if (userHotelName.equalsIgnoreCase("1"))//Fairmount banff springs Hotel
						{
							do 
							{	
							System.out.println("What size room do you want?\\n(small,modern,suite");
							userRoom= input.next();//user input
							}
							while (!userRoom.equals("small") && !userRoom.equals("modern") && !userRoom.equals("suite"));
							if(userRoom.equalsIgnoreCase("small"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextDouble();
								totalHotelPrice=BANFF_SROOM*days+BANFF_SROOM*tax;	
							}
							else if(userRoom.equalsIgnoreCase("modern"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextInt();
								totalHotelPrice=BANFF_MROOM*days+BANFF_MROOM*tax;	
							}
							else if(userRoom.equalsIgnoreCase("suite"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextInt();
								totalHotelPrice=BANFF_LROOM*days+BANFF_LROOM*tax;	
							}
							userHotelName=banff;//to save in transaction info
						}
						else if (userHotelName.equalsIgnoreCase("2"))//Rimrock Hotel
						{
							do 
							{	
							System.out.println("What size room do you want?\\n(small,modern,suite");
							userRoom= input.next();//user input
							}
							while (!userRoom.equals("small") && !userRoom.equals("modern") && !userRoom.equals("suite"));
							if(userRoom.equalsIgnoreCase("small"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextDouble();
								totalHotelPrice=RIMROCK_SROOM*days+RIMROCK_SROOM*tax;	
							}
							else if(userRoom.equalsIgnoreCase("modern"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextInt();
								totalHotelPrice=RIMROCK_MROOM*days+RIMROCK_MROOM*tax;	
							}
							else if(userRoom.equalsIgnoreCase("suite"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextInt();
								totalHotelPrice=RIMROCK_LROOM*days+RIMROCK_LROOM*tax;	
							}
							userHotelName=rimrock;//to save in transaction info
						}
						
					}
					System.out.println("What time do you want to check in?");//info for check in
					checkin[1]=input.next();//user input
					System.out.println("What time do you want to check out?");//info for check out
					checkout[1]=input.next();
				}
				else if(place.equalsIgnoreCase("6"))//if user picked Newfoundland and Labrador
				{
					//type of hotel
					do 
					{	
					System.out.println("What type of hotel do you want to stay in?(please pick an option)\n(cheap(101-169) or modern($268-630)");
					userHotel=input.next();	
					}
					while (!userHotel.equals("cheap") && !userHotel.equals("modern"));
					if(userHotel.equalsIgnoreCase("cheap"))//if user picked cheap choice
					{
						do 
						{	
						System.out.println("Which hotel would you want to stay at?\n");//Which cheap hotel in the area
						System.out.println("1."+sheraton);
						System.out.println("2."+westernPlus);
						userHotelName=input.next();	
						}
						while (!userHotelName.equals("1") && !userHotelName.equals("2"));
						if (userHotelName.equalsIgnoreCase("1"))//Sheraton Hotel
						{
							do 
							{	
							System.out.println("What size room do you want?\\n(small,modern,suite");
							userRoom= input.next();//user input
							}
							while (!userRoom.equals("small") && !userRoom.equals("modern") && !userRoom.equals("suite"));
							if(userRoom.equalsIgnoreCase("small"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextDouble();
								totalHotelPrice=SHERATON_SROOM*days+SHERATON_SROOM*tax;	
							}
							else if(userRoom.equalsIgnoreCase("modern"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextInt();
								totalHotelPrice=SHERATON_MROOM*days+SHERATON_MROOM*tax;	
							}
							else if(userRoom.equalsIgnoreCase("suite"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextInt();
								totalHotelPrice=SHERATON_LROOM*days+SHERATON_LROOM*tax;	
							}
							userHotelName=sheraton;//to save in transaction info
						}
						else if (userHotelName.equalsIgnoreCase("2"))//Best Western Plus Hotel
						{
							do 
							{	
							System.out.println("What size room do you want?\\n(small,modern,suite");
							userRoom= input.next();//user input
							}
							while (!userRoom.equals("small") && !userRoom.equals("modern") && !userRoom.equals("suite"));
							if(userRoom.equalsIgnoreCase("small"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextDouble();
								totalHotelPrice=WESTERNPLUS_SROOM*days+WESTERNPLUS_SROOM*tax;	
							}
							else if(userRoom.equalsIgnoreCase("modern"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextInt();
								totalHotelPrice=WESTERNPLUS_MROOM*days+WESTERNPLUS_MROOM*tax;	
							}
							else if(userRoom.equalsIgnoreCase("suite"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextInt();
								totalHotelPrice=WESTERNPLUS_LROOM*days+WESTERNPLUS_LROOM*tax;	
							}
							userHotelName=westernPlus;//to save in transaction info
						}
						
					}
					else if(userHotel.equalsIgnoreCase("modern"))//if user picked modern choice
					{
						do 
						{	
						System.out.println("Which hotel would you want to stay at?\n");//Which modern hotel in the area
						System.out.println("1."+murray);
						System.out.println("2."+luxus);
						userHotelName=input.next();	
						}
						while (!userHotelName.equals("1") && !userHotelName.equals("2"));
						if (userHotelName.equalsIgnoreCase("1"))//Murray Hotel
						{
							do 
							{	
							System.out.println("What size room do you want?\\n(small,modern,suite");
							userRoom= input.next();//user input
							}
							while (!userRoom.equals("small") && !userRoom.equals("modern") && !userRoom.equals("suite"));
							if(userRoom.equalsIgnoreCase("small"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextDouble();
								totalHotelPrice=MURRAY_SROOM*days+MURRAY_SROOM*tax;	
							}
							else if(userRoom.equalsIgnoreCase("modern"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextInt();
								totalHotelPrice=MURRAY_MROOM*days+MURRAY_MROOM*tax;	
							}
							else if(userRoom.equalsIgnoreCase("suite"))
							{
								System.out.println("How many days will you stay?");
								days=input.nextInt();
								totalHotelPrice=MURRAY_LROOM*days+MURRAY_LROOM*tax;	
							}
							userHotelName=murray;//to save in transaction info
						}
						
						else if (userHotelName.equalsIgnoreCase("2"))//Luxus Hotel
						{
								do 
								{	
								System.out.println("What size room do you want?\\n(small,modern,suite");
								userRoom= input.next();//user input
								}
								while (!userRoom.equals("small") && !userRoom.equals("modern") && !userRoom.equals("suite"));
								if(userRoom.equalsIgnoreCase("small"))
								{
									System.out.println("How many days will you stay?");
									days=input.nextDouble();
									totalHotelPrice=LUXUS_SROOM*days+LUXUS_SROOM*tax;	
								}
								else if(userRoom.equalsIgnoreCase("modern"))
								{
									System.out.println("How many days will you stay?");
									days=input.nextInt();
									totalHotelPrice=LUXUS_MROOM*days+LUXUS_MROOM*tax;	
								}
								else if(userRoom.equalsIgnoreCase("suite"))
								{
									System.out.println("How many days will you stay?");
									days=input.nextInt();
									totalHotelPrice=LUXUS_LROOM*days+LUXUS_LROOM*tax;	
								}
								userHotelName=luxus;//to save in transaction info
							}
							
					}
					System.out.println("What time do you want to check in?");//info for check in
					checkin[1]=input.next();//user input
					System.out.println("What time do you want to check out?");//info for check out
					checkout[1]=input.next();
									}
				System.out.println("\nPress \"3\" to return to main menu  to exit completely press any other key");//to exit to main menu or exit completely
				choices=input.next();
				if (!choices.equals("3"))
				{
					Exit(args);
				}
			}
			else if((subchoice.equals("2")))
			{
				System.out.println(RETURN );
				choices=input.next();
				if(!choices.equals("2"))
				{
					Exit(args);
				}
			}
			}while(!choices.equals("3")&& !subchoice.equals("2"));
			}
			else if(choice.equals("3"))
			{
				
			}
			else if(choice.equals("4"))
			{
				
			}
			
				
			else if(choice.equals("5"))
			
			//menu choice 5
			{
				Exit(args);
			}
			
			}while(!answer.equals("5"));

		}//end of main method
		
		//menu choice 1
		
		public static void Exit(String[] args)
		{
			System.out.println("Goodbye and safe travels!");
			System.exit(0);
		}
	}

