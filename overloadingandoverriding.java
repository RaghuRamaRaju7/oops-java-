class OwnerDetails{
    String OwnerName="Bhai";
    int phoneNumber=1233455;
    void func1(){
        System.out.println(5);
    }
}
class XeroxShop extends OwnerDetails{
    String branchName;
    int PapersSold;
    int PricePerPaper;
    public XeroxShop(String branchName,int PapersSold,int PricePerPaper){
        this.branchName=branchName;
        this.PapersSold=PapersSold;
        this.PricePerPaper=PricePerPaper;
    }
    void display(){
       System.out.println("OwnerName"+" "+OwnerName);
       System.out.println("branchName:"+branchName);
       System.out.println("PapersSold:"+PapersSold);
       System.out.println("PricePerPaper:"+PricePerPaper);
       
    }
    
    //methodOverloading
    void func(){
       System.out.println(1);
    }
    void func(int a){
        System.out.println(2);
    }
    void func(int a,int b){
        System.out.println(3);
    }
    void func(int a,String b){
        System.out.println(4);
    }
    void func(String a,int b){
        System.out.println(5);
    }
    //overriding
    void func1(){
        System.out.println(6);
    }
    
}
class Main {
    public static void main(String[] args) {
        XeroxShop xs=new XeroxShop("TejoshXeroxs",77,2);
        xs.display();
        xs.func();
        xs.func(7);
        xs.func(7,7);
        xs.func(7,"seven");
        xs.func("seven",7);
        xs.func1();
        System.out.println();
    }
}