package com.fernandes.courseSpring.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.fernandes.courseSpring.entities.Category;
import com.fernandes.courseSpring.entities.Order;
import com.fernandes.courseSpring.entities.Product;
import com.fernandes.courseSpring.entities.User;
import com.fernandes.courseSpring.entities.enums.OrderStatus;
import com.fernandes.courseSpring.repositories.CategoryRepository;
import com.fernandes.courseSpring.repositories.OrderRepository;
import com.fernandes.courseSpring.repositories.ProductRepository;
import com.fernandes.courseSpring.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired // com esse data notation ele resolve a dependencia e associnar uma instancia de UserRepository aqui dentro;
	private UserRepository userRepository;
	
	@Autowired
	OrderRepository orderRepository;
	
	@Autowired
	CategoryRepository categoryRepository;
	
	@Autowired
	ProductRepository productRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Product p1 = new Product(null, "Smart Phone", "Celular dos bons", 3600.00, "");
		Product p2 = new Product(null, "The Lord of the Rings", "Livro muito booom", 60.00, "");
		Product p3 = new Product(null, "Smart TV", "TV com game e streans 42-polegadas", 2800.00, "");
		Product p4 = new Product(null, "PC Gamer", "Melhor computador do mercado", 4820.50, "");
		Product p5 = new Product(null, "Como ser um bom programador", "Livro de aprendizagem", 55.90, "");
		
		Category c1 = new Category(null, "Tecnology");
		Category c2 = new Category(null, "Eletronic");
		Category c3 = new Category(null, "Book");
		
		User u1 = new User("Pedro Silva", "Silva@gmail.com", "11259554521", "159874");
		User u2 = new User("Amanda", "amandinha@gmail.com", "1128885521", "1500074");
		
		Order o1 = new Order(null, Instant.parse("2023-05-12T03:00:05Z"), OrderStatus.PAID, u1);
		Order o2 = new Order(null, Instant.parse("2023-06-12T01:40:05Z"), OrderStatus.WAITING_PAYMENT, u2);
		Order o3 = new Order(null, Instant.parse("2023-10-12T05:20:05Z"), OrderStatus.WAITING_PAYMENT, u1);
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1 ,o2, o3));
		categoryRepository.saveAll(Arrays.asList(c1, c2, c3));
		productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5));
		
	}

}
