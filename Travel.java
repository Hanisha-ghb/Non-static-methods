public class Travel {
	
	public String getTravelInfo(String agency , String destination , int travellers){
		
		return "Agency : " + agency + "\nDestination : " + destination + "\nTravellers : " + travellers ;

	}

	public static void main(String [] args){
		
		Travel travel = new Travel();
		
		String info =travel. getTravelInfo("Wanderlust Travels" , "Paris" , 2);
					System.out.println(info);

		System.out.println("------------------");		
		String info1 = travel.getTravelInfo("Wanderlust Travels" , "Tokyo" , 3);
				System.out.println(info1);

		System.out.println("------------------");
	
}

}