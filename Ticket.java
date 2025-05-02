public class Ticket {
	
	public String getTicketInfo(String theaterName , String movieName , String seatNo){
				return "Theater Name : " + theaterName + "\nMovie Name : " + movieName + "\nSeat No : " + seatNo;

}
	
	public static void main(String [] args){
		
		Ticket ticket = new Ticket();
	
 		String ticket1 = ticket.getTicketInfo("Galaxy Cinemas" , "Interstellar" , "A10");
			System.out.println(ticket1);
		System.out.println("------------------");
		
		String ticket2 = ticket.getTicketInfo("Galaxy Cinemas" , "Inception" , "B12");
				System.out.println(ticket2);


		System.out.println("------------------");
	}

}