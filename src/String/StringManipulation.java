package String;

public class StringManipulation {


	public static void main(String[] args) {
		String str = "java_python_javascriptjj";
		
		int len = str.length();
		System.out.println(len);
		System.out.println(str.charAt(len-1));
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(4));
		System.out.println(str.indexOf("python"));
		System.out.println(str.indexOf("p"));
		System.out.println("First Ocuurance of J: " + str.indexOf('j')); //1st occurrence
		//System.out.println(str.indexOf('j', str.indexOf('j')+1)); //2nd occurrence
		int secOccur = str.indexOf('j', str.indexOf('j')+1);
		System.out.println("Second occurrance of J: " + secOccur);
		int thirdOccur = str.indexOf('j',secOccur+1); //3rd occurrence
		System.out.println("Third Ocurrance of j: " + thirdOccur);
		int fourthOccur = str.indexOf('j',thirdOccur+1);
		System.out.println("fourth ocurrance of J: " +fourthOccur );
	}

}
