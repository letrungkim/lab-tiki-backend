package rmit.rmitsb.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String productName;

    private int productPrice;

    private int productQuantity;

    private String productType;

    public Product() {
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() {return productPrice;}

    public void setProductPrice(int productPrice) { this.productPrice = productPrice; }

    public int getProductQuantity() {return productQuantity;}

    public void setProductQuantity(int productQuantity) {this.productQuantity = productQuantity;}

    public String getProductType() {return productType;}

    public void setProductType(String productType) {this.productType = productType;}
}
