public class MethodStringCounts{

	public static String MethodFunction(String letter,char ch){

	String newLetter = letter.toLowerCase();
	
	letter = " ";
	
	int counter = 0;

	for(int count = 0; count <= letter.length(); count++){
	letter.charAt(count);
		counter++;
	
}
	return counter;

}

	public static void main(String[] args){

	int[] myList = {"Hello World"};
		

	System.out.print(MethodStringCounts.MethodFunction(myList));




}

	

}
