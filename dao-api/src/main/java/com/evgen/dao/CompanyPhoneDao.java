package com.evgen.dao;

import com.evgen.Company;
import com.evgen.Phone;
import org.springframework.dao.DataAccessException;

import java.util.List;

public interface CompanyPhoneDao {

    List<? extends Company> getCompanies(Integer minEmployees, Integer maxEmployees) throws DataAccessException;

    Company getCompanyById(Integer companyId) throws DataAccessException;

    Company getCompanyByName(String companyName) throws DataAccessException;

    Integer addCompany(Company company) throws DataAccessException;

    Integer updateCompany(Company company) throws DataAccessException;

    Integer deleteCompany(Integer companyId) throws DataAccessException;

    List<? extends Phone> getPhones(Integer minPrice, Integer maxPrice) throws DataAccessException;

    Phone getPhoneById(Integer phoneId) throws DataAccessException;

    Integer addPhone(Phone phone) throws DataAccessException;

    Integer updatePhone(Phone phone) throws DataAccessException;

    Integer deletePhone(Integer phoneId) throws DataAccessException;

}