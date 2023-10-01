package kodlama.io.Kodlama.io.Devs.business.concretes;


import kodlama.io.Kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.Kodlama.io.Devs.business.requests.CreateLanguageRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.UpdateLanguageRequest;
import kodlama.io.Kodlama.io.Devs.business.responses.GetAllLanguageResponse;
import kodlama.io.Kodlama.io.Devs.business.responses.GetByIdLanguageResponse;
import kodlama.io.Kodlama.io.Devs.business.responses.GetByIdTechnologyResponse;
import kodlama.io.Kodlama.io.Devs.core.utilities.mappers.ModelMapperService;
import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

import kodlama.io.Kodlama.io.Devs.entities.concretes.Technology;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class LanguageManager implements LanguageService {
    private LanguageRepository languageRepository;
    private ModelMapperService modelMapperService;

    @Override
    public List<GetAllLanguageResponse> getAll() {
        List<Language> languages = languageRepository.findAll();

        List<GetAllLanguageResponse> languageResponse = languages.stream()
                .map(language -> this.modelMapperService.forResponse()
                        .map(language, GetAllLanguageResponse.class))
                .collect(Collectors.toList());
        return languageResponse;
    }

    @Override
    public GetByIdLanguageResponse getById(int id) {
        Language language = this.languageRepository.findById(id).orElseThrow();
        GetByIdLanguageResponse response = this.modelMapperService.forResponse().map(language, GetByIdLanguageResponse.class);
        return response;
    }

    @Override
    public void add(CreateLanguageRequest createLanguageRequest) {
        Language language = this.modelMapperService.forRequest()
                .map(createLanguageRequest, Language.class);
        this.languageRepository.save(language);
    }

    @Override
    public void update(UpdateLanguageRequest updateLanguageRequest) {
        Language language = this.modelMapperService.forRequest()
                .map(updateLanguageRequest, Language.class);
        this.languageRepository.save(language);
    }

    @Override
    public void delete(int id) {
        this.languageRepository.deleteById(id);
    }
}
