package jp.tokyo.ota.kenhagi.springDemo.Repository;

import jp.tokyo.ota.kenhagi.springDemo.Domain.Company;
import jp.tokyo.ota.kenhagi.springDemo.Domain.CompanySelector;
import jp.tokyo.ota.kenhagi.springDemo.Domain.User;
import jp.tokyo.ota.kenhagi.springDemo.Domain.UserSelector;
import jp.tokyo.ota.kenhagi.springDemo.Repository.mybatis.ClientMapper;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.UserDatabase;
import org.apache.catalina.mapper.Mapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ClientDbRepositoryImpl implements ClientDbRepository {

    private final SqlSession sqlSession;

    @Override
    public List<Company> find(CompanySelector companySelector) {
        return this.sqlSession.getMapper(ClientMapper.class).findCompany(companySelector);
    }

    @Override
    public List<User> find(UserSelector userSelector) {
        return this.sqlSession.getMapper(ClientMapper.class).findUser(userSelector);
    }
}
