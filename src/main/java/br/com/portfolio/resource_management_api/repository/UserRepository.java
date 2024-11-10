package br.com.portfolio.resource_management_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.portfolio.resource_management_api.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
