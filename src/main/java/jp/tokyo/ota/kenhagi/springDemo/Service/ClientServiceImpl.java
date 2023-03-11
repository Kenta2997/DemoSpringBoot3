package jp.tokyo.ota.kenhagi.springDemo.Service;

import jp.tokyo.ota.kenhagi.springDemo.Domain.Company;
import jp.tokyo.ota.kenhagi.springDemo.Domain.CompanySelector;
import jp.tokyo.ota.kenhagi.springDemo.Domain.User;
import jp.tokyo.ota.kenhagi.springDemo.Domain.UserSelector;
import jp.tokyo.ota.kenhagi.springDemo.Repository.ClientDbRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ClientServiceImpl implements ClientService{
    private final ClientDbRepository clientDbRepository;


    @Override
    public List<Company> find(CompanySelector companySelector) {
        return clientDbRepository.find(companySelector);
    }

    @Override
    public List<Company> findAllCompany() {
        return clientDbRepository.find(new CompanySelector());
    }

    @Override
    public List<User> find(UserSelector userSelector) {
        return clientDbRepository.find(userSelector);
    }
}
