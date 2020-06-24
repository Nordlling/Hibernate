package models;

import javax.persistence.*;
import java.util.ArrayList;
import  java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="company")

public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "company_id")
    private int companyId;
    @Column(name = "company_name")
    private String companyName;
    @Column(name = "company_year")
    private int companyYear;
    @Column(name = "company_country")
    private String companyCountry;

    @OneToMany(mappedBy="company", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private List<Game> games;

    public Company() {
    }

    public Company(String companyName, int companyYear, String companyCountry)
    {
        this.companyName = companyName;
        this.companyYear = companyYear;
        this.companyCountry = companyCountry;
        games = new ArrayList<>();
    }

    public void addGame(Game game) {
        game.setCompany(this);
        games.add(game);
    }

    public void removeGame(Game game) {
        games.remove(game);
    }

    public int getCompanyId() { return companyId; }

    public void setCompanyId(int companyId) { this.companyId = companyId; }

    public String getCompanyName() { return companyName; }

    public void setCompanyName(String companyName) { this.companyName = companyName; }

    public int getCompanyYear() { return companyYear; }

    public void setCompanyYear(int companyYear) { this.companyYear = companyYear; }

    public String getCompanyCountry() { return companyCountry; }

    public void setCompanyCountry(String companyCountry) { this.companyCountry = companyCountry; }

    public List<Game> getGames() {
        return games;
    }

    public void setGames(List<Game> games) {
        this.games = games;
    }

    @Override
    public String toString() {
        return companyId + "|" + companyName+ "|" + companyYear + "|" + companyCountry ;
    }
}