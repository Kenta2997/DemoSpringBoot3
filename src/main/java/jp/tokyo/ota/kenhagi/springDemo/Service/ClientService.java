package jp.tokyo.ota.kenhagi.springDemo.Service;

import jp.tokyo.ota.kenhagi.springDemo.Domain.Company;
import jp.tokyo.ota.kenhagi.springDemo.Domain.CompanySelector;
import jp.tokyo.ota.kenhagi.springDemo.Domain.User;
import jp.tokyo.ota.kenhagi.springDemo.Domain.UserSelector;

import java.util.List;

public interface ClientService {

    List<Company> find(CompanySelector companySelector);
    List<Company> findAllCompany();

    List<User> find(UserSelector userSelector);
}
