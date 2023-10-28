package ie.atu.y3_lab5_cicd;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class FeignService {

    private final TodoClient todoClient;

    public FeignService(TodoClient todoClient) {
        this.todoClient = todoClient;
    }

    public TodoResponse fetchData(){
        TodoResponse td = todoClient.fetchData();
        System.out.println(td);
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        return td;
    }
    public ArrayList<TodoResponse> fetchDataList(){
        ArrayList<TodoResponse> td = todoClient.fetchDataList();
        System.out.println(td);
        return td;
    }
}
