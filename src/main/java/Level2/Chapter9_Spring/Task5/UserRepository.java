package Level2.Chapter9_Spring.Task5;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> { // JpaRepository<User, Integer> — уже содержит методы findAll(), findById(), save(), deleteById() и др.
}
