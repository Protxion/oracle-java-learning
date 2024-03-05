package duke.choise;

public class Customer {

    private String name;
    private String size;
    private Clothing[] items;

    public Customer(String name,int  measurement) {
        this.name = name;
        setSize(measurement);
    }

    
    public void addItems(Clothing[] someItems) {
        items = someItems;
    }

    public Clothing[] getItems() {
        return items;
    }

    public String getName() {
        return name;
    }

    public double getTotalClothingCost() {
        double total = 0.0;
        
        for (Clothing item : items) {
            //if (c1.getSize().equals(item.getSize())) {
                total = total + item.getPrice();
                //System.out.println("Prenda: " + item.getDescription() + "\n" + item.getSize() + "\n" + item.getPrice());
                //total = total + total * Impuesto;
                //if (total > 15.0) {
                    //break;
                //}
            //}
        }
        return total;
    }
    

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setSize(int measurement) {
        switch (measurement) {
            case 1, 2, 3:
                setSize("S");
                //System.out.println(c1.size);

                break;
            case 4, 5, 6:
                setSize("M");
                //System.out.println(c1.size);

                break;
            case 7, 8, 9:
                setSize("L");
                //System.out.println(c1.size);

                break;
            default:
                setSize("X");
                break;
        }
    }

}
