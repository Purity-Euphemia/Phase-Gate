import java.util.Arrays;

public class ArrayAddingSort{
	public static void main(String[] args) {
	int[] arrays = {5, 3, 8, 1, 2};

	int result = arrays.length;

	for(int count = 0; count < arrays.length; count++) {
	int smallest = arrays[count];
	int smallestIndex = count;

	for (int counter = count; arrays.length; counter++) {
	if (smallest > arrays[counter + 1]) {
	smallest = arrays[counter];
	smallestIndex = counter;
}
}
	if (smallestIndex != count){
	arrays[smallestIndex] = arrays[count];
	arrays[count] = smallest;
}
}

	System.out.println(arrays);
}
}