package kodlama.io.Kodlama.io.Devs.business.abstracts;

import kodlama.io.Kodlama.io.Devs.business.requests.CreateLanguageRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.UpdateLanguageRequest;
import kodlama.io.Kodlama.io.Devs.business.responses.GetAllLanguageResponse;
import kodlama.io.Kodlama.io.Devs.business.responses.GetByIdLanguageResponse;

import java.util.List;

public interface LanguageService {
    List<GetAllLanguageResponse> getAll();

    GetByIdLanguageResponse getById(int id);

    void add(CreateLanguageRequest createLanguageRequest);

    void update(UpdateLanguageRequest updateLanguageRequest);

    void delete(int id);


}
