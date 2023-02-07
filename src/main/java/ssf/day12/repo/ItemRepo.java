package ssf.day12.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import ssf.day12.model.Item;


@Repository
public class ItemRepo {

    private List<Item> itemList;

    public List<Item> getCartItems(){

        itemList = new ArrayList<>();

        Item item = new Item();
        item.setItemName("LV");
        item.setQuantity(5);
        itemList.add(item);

        item = new Item();
        item.setItemName("Chanel");
        item.setQuantity(15);
        itemList.add(item);

        item = new Item();
        item.setItemName("Prada");
        item.setQuantity(10);
        itemList.add(item);

        return itemList;

    }
    
}
