package annotation.validation.com.example.demo.annotation.validation.repository;

import annotation.validation.com.example.demo.annotation.validation.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<BookEntity, Long> {
}
