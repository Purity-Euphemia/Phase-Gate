import java.util.Arrays;
public class AscendingArray{
	public static int addArrayIn(int[] numbers) {
	
	int total = 0;
	for(int count = 0; count < numbers.length; count++){
		total += numbers[count];



	
}
	return total;

}


		public static void main(String[] args){
		int[] myList = {3, 1, 5};
		Arrays.sort(myList);

		System.out.print(ArrayAddingSort.addArrayIn(myList));




}



















}