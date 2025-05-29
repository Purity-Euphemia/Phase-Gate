public class ArrayIndexRowAndColumn{
	public static void sortNumbers(int[] array){

	for(int count = 0; count < array.length - 1; count++){
		for(int counter = 0; counter < array.length - count - 1; count++){
			if(array[counter] > array[counter + 1]){
			

			int temp = array[counter];
			array[counter] = array[counter + 1];

			array[counter + 1] = temp;


		}
	}
		}

}

	public static void main(String[] args){
		int[][] numbers = {	
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
				};
			

		sortNumbers(numbers);

		System.out.println("The sorted numbers: ");

			for(int num : numbers){
				System.out.print(num + " ");



}
}
}