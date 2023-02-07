package ssf.day12.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import ssf.day12.model.Item;
import ssf.day12.service.ItemService;

@Controller
@RequestMapping(path = "/shoppingcart")
public class ItemController {

        @Autowired
        ItemService itemService;

        @GetMapping
        public String displayCart(Model model) {
            List<Item> items = itemService.retrieveItemList();
            model.addAttribute("cartItems", items);
            return "cartList";
            
        }

        @GetMapping (path = "{itemname}")
        public String filteredCart(@PathVariable(name="itemname") String itemname, Model model) {

            List<Item> items = itemService.retrieveItemList();
            List<Item> foundItems = items.stream().filter(i -> i.getItemName().equalsIgnoreCase(itemname)).collect(Collectors.toList());
            model.addAttribute("cartItems", foundItems);

            return "cartList";
            
        }
    
}
