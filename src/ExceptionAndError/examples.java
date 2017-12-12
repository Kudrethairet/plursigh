package ExceptionAndError;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class examples {

	public static void main(String[] args) {
		/*
		 * int i = 12; int j = 2;
		 * 
		 * try{ int result = i / (j - 2); System.out.println(result);
		 * }catch(Exception e){ System.out.println("error "+ e.getMessage());
		 * e.printStackTrace(); }
		 */

		BufferedReader reader = null;
		int total = 0;

		try {
			reader = new BufferedReader(new FileReader("src/ExceptionAndError/Numbers.txt"));
			String line = null;
			while ((line = reader.readLine()) != null) {
				total = total + Integer.valueOf(line);
				// total +=Integer.valueOf(line);

			}
			System.out.println(total);
		} catch (NumberFormatException e) {
			System.out.println("invalid value: " + e.getMessage());
		} catch (FileNotFoundException e) {
			System.out.println(e.getLocalizedMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				reader.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}
}
