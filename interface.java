interface Owner{
    String Name1="Raghu";
    int PhoneNumber1=12345;
    
}
interface ChaiPowderSupplier{
    String Name2="Tejosh";
    int PhoneNimber2=284639;
}

class Chaishop implements Owner,ChaiPowderSupplier{
}
class Main {
    public static void main(String[] args) {
        Chaishop cs = new Chaishop();
        System.out.println(cs.Name1);
        System.out.println(cs.Name2);
    }
}