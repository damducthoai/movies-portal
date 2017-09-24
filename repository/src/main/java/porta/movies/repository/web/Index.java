package porta.movies.repository;

import com.butchjgo.entity.Message;
import com.butchjgo.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.xml.ws.soap.Addressing;
import java.util.List;

@Controller
public class Index {
    @Autowired
    private MessageRepository messageRepository;

    @GetMapping(value = "/add")
    String doGet() {
        Message message = new Message();
        message.setMsg("hello");

        messageRepository.save(message);

        return "index";
    }

    @GetMapping(value = "/msg")
    @ResponseBody
    List<Message> doGetMsg(){
        return messageRepository.findAll();
    }
}
