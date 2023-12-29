package com.devsuperior.desafio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.desafio.entities.Order;

@Service
public class OrderService {
	
	@Autowired
	private ShippingService shippingService;
	

	public double total(Order order) {
		double descount = order.getDiscount() / 100 * order.getBasic();
		return order.getBasic() - descount + shippingService.shipment(order);
	}
	

}
