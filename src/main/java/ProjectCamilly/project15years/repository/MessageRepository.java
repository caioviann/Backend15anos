package ProjectCamilly.project15years.repository;

import ProjectCamilly.project15years.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {
}
