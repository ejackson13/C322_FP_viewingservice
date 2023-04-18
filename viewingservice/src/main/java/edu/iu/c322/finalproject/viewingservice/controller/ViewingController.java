package edu.iu.c322.finalproject.viewingservice.controller;

import edu.iu.c322.finalproject.viewingservice.model.SellerItem;
import edu.iu.c322.finalproject.viewingservice.repository.SellerItemRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class ViewingController {

    private SellerItemRepository repository;

    public ViewingController(SellerItemRepository repository) {
        this.repository = repository;
    }


    // return all available items (inventory 0 excluded)
    @GetMapping
    public List<SellerItem> getAllAvailableItems() {
        List<SellerItem> allItems = repository.findAll();
        List<SellerItem> availableItems = new ArrayList<>();

        for(SellerItem i:allItems) {
            if(i.getInventory() > 0) {
                availableItems.add(i);
            }
        }

        return availableItems;
    }

    // return all available items containing the given name
    @GetMapping("/{name}")
    public List<SellerItem> getAllAvailableItemsByName(@PathVariable String name) {
        List<SellerItem> allItems = repository.findAll();
        List<SellerItem> availableItems = new ArrayList<>();

        for(SellerItem i:allItems) {
            if(i.getInventory() > 0 && i.getName().contains(name)) {
                availableItems.add(i);
            }
        }

        return availableItems;
    }


    // return item with given id
    @GetMapping("/{itemId}")
    public SellerItem getItemById(@PathVariable int itemId) {
        Optional<SellerItem> opt = repository.findById(itemId);

        if(opt.isEmpty()) {
            throw new IllegalStateException("The item you are looking for does not exist. Please try a different item.");
        }

        return opt.get();
    }
}
