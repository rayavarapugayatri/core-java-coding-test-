package reversestring;

public class reversestring {

	public static void main(String[] args) {
		Scanner scanner = new
				Scanner(System.in);
		System.out.print("Enter a string:");
		String input = scanner.nextLine();
		try {
			String reversrd = new
					StringBuilder(input).reverse().toString();
			System.out.println("Reversed string:"+reversed);
		}cath(NullpointerException|StringIndexOutOfBoundsException e){
			System.out.println("Oops!Something went wrong.please check your input.");
		}
	    }
}