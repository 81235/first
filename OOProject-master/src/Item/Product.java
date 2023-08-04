
package Item;

import java.util.Date;

public abstract class Product implements Item, Comparable<Product> {

    private final int serialNo;
    private final String manufacturer;
    private String name;
    private final Date manufacturedOn;

    private static int currentProductionNumber = 1;

    public Product(String name) {
        this.name = name;
        manufacturedOn = new Date();
        setProductionNumber(currentProductionNumber);
        serialNo = currentProductionNumber++;
        manufacturer = manufacturerOrigin;
    }

    @Override
    public void setProductionNumber(int productionNo) {
        currentProductionNumber = productionNo;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Date getManufactureDate() {
        return manufacturedOn;
    }

    @Override
    public int getSerialNumber() {
        return serialNo;
    }

    @Override
    public String toString() {

        return "Manufacturer: " + manufacturer + "\n"
                + "Serial Number: " + serialNo + "\n"
                + "Date: " + manufacturedOn + "\n"
                + "Name: " + name;
    }

    public int compareTo(Product product) {
        return name.compareTo(product.name);

    }
}

