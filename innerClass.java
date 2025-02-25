class Chaishop{
    String branchName="booom";
    class Subname{
        String sn="TejoshChai";
    }
}
class Main {
    public static void main(String[] args) {
        Chaishop sh= new Chaishop();
        System.out.println(sh.branchName);
        
        Chaishop.Subname sh1=sh.new Subname();
         System.out.println(sh1.sn);
    }
}