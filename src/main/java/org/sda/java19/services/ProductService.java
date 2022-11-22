package org.sda.java19.services;

import org.sda.java19.exceptions.WarehouseNotFoundException;
import org.sda.java19.models.Product;
import org.sda.java19.models.ProductCategory;

import java.util.List;

/**
 * Service to handle product related operations
 *
 * @author Vinod John
 */
public interface ProductService {
    /**
     * To add a new product in a warehouse
     * @param product Product
     */
    void addProduct(Product product) throws WarehouseNotFoundException;

    /**
     * To update an existing product in a warehouse
     * @param product Product
     */
    void updateProduct(Product product);

    /**
     * To delete a product in a warehouse by its name
     * @param name name of the product
     */
    void deleteProductByName(String name);

    /**
     * To get a product by its name from warehouse
     * @param name name of the product
     * @return Product
     */
    Product getProductByName(String name);

    /**
     * To get a lis tof all products from the warehouse by a given product category
     * @param productCategory product category
     * @return list of products
     */
    List<Product> getAllProductsByProductCategory(ProductCategory productCategory) throws WarehouseNotFoundException;


    /**
     * To get all products from the warehouse
     * @return list of products
     */
    List<Product> getAllProducts() throws WarehouseNotFoundException;
}
