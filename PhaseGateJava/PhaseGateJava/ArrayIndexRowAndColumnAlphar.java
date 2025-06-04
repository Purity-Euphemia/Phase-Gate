import java.util.Arrays;
public class ArrayIndexRowAndColumnAlphar{

	public static String addArrayIn(int[] numbers) {
	
	int max = numbers[0];
	int rowIndex = 0;
	int colIndex = 0;
	for(int count = 0; count < numbers.length; count++){
		for(int counter = 0; counter < numbers.length; counter++){
		if(numbers[count] > max){
		max = numbers[count];
		rowIndex = count;
		colIndex = counter;

	
}
	
}
}
	return "Largest number is " + max + " at row " + rowIndex;
}


	public static void main(String[] args){

	int[] myList = {20, 2, 8, 20, 5};
		

	System.out.print(ArrayIndexRowAndColumnAlphar.addArrayIn(myList));




}



















}
	