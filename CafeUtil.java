import java.util.ArrayList;

public class CafeUtil {

    public int getStreakGoal(){

        int[] weekStreak = {1,2,3,4,5,6,7,8,9,10};

        int sum = 0;
        for(int i = 0; i < weekStreak.length; i++){
            sum += weekStreak[i];
        }
        return sum;
    }

    public double getOrderTotal(double[] prices){
        double sum = 0.0;
        for(int i = 0; i < prices.length; i++){
            sum += prices[i];
        }
        return sum;
    }

    public void displayMenu(ArrayList<String>menuItems){
        System.out.println("0 " + menuItems.get(0));
        System.out.println("1 " + menuItems.get(1));
        System.out.println("2 " + menuItems.get(2));
        System.out.println("3 " + menuItems.get(3));
    }

    public void addCustomer(ArrayList<String>newCustomer){
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello, " + userName + "!");
        newCustomer.add(userName);
        System.out.println("There are " + newCustomer.size() + " people in front of you");
    }
}