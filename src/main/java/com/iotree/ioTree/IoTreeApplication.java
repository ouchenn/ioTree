package com.iotree.ioTree;

import com.iotree.ioTree.domain.AppUser;
import com.iotree.ioTree.domain.AuthRequest;
import com.iotree.ioTree.repository.AppUserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class IoTreeApplication {

	public static void main(String[] args) {
		SpringApplication.run(IoTreeApplication.class, args);
	}

	@Bean
	BCryptPasswordEncoder bCryptPasswordEncoder(){
		return new BCryptPasswordEncoder();
	}
}