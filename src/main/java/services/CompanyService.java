package services;

import dao.CompanyDAO;
import models.Company;
import models.Game;

import java.util.List;

public class CompanyService {

    private CompanyDAO companiesDao = new CompanyDAO();

    public CompanyService() { }

    public Company findCompany(int id) { return companiesDao.findById(id); }

    public void saveCompany(Company company) { companiesDao.save(company); }

    public void saveGame(Game game) { companiesDao.saveGame(game); }

    public void deleteCompany(Company company) { companiesDao.delete(company); }

    public void deleteGame(Game game) { companiesDao.deleteGame(game); }

    public void updateCompany(Company company) { companiesDao.update(company); }

    public void updateGame(Game game) { companiesDao.updateGame(game); }

    public List<Company> findAllCompanies() { return companiesDao.findAllCompanies(); }

    public List<Game> findAllGames() { return companiesDao.findAllGames(); }

    public Game findGameById(int id) { return companiesDao.findGameById(id); }


}