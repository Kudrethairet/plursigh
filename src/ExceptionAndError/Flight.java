package ExceptionAndError;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Flight {

	int passengers;

	// other memeber elided for clarity
	public void addPassengers(String filename) throws IOException
	{
		BufferedReader reader = null;

		try{
		reader = new BufferedReader(new FileReader(filename));
		String line = null;
		while((line = reader.readLine())!=null)
		{
			String[] parts = line.split(" ");
			passengers = passengers+Integer.valueOf(parts[0]);
		}
		System.out.println(passengers);
		}finally{
			if(reader !=null)
				reader.close();
		}
	}
	
	public static void main(String[] args) throws IOException {
		Flight fl= new Flight();
		fl.addPassengers("src/ExceptionAndError/PassengerList.txt");
	}

}
