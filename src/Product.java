import java.util.Objects;


public class Product {
    private String IDNum;
    private String name;
    private String description;
    private double cost;

    public Product(String IDNum, String name, String description, double cost) {
        this.IDNum = IDNum;
        this.name = name;
        this.description = description;
        this.cost = cost;
    }

    /**
     * creates a CSV data string that encodes all the data for this object instance
     * @return CSV data string containing ID number, first name, last name, title, and year of birth
     */
    public String toCVS() {
        return IDNum + ", " + name + ", " + description + ", " + cost;
    }

    /**
     * creates a JSON data string that encodes all the data for this object instance
     * @return JSON data string containing ID number, first name, last name, title, and year of birth
     */
    public String toJSON() {
        return "{" +
                "\"IDNum\":\"" + IDNum + "\"," +
                "\"name\":\"" + name + "\"," +
                "\"description\":\"" + description + "\"," +
                "\"cost\":" + cost + "," +
                "}";
    }
    /**
     * creates an XML data string that encodes all the data for this object instance
     * @return XML data string containing ID number, first name, last name, title, and year of birth
     */
    public String toXML() {
        String retString = "<Product>";
        retString += "<IDNum>" + IDNum + "</IDNum>";
        retString += "<name>" + name + "</name>";
        retString += "<description>" + description + "</description>";
        retString += "<cost>" + cost + "</cost></Product>";
        return retString;
    }

    @Override
    public String toString() {
        return IDNum + ", " + name + ", " + description  + ", " + cost;
    }


    public String getIDNum() {
        return IDNum;
    }

    public void setIDNum(String IDNum) {
        this.IDNum = IDNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(cost, product.cost) == 0 && Objects.equals(IDNum, product.IDNum) && Objects.equals(name, product.name) && Objects.equals(description, product.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(IDNum, name, description, cost);
    }
}
