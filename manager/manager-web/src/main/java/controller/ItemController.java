package controller;

import Service.imp.ItemServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pojo.TbItem;
import service.ItemService;

@Controller
public class ItemController {
    @Autowired
    private ItemServiceImp itemService;
    @RequestMapping("/Item/{id}")
    public TbItem findItemById(@PathVariable long id){
        System.out.println("hahha");
            TbItem tbItem=itemService.getItemById(id);
        System.out.println(tbItem);
            return  tbItem;
    }
}
