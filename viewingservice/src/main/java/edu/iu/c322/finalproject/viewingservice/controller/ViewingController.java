package edu.iu.c322.finalproject.viewingservice.controller;

import edu.iu.c322.finalproject.viewingservice.model.ItemIterator;
import edu.iu.c322.finalproject.viewingservice.model.SellerItem;
import edu.iu.c322.finalproject.viewingservice.repository.SellerItemRepository;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping
public class ViewingController {

    private SellerItemRepository repository;

    public ViewingController(SellerItemRepository repository) {
        this.repository = repository;
    }


    // return all available items
    @CrossOrigin()
    @GetMapping()
    public List<SellerItem> getAllAvailable() {
        List<SellerItem> allItems = repository.findAll();
        ItemIterator iter = new ItemIterator(allItems);
        List<SellerItem> availableItems = new ArrayList<>();

        while(iter.hasNext()) {
            SellerItem i = (SellerItem)iter.next();
            if(i.getInventory() > 0) {
                //i.setPrice(Math.round(i.getPrice() * 100.0)/100.0); // round to two decimal places
                availableItems.add(i);
            }
        }

        return availableItems;
    }



    // return all available items containing the given name
    @CrossOrigin()
    @GetMapping("/{name}")
    public List<SellerItem> getAllAvailableByName(@PathVariable String name) {
        List<SellerItem> allItems = repository.findAll();
        List<SellerItem> availableItems = new ArrayList<>();
        System.out.println(name);
        for(SellerItem i:allItems) {
            if(i.getInventory() > 0 && (i.getName().toLowerCase().contains(name.toLowerCase()) || name.equals("NONE"))) {
                //i.setPrice(Math.round(i.getPrice() * 100.0)/100.0); // round to two decimal places
                availableItems.add(i);
            }
        }

        return availableItems;
    }


    // return item with given id
    @CrossOrigin()
    @GetMapping("/item/{itemId}")
    public SellerItem getItemById(@PathVariable int itemId) {
        Optional<SellerItem> opt = repository.findById(itemId);

        if(opt.isEmpty()) {
            throw new IllegalStateException("The item you are looking for does not exist. Please try a different item.");
        }

        SellerItem item = opt.get();
        //item.setPrice(Math.round(item.getPrice() * 100.0)/100.0); // round to two decimal places
        return item;
    }

}
