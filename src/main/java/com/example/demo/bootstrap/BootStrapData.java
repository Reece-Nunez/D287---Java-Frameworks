package com.example.demo.bootstrap;

import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadSampleData();
        }

        private void loadSampleData() {
            if (partRepository.count() == 0 && productRepository.count() == 0) {

                Part processor = new Part("i7 Processor", 987.99, 187, 2, 200);
                Part motherboard = new Part("Asus Motherboard", 287.99, 137, 3, 234);
                Part ram = new Part("32GB Ram", 187.99, 146, 3, 302);
                Part graphicsCard = new Part("4080TI Graphics Card", 2987.99, 143, 3, 304);
                Part psu = new Part("750W PSU", 87.99, 123, 4, 320);

                partRepository.save(processor);
                partRepository.save(motherboard);
                partRepository.save(ram);
                partRepository.save(graphicsCard);
                partRepository.save(psu);

                Product awesomeBuild = new Product("Awesome Build", 9000.99, 14);
                Product amazingBuild = new Product("Amazing Build", 8543.99, 12);
                Product greatBuild = new Product("Great Build", 7897.99, 10);
                Product goodBuild = new Product("Good Build", 6879.99, 11);
                Product okBuild = new Product("OK Build", 4356.99, 18);

                productRepository.save(awesomeBuild);
                productRepository.save(amazingBuild);
                productRepository.save(greatBuild);
                productRepository.save(goodBuild);
                productRepository.save(okBuild);
            }

        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            System.out.println(part.getName()+" "+part.getCompanyName());
        }


        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
