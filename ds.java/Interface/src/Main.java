////class atm{
////    private int totalamount=1000;
////    public void getb(){
////        System.out.println("Total amount: "+totalamount);
////    }
////    public void setBalance(int amount){
////        if(amount>0){
////            totalamount+=amount;
////        }
////    }
////}
////class Main{
////    public static void main(String[] args){
////        atm s1=new atm();
////        s1.getb();
////        s1.setBalance(500);
////    }
////}
////////////////////////////////////////////////////////////////
//import java.util.Scanner;
//
//class Youtube {
//    private String ChannelName;
//    private int SubscriberCount;
//    private int pin;
//
//
//    private boolean isUnlocked = false;
//
//    public Youtube(String ChannelName, int SubscriberCount, int pin) {
//        this.ChannelName = ChannelName;
//        this.SubscriberCount = SubscriberCount;
//        this.pin = pin;
//    }
//
//    public void getChannelName() {
//        System.out.println("Channel Name: " + ChannelName);
//    }
//
//
//    public void unlock(int enteredPin) {
//        if (enteredPin == pin) {
//            isUnlocked = true;
//            System.out.println("Access Granted!");
//        } else {
//            System.out.println("Incorrect PIN! Access Denied.");
//        }
//    }
//
//    // show subscriber count only if unlocked
//    public void showSubscriberCount() {
//        if (isUnlocked) {
//            System.out.println("Subscriber Count: " + SubscriberCount);
//        } else {
//            System.out.println("You must unlock the account first!");
//        }
//    }
//
//    public void increaseSubscriberCount() {
//        SubscriberCount++;
//    }
//
//    public void decreaseSubscriberCount() {
//        if (SubscriberCount > 0) {
//            SubscriberCount--;
//        } else {
//            System.out.println("Error: No subscribers to remove!");
//        }
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        Youtube y1 = new Youtube("Code with Rupesh", 0, 1234);
//
//        y1.getChannelName();
//
//        System.out.print("Enter PIN to unlock: ");
//        int pin = sc.nextInt();
//        y1.unlock(pin);
//
//        y1.showSubscriberCount();
//        y1.increaseSubscriberCount();
//        y1.showSubscriberCount();
//        y1.increaseSubscriberCount();
//        y1.showSubscriberCount();
//        y1.decreaseSubscriberCount();
//        y1.showSubscriberCount();
//        y1.increaseSubscriberCount();
//        y1.showSubscriberCount();
//        y1.increaseSubscriberCount();
//        y1.showSubscriberCount();
//        y1.increaseSubscriberCount();
//        y1.showSubscriberCount();
//        y1.increaseSubscriberCount();
//        y1.showSubscriberCount();
//        y1.increaseSubscriberCount();
//        y1.showSubscriberCount();
//        y1.increaseSubscriberCount();
//        y1.showSubscriberCount();
//        y1.increaseSubscriberCount();
//        y1.showSubscriberCount();
//        y1.increaseSubscriberCount();
//        y1.showSubscriberCount();
//        y1.increaseSubscriberCount();
//        y1.showSubscriberCount();
//        y1.increaseSubscriberCount();
//        y1.showSubscriberCount();
//        y1.increaseSubscriberCount();
//        y1.showSubscriberCount();
//        y1.increaseSubscriberCount();
//        y1.showSubscriberCount();
//        y1.increaseSubscriberCount();
//        y1.showSubscriberCount();
//        y1.increaseSubscriberCount();
//        y1.showSubscriberCount();
//        y1.increaseSubscriberCount();
//        y1.showSubscriberCount();
//        y1.increaseSubscriberCount();
//        y1.showSubscriberCount();
//        y1.increaseSubscriberCount();
//        y1.showSubscriberCount();
//        y1.increaseSubscriberCount();
//        y1.showSubscriberCount();
//        y1.increaseSubscriberCount();
//        y1.showSubscriberCount();
//        y1.increaseSubscriberCount();
//        y1.showSubscriberCount();
//        y1.increaseSubscriberCount();
//        y1.showSubscriberCount();
//        y1.increaseSubscriberCount();
//        y1.showSubscriberCount();
//
//    }
//}

