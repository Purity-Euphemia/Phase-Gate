public class ArraySortingAlphabetFunction{
	public static String sortAlphabets(String word, char ch){

	char[] letters = word.toCharArray();
	
	String result = " ";

	for(int count = 0; count < letters.length; count++){
		if(letters[count] == ch){
			break;


	} else {


		result = result + letters[count];

}

}
	return result;


}


	public static void main(String[] args){

		String[] words = {"abcdefd"};

		char ch = 'd';
		System.out.println(ArraySortingAlphabetFunction.sortAlphabets(words));


}

}







