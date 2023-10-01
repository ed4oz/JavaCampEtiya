package kodlama.io.Kodlama.io.Devs.webApi.controller;

import jakarta.validation.Valid;
import kodlama.io.Kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.Kodlama.io.Devs.business.requests.CreateLanguageRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.UpdateLanguageRequest;
import kodlama.io.Kodlama.io.Devs.business.responses.GetAllLanguageResponse;
import kodlama.io.Kodlama.io.Devs.business.responses.GetByIdLanguageResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/languages")
@AllArgsConstructor
public class LanguageController {

    private LanguageService languageService;


    @GetMapping("/getall")
    public List<GetAllLanguageResponse> getAll() {
        return languageService.getAll();
    }

    @PostMapping("/add")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void add(@RequestBody() @Valid() CreateLanguageRequest createLanguageRequest) {
        this.languageService.add(createLanguageRequest);
    }

    @GetMapping("/{id}")
    public GetByIdLanguageResponse getById(@PathVariable int id) {
        return languageService.getById(id);
    }

    @PutMapping
    public void update(@RequestBody UpdateLanguageRequest updateLanguageRequest) {
        this.languageService.update(updateLanguageRequest);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        this.languageService.delete(id);
    }
}
