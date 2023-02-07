package ssf.day12.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ssf.day12.model.Item;
import ssf.day12.repo.ItemRepo;

@Service
public class ItemService {

    @Autowired
    ItemRepo itemRepo;

    public List<Item> retrieveItemList() {

        return itemRepo.getCartItems();
        
    }

    
}
