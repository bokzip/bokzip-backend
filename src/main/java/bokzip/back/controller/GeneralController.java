package bokzip.back.controller;

import bokzip.back.domain.General;
import bokzip.back.service.GeneralService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/post")
@RestController
public class GeneralController {
    private final GeneralService generalService;

    public GeneralController(GeneralService generalService){
        this.generalService = generalService;
    }

    //@param : 일반 전체 데이터 조회
    @GetMapping("/general")
    public List<General> generals(){
        return generalService.findAll();
    }

    //@param : pk로 일반 데이터 조회
    @GetMapping("/general/{id}")
    public Optional<General> findById(@PathVariable Long id) {
        return generalService.findById(id);
    }

}