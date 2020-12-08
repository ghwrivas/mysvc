package msvcdojo.mysvc;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
interface AccountRepository extends JpaRepository<Account, Long> {
    List<Account> findByUsername(@Param("username") String username);
}