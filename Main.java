
class Chaishop{
	String Shopname;
	int CupsSold;
    public void Classfunc(String s){
        System.out.println("Welcome to TT shop"+ " " +s);
    }
}
public class Main {
       public static void main(String[] args) {
        
		Chaishop branch1= new Chaishop();
        branch1.Shopname="TT shop";
        branch1.CupsSold=7;
        System.out.println(branch1.Shopname);
        System.out.println(branch1.CupsSold); 
        String str="hi";
        branch1.Classfunc(str);


        Chaishop branch2= new Chaishop();
        branch2.Shopname="RR shop";
        branch2.CupsSold=5;
        System.out.println(branch2.Shopname);
        System.out.println(branch2.CupsSold); 
	}
}
