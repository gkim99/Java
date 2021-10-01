public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffee = 3.0;
        double latte = 4.0;
        double cappuccino = 4.5;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3= "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = false;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1 + pendingMessage); // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //
        
        if (isReadyOrder3 == true){
            System.out.println(generalGreeting + customer4 + readyMessage);
            System.out.println(displayTotalMessage + cappuccino);
        } else {
            System.out.println(generalGreeting + customer4 + pendingMessage);
        }

        System.out.println(generalGreeting + customer2);
        System.out.println(displayTotalMessage + (latte*2));
        if (isReadyOrder2 == true){
            System.out.println(customer2 + readyMessage);
        } else {
            System.out.println(customer2 + pendingMessage);
        }

        System.out.println(customer3 + ", sorry for the wrong charge. " + displayTotalMessage + (latte - dripCoffee));
    }
}
