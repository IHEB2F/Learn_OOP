public class Main {
    public static void main(String[] args) {
        Voiture v =new Voiture("BMW", 10);
        System.out.print(v.toString());
        Voiture v2 =new Voiture("m", 10000000);
        System.out.print(v2.toString());
        v2.setName("iheb");
         System.out.print(v2.toString());
         FastVoiture f= new FastVoiture("fast1", 100,120);
         System.out.println(f.toString());
         System.out.println(f.toString("fast1"));
         System.out.println(f.toString("fast",100));

        
    }
    }