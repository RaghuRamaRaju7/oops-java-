class Chaishop{
    String branchName;
    int cupsSold;
    int pricePerCup;
    
    //constructor
    public Chaishop(String branchName,int cupsSold,int pricePerCup){
       this.branchName=branchName;
       this.cupsSold=cupsSold;
       this.pricePerCup= pricePerCup;
    }
    public void revenue(){
        System.out.println("Revenue:"+(cupsSold * pricePerCup));
    }
    public void chaiOrder(int ChaiPlease ){
        cupsSold+=ChaiPlease;
    }
    public void display(){
         System.out.println(branchName);
         System.out.println(cupsSold);
         System.out.println(pricePerCup);
         revenue();
        
    }
}
class Main2 {
    public static void main(String[] args) {
        Chaishop cs = new Chaishop("ChaiPoint",0,7);
        cs.chaiOrder(7);
        cs.display();  
    }
}