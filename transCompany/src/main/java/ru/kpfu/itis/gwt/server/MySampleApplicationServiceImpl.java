package ru.kpfu.itis.gwt.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.controllers.GWTController;
import ru.kpfu.itis.gwt.client.MySampleApplicationService;

import java.util.ArrayList;
import java.util.List;

@Service("greetingService")
public class MySampleApplicationServiceImpl extends GWTController implements MySampleApplicationService {
    // Implementation of sample interface method


    @Override
    public String greet(String name) {
        return "Hi"+name+"!";
    }

    @Override
    public List<String[]> getRequest(String text) {
        ArrayList<String[]> list = new ArrayList<String[]>();
        list.add(new String[]{"dasda "," asdasd"});
        list.add(new String[]{"dasda "," asdasd"});
        list.add(new String[]{"dasda "," asdasd"});


        return  list;
    }
}