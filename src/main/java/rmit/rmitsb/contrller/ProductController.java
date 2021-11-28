package rmit.rmitsb.contrller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rmit.rmitsb.model.Product;
import rmit.rmitsb.service.ProductService;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")

public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping(path = "/products", method = RequestMethod.GET)
    public List<Product> getAllProduct(){
        return productService.getAllProduct();
    }

    @RequestMapping(path = "/products", method = RequestMethod.POST)
    public void addProduct(@RequestBody Product product){
         productService.saveProduct(product);
    }

    @RequestMapping(path = "/products", method = RequestMethod.PUT)
    public void updatesProduct(@RequestBody Product product){
        productService.saveProduct(product);
    }

    @RequestMapping(path = "/products/{id}", method = RequestMethod.DELETE)
    public void deleteProduct(@PathVariable(value = "id") Long id){
        productService.deleteProduct(id);
    }

    @RequestMapping(path = "/products/{id}", method = RequestMethod.GET)
    public Product getProduct(@PathVariable(value = "id") Long id){
        return productService.getProduct(id);
    }
}
