public class Methods {
    
    //Variable Declaration
    
    //Method Declaration
    //main is the function that runs first and starts the lifecycle
    public static void main(String[] args) {
        
        String myString = "I feel like we've greeted the world enough already so we'll just stick with a casual nod at this point and move past the formal greetings.";
        
        String shoutyString = myString.toUpperCase(); // Set shoutyString to the upper case version of myString.
        
        Integer stringLength = myString.length(); // Set stringLength to the length of myString
        
        String sNum = "43";
        
        Integer num = Integer.parseInt(sNum); // Set num to the integer value of sNum
        
        // This is a base constructor for Date
        //Date longLongTimeAgo = new Date(0);
        
        //Print out a new line with each object aboves toString() mehod
        System.out.println(myString.toString());
        System.out.println(shoutyString.toString());
        System.out.println(stringLength.toString());
        System.out.println(sNum.toString());
        System.out.println(num.toString());
        /*
         
         Paste the output here:
         
I feel like we've greeted the world enough already so we'll just stick with a casual nod at this point and move past the formal greetings. 
I FEEL LIKE WE'VE GREETED THE WORLD ENOUGH ALREADY SO WE'LL JUST STICK WITH A CASUAL NOD AT THIS POINT AND MOVE PAST THE FORMAL GREETINGS. 
138 
43 
43 
         */
        
    }
    
}