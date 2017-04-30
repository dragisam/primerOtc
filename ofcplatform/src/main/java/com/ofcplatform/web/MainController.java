package com.ofcplatform.web;

import com.ofcplatform.domain.Function;
import com.ofcplatform.domain.IntegrationProbability;
import com.ofcplatform.domain.Product;
import com.ofcplatform.domain.Supplier;
import com.ofcplatform.services.FunctionRepository;
import com.ofcplatform.services.ProductRepository;
import com.ofcplatform.services.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Nenad on 4/16/2017.
 */
@Controller
@RequestMapping(path="/demo")
public class MainController {

    @Autowired
    private SupplierRepository supplierRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private FunctionRepository functionRepository;

    @GetMapping(path="/add")
    public @ResponseBody String addNewSupplier(@RequestParam String name, String webSite){
        Supplier newSupplier = new Supplier();
        newSupplier.setName(name);
        newSupplier.setWebsite(webSite);

        supplierRepository.save(newSupplier);

        return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Supplier> getAllSuppliers(){
        return supplierRepository.findAll();
    }


    @GetMapping(path="/addfunction")
    public @ResponseBody String addNewSupplier(@RequestParam boolean ofi, String code, String function, String ip){
        Function newFunction= new Function();

        newFunction.setOpportunitiesForImprovements(ofi);
        newFunction.setCode(code);
        newFunction.setFunction(function);
        newFunction.setIntegrationProbability(IntegrationProbability.valueOf(ip));

        functionRepository.save(newFunction);

        return "Saved";
    }


    @GetMapping(path="/addProduct")
    public @ResponseBody String addNewProduct(@RequestParam String website, String name, Long supplierId){
        Product newProduct= new Product();

        newProduct.setWebsite(website);
        newProduct.setName(name);
        Supplier one = supplierRepository.findOne(supplierId);
        newProduct.setSupplier(one);

        productRepository.save(newProduct);

        return "Saved";
    }

    @GetMapping(path="/allProducts")
    public @ResponseBody Iterable<Product> getAllProducts(){
        return productRepository.findAll();
    }
}
