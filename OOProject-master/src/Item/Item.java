

/*
 * A constant called manufacturer that would be set to “OracleProduction”.  A method
 * setProductionNumber that would have one integer parameter  A method setName that would have one
 * String parameter  A method getName that would return a String  A method getManufactureDate that
 * would return a Date  A method getSerialNumber that would return an int
 */
package Item;

import java.util.Date;

public interface Item {

     String manufacturerOrigin = "OracleProduction";

    /**
     * This mutator sets the production number of the Item.

     * @param productionNo is the production number for each
     */

    void setProductionNumber(int productionNo);

    /**
     * This mutator sets the name of the Item.Item
     *
      @param name is the name of each
     */
    void setName(String name);

    /*
     * This accessor gets the name of the Item.
     */
    String getName();

    /*
     * This accessor gets the date of the Item.
     */
    Date getManufactureDate();

    /*
      This accessor gets the serial number of the Item.
     */
    int getSerialNumber();

    //
}
