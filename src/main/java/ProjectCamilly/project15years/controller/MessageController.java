package ProjectCamilly.project15years.controller;

import ProjectCamilly.project15years.model.Message;
import ProjectCamilly.project15years.service.MessageService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/message")
public class MessageController {

    private final MessageService messageService;


    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping
    public List<Message> list(){
        return messageService.messageList();
    }

    @PostMapping
    public String addMessage(@RequestBody Message message){
        messageService.messageSave(message);
        return "recado enviado com sucesso";
    }
}
