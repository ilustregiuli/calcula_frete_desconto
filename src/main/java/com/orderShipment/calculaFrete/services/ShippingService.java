package com.orderShipment.calculaFrete.services;

import com.orderShipment.calculaFrete.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    private Order order;

    public double shippment(Order order){

        if((order.getBasic() < 100.0)) {
            return 20.00;
        }

        if((order.getBasic() > 100.0) && (order.getBasic() < 200.0)) {
            return 12.00;
        }

        return 0.00; // default = zero para valores fora do range (maior que 200)
    }

}
