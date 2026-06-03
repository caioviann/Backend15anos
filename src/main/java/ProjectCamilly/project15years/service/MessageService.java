package ProjectCamilly.project15years.service;

import ProjectCamilly.project15years.model.Message;
import ProjectCamilly.project15years.repository.MessageRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MessageService {
    private final MessageRepository repository;


    public MessageService(MessageRepository repository) {
        this.repository = repository;
    }

    public List<Message> messageList(){
        return repository.findAll();
    }

    public Message messageSave(Message message){
        repository.save(message);
        return message;
    }
}
