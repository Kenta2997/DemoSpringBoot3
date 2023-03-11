package jp.tokyo.ota.kenhagi.springDemo.Repository;

import jp.tokyo.ota.kenhagi.springDemo.Domain.Company;
import jp.tokyo.ota.kenhagi.springDemo.Domain.CompanySelector;
import jp.tokyo.ota.kenhagi.springDemo.Domain.User;
import jp.tokyo.ota.kenhagi.springDemo.Domain.UserSelector;

import java.util.List;

public interface ClientDbRepository {
    List<Company> find(CompanySelector companySelector);

    List<User> find(UserSelector userSelector);
}
