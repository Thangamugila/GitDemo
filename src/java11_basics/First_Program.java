package java11_basics;

public class First_Program {
    public static void main(String[] args) {
//	   String str1="Thanga Mugila";
//	   String str2=new String("Thanga Mugila");
//	   String str3=new String("Thanga Mugila");
//	   System.out.println(str3 == str2);
//	   System.out.println(str3.equals(str2));
//    	String one="1000";
//    	int oneToOne=Integer.parseInt(one);
//    	System.out.println(one);
//    	System.out.println(oneToOne);
//    	System.out.println(oneToOne==100);
    	
//    	String name="Thanga mugila";
//    	String str1=" Is a good girl ";
//    	String str2=" ";
//    			System.out.println(name.concat(str1).repeat(4));
//    			System.out.println(str2.isBlank());
//    			System.out.println(str1.endsWith("rl "));
//    			System.out.println(str2.isEmpty());
//    			System.out.println(name.replace('a', 'i'));
    	//Sample String
    	String chainedString = "Lets break this chain and be free !";
    	//Creating Regex for splitting the String
    	String regex = " ";
    	//Splitting the String using split() method
    	//split()divides the String and stores them in a Array of String
    	String[] freeString = chainedString.split(regex);
    	/**
    	 *  freeString = ("Lets", "break", "this", "chain", "and", "be", "free", "!")
    	 */
    	for (String string : freeString) {
    		 System.out.println(string);
		}
        
}
}
