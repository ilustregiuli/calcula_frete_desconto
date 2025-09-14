package com.orderShipment.calculaFrete.services;

import com.orderShipment.calculaFrete.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    public double total(Order order) {
        double valorDesconto = order.getBasic() * (order.getDiscount() / 100);
        return (order.getBasic() - valorDesconto) + this.shippingService.shippment(order);
    }

}
