class atm{
    private int totalamount=1000;
    public void getb(){
        System.out.println("Total amount: "+totalamount);
    }
    public void setBalance(int amount){
        if(amount>0){
            totalamount+=amount;
        }
    }
}
class Main{
    public static void main(String[] args){
        atm s1=new atm();
        s1.getb();
        s1.setBalance(500);
    }
}