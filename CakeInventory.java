package com.example.CakeShopInventory.CakeController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CakeInventory {
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	   public String index() 
     {
	      return "index";
	   }

}
