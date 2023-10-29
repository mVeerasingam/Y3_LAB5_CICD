package ie.atu.y3_lab5_cicd;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@FeignClient(name = "jsonplaceholder", url = "https://jsonplaceholder.typicode.com")
public interface TodoClient {
    @GetMapping("/todos")
    TodoResponse fetchData();
    @GetMapping("/todos")
    ArrayList<TodoResponse> fetchDataList();
}
