package kodlama.io.Kodlama.io.Devs.business.abstracts;

import kodlama.io.Kodlama.io.Devs.business.requests.CreateTechnologyRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.UpdateTechnologyRequest;
import kodlama.io.Kodlama.io.Devs.business.responses.GetAllTechnologyResponse;
import kodlama.io.Kodlama.io.Devs.business.responses.GetByIdTechnologyResponse;

import java.util.List;

public interface TechnologyService {
    List<GetAllTechnologyResponse> getAll();

    GetByIdTechnologyResponse getById(int id);

    void add(CreateTechnologyRequest createTechnologyRequest);

    void update(UpdateTechnologyRequest updateTechnologyRequest);

    void delete(int id);
}
