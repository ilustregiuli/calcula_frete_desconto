package com.orderShipment.calculaFrete;

import com.orderShipment.calculaFrete.entities.Order;
import com.orderShipment.calculaFrete.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class CalculaFreteApplication implements CommandLineRunner{

	@Autowired
	OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(CalculaFreteApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Código pedido: ");
		int codigoPedido = sc.nextInt();
		System.out.print("Valor pedido: ");
		double valorPedido = sc.nextDouble ();
		System.out.print("Valor desconto: ");
		double valorDesconto = sc.nextDouble ();

		Order order = new Order(codigoPedido, valorPedido, valorDesconto);

		System.out.printf("Pedido código: %d %n", order.getCode());
		System.out.printf("Valor total: %.2f", orderService.total(order));

		sc.close();


	}
}
