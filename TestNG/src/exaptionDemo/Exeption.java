package exaptionDemo;

///// one try can be followed by multiple catch blocks;

//catch block should followed by try block;

//should not write anything between try and catch block.

//Excaption e=====> is a general exaption;
public class Exeption {
	public static void main(String[] args) {

		
		int b = 7;
		int c = 0;

		try {

			int k = b / c;

			System.out.println(k);
		} catch (ArithmeticException et) {
			System.out.println("arithmaticExcaptions catched.");
		} catch (IndexOutOfBoundsException ets) { ///// if we declare a arrylist and give the size as 5  but we want to print 7th
			System.out.println("cathed indexOutBoundsExcaption");
		}

		catch (Exception e) {
			System.out.println("Errorrr");
		}
		finally{
			//this block is executed irrespective of excaption thrown or not.
			// even if there is something wrong with the script. as long as we have finally ;
			// it will excute the block inside the finally.
			
			
			
			
			//for example if we want to clean the cookies before the next test.
			//no matter the first test pass or not.
			//we can put that code in the finally block;
			
			
			System.out.println("delete the cookiesssss.");
			
			
			
			
			// any where finally block will not executed  ???
			//it will not be executed when we stop jvm forceably before it execute;
			
			
			
			
			
			
			
		}

	}

}