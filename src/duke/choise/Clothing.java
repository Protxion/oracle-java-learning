package duke.choise;

public class Clothing implements Comparable< Clothing>{

    private String Description;
    private Double Price;
    private String Size = "M";
    public final static double  minimumPrice= 10.0;
    public final static double minumumImpuesto = 0.2;

    public Clothing(String Description, Double Price, String aSize) {
        this.Description = Description;
        this.Price = Price;
        Size = aSize;
    }
    
    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public Double getPrice() {
        return Price + (Price *  minumumImpuesto);
    }

    public void setPrice(Double Price) {
        this.Price =(Price > minimumPrice)? Price : minimumPrice;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String Size) {
        this.Size = Size;
    }
    @Override
    public String toString(){
        return getDescription()+"\n" +getSize()+"\n"+ getPrice();
    }

    @Override
    public int compareTo(Clothing c) {
        return this.Description.compareTo(c.Description);
    }
    
}
 
