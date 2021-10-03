import java.util.ArrayList;
import java.text.DecimalFormat;

public class CafeUtil{

    DecimalFormat f = new DecimalFormat("$###,###.00");

    public int getStreakGoal(){
        int sum = 1;
        for(int i = 2; i <= 10; i++){
            sum += i;
        }
        return sum;
    }

    public void printPriceChart(String productName, double price, int maxNumber){
        System.out.println(productName);
        for(int i = 1; i <= maxNumber; i++){
            System.out.println(i + " - " + f.format(price * i));
        }
    }

    public double getOrderTotal(double[] orderTotal){
        double sum = 0;
        for(int i = 0; i < orderTotal.length; i++){
            sum += orderTotal[i];
        }
        return sum;
    }

    public void displayMenu(ArrayList<String> menu, ArrayList<Double> price){
        for(int i = 0; i < menu.size(); i++){
            System.out.println(i + " " + menu.get(i) + " -- " + f.format(price.get(i)));
        }
    }

    public void addCustomer(ArrayList<String> customers){
        System.out.println("What is your name?");
        String userName = System.console().readLine();
        System.out.println("Hello, " + userName + "! There are " + customers.size() + " customers ahead of you.");
        customers.add(userName);
    }
}