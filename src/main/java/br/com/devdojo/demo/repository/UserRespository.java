package br.com.devdojo.demo.repository;

import br.com.devdojo.demo.model.User;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRespository extends PagingAndSortingRepository<User, Long> {
    User findByUsername(String username);
}
