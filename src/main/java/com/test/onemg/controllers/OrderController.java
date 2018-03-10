package com.test.onemg.controllers;

import com.test.onemg.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("/order")
    String getDetailsOfProductById(@RequestParam String orderId) {
        return orderService.getOrderById(orderId);
    }
}
