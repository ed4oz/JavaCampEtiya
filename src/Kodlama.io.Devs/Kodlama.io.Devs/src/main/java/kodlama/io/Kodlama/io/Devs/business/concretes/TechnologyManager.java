package kodlama.io.Kodlama.io.Devs.business.concretes;

import kodlama.io.Kodlama.io.Devs.business.abstracts.TechnologyService;
import kodlama.io.Kodlama.io.Devs.business.requests.CreateTechnologyRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.UpdateTechnologyRequest;
import kodlama.io.Kodlama.io.Devs.business.responses.GetAllTechnologyResponse;
import kodlama.io.Kodlama.io.Devs.business.responses.GetByIdTechnologyResponse;
import kodlama.io.Kodlama.io.Devs.core.utilities.mappers.ModelMapperService;
import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.TechnologyRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Technology;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class TechnologyManager implements TechnologyService {

    private TechnologyRepository technologyRepository;
    private ModelMapperService modelMapperService;

    @Override
    public List<GetAllTechnologyResponse> getAll() {
        List<Technology> technologies = technologyRepository.findAll();

        List<GetAllTechnologyResponse> technologyResponse = technologies.stream()
                .map(technology -> this.modelMapperService.forResponse()
                        .map(technology, GetAllTechnologyResponse.class))
                .collect(Collectors.toList());
        return technologyResponse;
    }


    @Override
    public GetByIdTechnologyResponse getById(int id) {
        Technology technology = this.technologyRepository.findById(id).orElseThrow();
        GetByIdTechnologyResponse response = this.modelMapperService.forResponse().map(technology, GetByIdTechnologyResponse.class);
        return response;

    }


    @Override
    public void add(CreateTechnologyRequest createTechnologyRequest) {
        Technology technology = this.modelMapperService.forRequest()
                .map(createTechnologyRequest, Technology.class);
        this.technologyRepository.save(technology);
    }

    @Override
    public void update(UpdateTechnologyRequest updateTechnologyRequest) {
        Technology technology = this.modelMapperService.forRequest().map(updateTechnologyRequest, Technology.class);
        this.technologyRepository.save(technology);
    }

    @Override
    public void delete(int id) {
        this.technologyRepository.deleteById(id);
    }
}
