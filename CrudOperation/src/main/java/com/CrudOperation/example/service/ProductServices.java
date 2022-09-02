package com.CrudOperation.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CrudOperation.example.dto.ProductDTO;
import com.CrudOperation.example.ent.Product;
import com.CrudOperation.example.repo.ProductRepository;

@Service
public class ProductServices {
   @Autowired
	private ProductRepository repository;
   
   //Post Method
     public Product saveProduct(ProductDTO productDTO) 
     { 
    	 Product product=new Product();
    	 product.setName(productDTO.getName());
    	 product.setQuantity(productDTO.getQuantity());
    	 product.setPrice(productDTO.getPrice());
    	 
    	return repository.save(product);
    	
    	
    	// return product;
    	
    	
    	 
    	
    	  
     }
    	  public List<Product> saveproducts(List<Product> products) {
			return repository.saveAll(products);
    	  }
			
			
			//Get Method
			public List<Product> getProducts() {
				return repository.findAll();
				
			}
			
			public Product getProductById(int id) {
				return repository.findById(id).orElse(null);
				
			}
			

			// TODO Auto-generated method stub
		public Product getProductByName(String  name) {
				return repository.findByName(name);
				
		}			 
			
			//Delete Product
			
			public String deleteProduct(int id)	
			{
				repository.deleteById(id);
				return "Remove Product"+id;
			}
			
			//update product
			//id cant be modified
//			public Product upProduct(Product product)
//			{
//						Product existingProduct=repository.findById(product.getId()).orElse(product);
//				existingProduct.setName(Product.getName());
//				 existingProduct.setQuantity(Product.getQuantity());
//				 existingProduct.setPrice(Product.getPrice());
//				return repository.save(existingProduct);
//				
//				
//				
//			}
			public Product updateProduct(Product product) {
				// TODO Auto-generated method stub
				return null;
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
    		  
    	  
     
}
