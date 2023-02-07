package sg.edu.nus.iss.day12_workshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;
import sg.edu.nus.iss.day12_workshop.model.Item;
import sg.edu.nus.iss.day12_workshop.service.ItemService;
import org.springframework.ui.Model;

@Controller
@RequestMapping(path = {"/shoppingCart"})
public class ItemController {
    
    @Autowired
    ItemService itmSvc;

    @GetMapping(produces = "text/html")
    public String displayCart(Model model) {
        List<Item> items = itmSvc.retriveItemList();
        model.addAttribute("cartItems", items);
        return "cartList";
    }


}
