package kodlama.io.Kodlama.io.Devs.webApi.controller;

import jakarta.validation.Valid;
import kodlama.io.Kodlama.io.Devs.business.abstracts.TechnologyService;
import kodlama.io.Kodlama.io.Devs.business.requests.CreateTechnologyRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.UpdateTechnologyRequest;
import kodlama.io.Kodlama.io.Devs.business.responses.GetAllTechnologyResponse;
import kodlama.io.Kodlama.io.Devs.business.responses.GetByIdTechnologyResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/technologies")
@AllArgsConstructor
public class TechnologyController {
    private TechnologyService technologyService;


    @GetMapping("/getall")
    public List<GetAllTechnologyResponse> getAll() {
        return technologyService.getAll();
    }

    @PostMapping("/add")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void add(@RequestBody() @Valid() CreateTechnologyRequest createTechnologyRequest) {
        this.technologyService.add(createTechnologyRequest);
    }

    @GetMapping("/{id}")
    public GetByIdTechnologyResponse getById(@PathVariable int id) {
        return technologyService.getById(id);
    }

    @PutMapping
    public void update(@RequestBody UpdateTechnologyRequest updateLanguageRequest) {
        this.technologyService.update(updateLanguageRequest);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        this.technologyService.delete(id);
    }
}
