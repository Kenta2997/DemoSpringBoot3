package jp.tokyo.ota.kenhagi.springDemo.Repository.mybatis;

import jp.tokyo.ota.kenhagi.springDemo.Domain.Company;
import jp.tokyo.ota.kenhagi.springDemo.Domain.CompanySelector;
import jp.tokyo.ota.kenhagi.springDemo.Domain.User;
import jp.tokyo.ota.kenhagi.springDemo.Domain.UserSelector;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ClientMapper {
    public List<Company> findCompany(CompanySelector selector);
    public List<User> findUser(UserSelector selector);
}
