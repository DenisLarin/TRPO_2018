package Server;

public class Money {
    private String name;
    private String valute;
    private String price;

    public String getValue() {
        return valute;
    }

    public void setValue(String value) {
        this.valute = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "{" +
                "\"name\":\"" + name + '\"' +
                ", \"price\":\"" + price +'\"'+
                ", \"valute\":\"" + valute +'\"'+
                "}";
    }

}
