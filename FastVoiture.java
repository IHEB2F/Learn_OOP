public class FastVoiture extends Voiture {
    private int speed ;
    public FastVoiture(String name, double price ,int speed) {
        super(name, price);
        this.speed=speed; 
     
    
}
public String toString (String name, double price)
{
    return " Classe Fast Voiture  name  Fast voiture  "+ this.name + "\n +  price  fast Voiture " + this.price;
}

}