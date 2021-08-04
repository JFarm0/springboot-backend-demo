package net.javaguides.springboot;

import net.javaguides.springboot.model.User;
import net.javaguides.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		this.userRepository.save(new User("Michael", "Angelo", "michael@ggmail.com"));
		this.userRepository.save(new User("Tom", "Sawyer", "tom@ggmail.com"));
		this.userRepository.save(new User("Tony", "Soprano", "tony@ggmail.com"));

	}
}
