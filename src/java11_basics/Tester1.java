package java11_basics;


//Sample:
//
//Input (Valid): "http://www.infosys.com"
//
//Output: "You have entered a valid web address"
//
// 
//
//Input (Invalid): "http.www.infosys.au"
//
//Output: "You have entered an invalid web address"
//
//Note: Check the project using SonarLint to maintain the coding standards. Ignore the violations which occur due to "System.out" statements.
class Tester1{
    public static void main (String[] args) {
        //code here
        WebAddressValidator v1=new WebAddressValidator();
        boolean str1=v1.isValidWebAddress("http://www.in&fosys.com");
        if(str1){
            System.out.println("You have entered a valid web address");
        }
        else{
            System.out.println("You have entered an invalid web address");
        }
        WebAddressValidator v2=new WebAddressValidator();
         boolean str2=v2.isValidWebAddress("http.www.infosys.au");
         if(str2){
            System.out.println("You have entered a valid web address");
        }
        else{
            System.out.println("You have entered an invalid web address");
        }
        
    }
}