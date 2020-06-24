import models.*;
import services.*;

import java.sql.ResultSet;
import java.sql.SQLException;
//import org.hibernate.Criteria;
//import org.hibernate.SQLQuery;
//import org.hibernate.Session;
//import  org.hibernate.SessionFactory;

import java.sql.Statement;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

                LanguageService languageService = new LanguageService();
                CompanyService companyService = new CompanyService();
                EngineService engineService = new EngineService();
                PlatformService platformService = new PlatformService();
                GameService gameService = new GameService();
                GenreService genreService = new GenreService();
                SettingService settingService = new SettingService();

                Scanner sc = new Scanner(System.in);
                System.out.println("1. Show tables\n" +
                        "2. Delete record\n" +
                        "3. Add record\n" +
                        "4. Edit record");


                int number = sc.nextInt();
                int counter = 1;
                while(true){
                    switch (number) {
                        case 1:
                            System.out.println("1.game\n" +
                                    "2.engine\n" +
                                    "3.company\n" +
                                    "4.platform\n" +
                                    "5.setting\n" +
                                    "6.genre\n" +
                                    "7.language\n" +
                                    "8.game_genre_setting\n" +
                                    "9.game_platform\n" +
                                    "Enter '0' to exit.");
                            Scanner sc2 = new Scanner(System.in);
                            String table = sc2.next();
                            if (table.equals("0")){ main(args); }
                            if (table.equals("game")) {
                                System.out.println("________________________________");
                                System.out.println(companyService.findAllGames());
                                System.out.println("________________________________");
                                main(args);
                            }
                            if (table.equals("engine")) {
                                System.out.println("________________________________");
                                //System.out.println(languageService.findAllEngines());
                                System.out.println(engineService.findAllEngines());
                                System.out.println("________________________________");
                                main(args);
                            }
                            if (table.equals("company")) {
                                System.out.println("________________________________");
                                System.out.println(companyService.findAllCompanies());
                                System.out.println("________________________________");
                                main(args);
                            }
                            if (table.equals("platform")) {
                                System.out.println("________________________________");
                                System.out.println(platformService.findAllPlatforms());
                                System.out.println("________________________________");
                                main(args);
                            }
                            if (table.equals("language")) {
                                System.out.println("________________________________");
                                System.out.println(languageService.findAllLanguages());
                                System.out.println("________________________________");
                                main(args);
                            }
                            if (table.equals("genre")) {
                                System.out.println("________________________________");
                                System.out.println(genreService.findAllGenres());
                                System.out.println("________________________________");
                                main(args);
                            }
                            if (table.equals("setting")) {
                                System.out.println("________________________________");
                                System.out.println(settingService.findAllSettings());
                                System.out.println("________________________________");
                                main(args);
                            }
                            if (table.equals("game_platform")) {
                                System.out.println("________________________________");
                                System.out.println(platformService.findAllGamePlatforms());
                                System.out.println("________________________________");
                                main(args);
                            }
                            if (table.equals("game_genre_setting")) {
                                System.out.println("________________________________");
                                System.out.println(genreService.findAllGameGenreSettings());
                                System.out.println("________________________________");
                                main(args);
                            }
                            if (table.equals("exit")) {
                                main(args);
                            }

                        case 2:
                            System.out.println("1. game\n" +
                                    "2.engine\n" +
                                    "3.company\n" +
                                    "4.platform\n" +
                                    "5.setting\n" +
                                    "6.genre\n" +
                                    "7.language\n" +
                                    "8.game_genre_setting\n" +
                                    "9.game_platform\n" +
                                    "Enter '0' to exit.");
                            sc2 = new Scanner(System.in);
                            table = sc2.next();
                            if (table.equals("0")){ main(args); }
                            if (table.equals("game")) {
                                Scanner eq1 = new Scanner(System.in);
                                System.out.println("Enter id of game: ");
                                Integer gameId = eq1.nextInt();
                                Game game = companyService.findGameById(gameId);
                                companyService.deleteGame(game);
                                main(args);
                            }
                            if (table.equals("engine")) {
                                Scanner eq1 = new Scanner(System.in);
                                System.out.println("Enter id of engine: ");
                                Integer engineId = eq1.nextInt();
                                Engine engine = languageService.findEngineById(engineId);
                                languageService.deleteEngine(engine);
                                main(args);
                            }
                            if (table.equals("company")) {
                                Scanner eq1 = new Scanner(System.in);
                                System.out.println("Enter id of company: ");
                                Integer companyId = eq1.nextInt();
                                Company company = companyService.findCompany(companyId);
                                companyService.deleteCompany(company);
                                main(args);
                            }
                            if (table.equals("platform")) {
                                Scanner eq1 = new Scanner(System.in);
                                System.out.println("Enter id of platform: ");
                                Integer platformId = eq1.nextInt();
                                Platform platform = platformService.findPlatform(platformId);
                                platformService.deletePlatform(platform);
                                main(args);
                            }
                            if (table.equals("language")) {
                                Scanner eq1 = new Scanner(System.in);
                                System.out.println("Enter id of language: ");
                                Integer languageId = eq1.nextInt();
                                Language language = languageService.findLanguage(languageId);
                                languageService.deleteLanguage(language);
                                main(args);
                            }
                            if (table.equals("genre")) {
                                Scanner eq1 = new Scanner(System.in);
                                System.out.println("Enter id of genre: ");
                                Integer genreId = eq1.nextInt();
                                Genre genre = genreService.findGenre(genreId);
                                genreService.deleteGenre(genre);
                                main(args);
                            }
                            if (table.equals("setting")) {
                                Scanner eq1 = new Scanner(System.in);
                                System.out.println("Enter id of setting: ");
                                Integer settingId = eq1.nextInt();
                                Setting setting = settingService.findSetting(settingId);
                                settingService.deleteSetting(setting);
                                main(args);
                            }
                            if (table.equals("game_platform")) {
                                Scanner eq1 = new Scanner(System.in);
                                System.out.println("Enter id of game_platform: ");
                                Integer gamePlatformId = eq1.nextInt();
                                GamePlatform gamePlatform = platformService.findGamePlatformById(gamePlatformId);
                                platformService.deleteGamePlatform(gamePlatform);
                                main(args);
                            }
                            if (table.equals("game_genre_setting")) {
                                Scanner eq1 = new Scanner(System.in);
                                System.out.println("Enter id of game_genre_setting: ");
                                Integer gameGenreSettingId = eq1.nextInt();
                                GameGenreSetting gameGenreSetting = genreService.findGameGenreSettingById(gameGenreSettingId);
                                genreService.deleteGameGenreSetting(gameGenreSetting);
                                main(args);
                            }
                            if (table.equals("exit")) {
                                main(args);
                            }
                            System.err.println("You enter wrong query");
                            System.err.print("____________________ \n \n");
                            main(args);

                        case 3:
                            System.out.println("1. game\n" +
                                    "2.engine\n" +
                                    "3.company\n" +
                                    "4.platform\n" +
                                    "5.setting\n" +
                                    "6.genre\n" +
                                    "7.language\n" +
                                    "8.game_genre_setting\n" +
                                    "9.game_platform\n" +
                                    "Enter '0' to exit.");
                            sc2 = new Scanner(System.in);
                            table = sc2.next();
                            if (table.equals("0")){ main(args); }
                            if (table.equals("game")) {
                                Scanner eq1 = new Scanner(System.in);
                                Scanner eq2 = new Scanner(System.in);
                                Scanner eq3 = new Scanner(System.in);
                                Scanner eq4 = new Scanner(System.in);
                                System.out.println("Enter name of game: ");
                                String gameName = eq1.next();
                                System.out.println("Enter year of game: ");
                                Integer gameYear = eq2.nextInt();
                                System.out.println("Enter id of engine: ");
                                Integer engineId = eq3.nextInt();
                                System.out.println("Enter id of company: ");
                                Integer companyId = eq4.nextInt();

                                Game game = new Game(gameName, gameYear);

                                Engine engine = engineService.findEngine(engineId);
                                engine.addGame(game);
                                engineService.updateEngine(engine);

                                Company company = companyService.findCompany(companyId);
                                company.addGame(game);
                                companyService.updateCompany(company);

                                main(args);
                            }
                            if (table.equals("engine")) {
                                Scanner eq1 = new Scanner(System.in);
                                Scanner eq2 = new Scanner(System.in);
                                Scanner eq3 = new Scanner(System.in);
                                System.out.println("Enter name of engine: ");
                                String engineName = eq1.next();
                                System.out.println("Enter year of engine: ");
                                Integer engineYear = eq2.nextInt();
                                System.out.println("Enter id of language: ");
                                Integer languageId = eq3.nextInt();
                                Language language = languageService.findLanguage(languageId);
                                Engine engine = new Engine(engineName, engineYear);
                                //engine.setLanguage(language);
                                language.addEngine(engine);
                                languageService.updateLanguage(language);
                                main(args);
                            }
                            if (table.equals("company")) {
                                Scanner eq1 = new Scanner(System.in);
                                Scanner eq2 = new Scanner(System.in);
                                Scanner eq3 = new Scanner(System.in);
                                System.out.println("Enter name of company: ");
                                String companyName = eq1.next();
                                System.out.println("Enter year of company: ");
                                Integer companyYear = eq2.nextInt();
                                System.out.println("Enter country of company: ");
                                String companyCountry = eq3.next();

                                Company company = new Company(companyName, companyYear, companyCountry);
                                companyService.saveCompany(company);
                                main(args);
                            }
                            if (table.equals("platform")) {
                                Scanner eq1 = new Scanner(System.in);
                                Scanner eq2 = new Scanner(System.in);
                                System.out.println("Enter name of platform: ");
                                String platformName = eq1.next();
                                System.out.println("Enter year of platform: ");
                                Integer platformYear = eq2.nextInt();

                                Platform platform = new Platform(platformName, platformYear);
                                platformService.savePlatform(platform);
                                main(args);
                            }
                            if (table.equals("language")) {
                                Scanner eq1 = new Scanner(System.in);
                                System.out.println("Enter name of language: ");
                                String languageName = eq1.next();
                                Language language = new Language(languageName);
                                languageService.saveLanguage(language);
                                main(args);
                            }
                            if (table.equals("genre")) {
                                Scanner eq1 = new Scanner(System.in);
                                System.out.println("Enter name of genre: ");
                                String genreName = eq1.next();
                                Genre genre = new Genre(genreName);
                                genreService.saveGenre(genre);
                                main(args);
                            }
                            if (table.equals("setting")) {
                                Scanner eq1 = new Scanner(System.in);
                                System.out.println("Enter name of setting: ");
                                String settingName = eq1.next();
                                Setting setting = new Setting(settingName);
                                settingService.saveSetting(setting);
                                main(args);
                            }
                            if (table.equals("game_platform")) {
                                Scanner eq1 = new Scanner(System.in);
                                Scanner eq2 = new Scanner(System.in);
                                System.out.println("Enter id of game: ");
                                Integer gameId = eq1.nextInt();
                                System.out.println("Enter id of platform: ");
                                Integer platformId = eq2.nextInt();

                                GamePlatform gamePlatform = new GamePlatform();

                                Game game = gameService.findGame(gameId);
                                game.addGamePlatform(gamePlatform);
                                gameService.updateGame(game);

                                Platform platform = platformService.findPlatform(platformId);
                                platform.addGamePlatform(gamePlatform);
                                platformService.updatePlatform(platform);

                                main(args);
                            }
                            if (table.equals("game_genre_setting")) {
                                Scanner eq1 = new Scanner(System.in);
                                Scanner eq2 = new Scanner(System.in);
                                Scanner eq3 = new Scanner(System.in);
                                System.out.println("Enter id of game: ");
                                Integer gameId = eq1.nextInt();
                                System.out.println("Enter id of genre: ");
                                Integer genreId = eq2.nextInt();
                                System.out.println("Enter id of setting: ");
                                Integer settingId = eq3.nextInt();

                                GameGenreSetting gameGenreSetting = new GameGenreSetting();

                                Game game = gameService.findGame(gameId);
                                game.addGameGenreSettings(gameGenreSetting);
                                gameService.updateGame(game);

                                Setting setting = settingService.findSetting(settingId);
                                setting.addGameGenreSetting(gameGenreSetting);
                                settingService.updateSetting(setting);

                                Genre genre = genreService.findGenre(genreId);
                                genre.addGameGenreSetting(gameGenreSetting);
                                genreService.updateGenre(genre);

                                main(args);
                            }
                            if (table.equals("exit")) {
                                main(args);
                            }
                            System.err.println("You enter wrong query");
                            System.err.print("____________________ \n \n");
                            main(args);
                        case 4:
                            System.out.println("1. game\n" +
                                    "2.engine\n" +
                                    "3.company\n" +
                                    "4.platform\n" +
                                    "5.setting\n" +
                                    "6.genre\n" +
                                    "7.language\n" +
                                    "8.game_genre_setting\n" +
                                    "9.game_platform\n" +
                                    "Enter '0' to exit.");
                            sc2 = new Scanner(System.in);
                            table = sc2.next();
                            if (table.equals("0")){ main(args); }
                            if (table.equals("game")) {
                                Scanner eq1 = new Scanner(System.in);
                                Scanner eq2 = new Scanner(System.in);
                                Scanner eq3 = new Scanner(System.in);
                                Scanner eq4 = new Scanner(System.in);
                                Scanner eq5 = new Scanner(System.in);
                                System.out.println("Enter id of game: ");
                                Integer gameId = eq1.nextInt();
                                System.out.println("Enter name of game: ");
                                String gameName = eq2.next();
                                System.out.println("Enter year of game: ");
                                Integer gameYear = eq3.nextInt();
                                System.out.println("Enter id of engine: ");
                                Integer engineId = eq4.nextInt();
                                System.out.println("Enter id of company: ");
                                Integer companyId = eq5.nextInt();

                                Engine engine = engineService.findEngine(engineId);
                                Company company = companyService.findCompany(companyId);
                                Game game = companyService.findGameById(gameId);
                                game.setGameName(gameName);
                                game.setGameYear(gameYear);
                                companyService.updateCompany(company);
                                engineService.updateEngine(engine);
                                company.addGame(game);
                                engine.addGame(game);
                                companyService.updateGame(game);
                                engineService.updateGame(game);
                                main(args);
                            }
                            if (table.equals("engine")) {
                                Scanner eq1 = new Scanner(System.in);
                                Scanner eq2 = new Scanner(System.in);
                                Scanner eq3 = new Scanner(System.in);
                                Scanner eq4 = new Scanner(System.in);
                                System.out.println("Enter id of engine: ");
                                Integer engineId = eq1.nextInt();
                                System.out.println("Enter name of engine: ");
                                String engineName = eq2.next();
                                System.out.println("Enter year of engine: ");
                                Integer engineYear = eq3.nextInt();
                                System.out.println("Enter id of language: ");
                                Integer languageId = eq4.nextInt();

                                Language language = languageService.findLanguage(languageId);
                                Engine engine = languageService.findEngineById(engineId);
                                engine.setEngineName(engineName);
                                engine.setEngineYear(engineYear);
                                languageService.updateLanguage(language);
                                //engine.setLanguage(language);
                                language.addEngine(engine);
                                languageService.updateEngine(engine);
                                main(args);
                            }
                            if (table.equals("company")) {
                                Scanner eq1 = new Scanner(System.in);
                                Scanner eq2 = new Scanner(System.in);
                                Scanner eq3 = new Scanner(System.in);
                                Scanner eq4 = new Scanner(System.in);
                                System.out.println("Enter id of company: ");
                                Integer companyId = eq1.nextInt();
                                System.out.println("Enter name of company: ");
                                String companyName = eq2.next();
                                System.out.println("Enter year of company: ");
                                Integer companyYear = eq3.nextInt();
                                System.out.println("Enter country of company: ");
                                String companyCountry = eq4.next();

                                Company company = companyService.findCompany(companyId);
                                company.setCompanyName(companyName);
                                company.setCompanyYear(companyYear);
                                company.setCompanyCountry(companyCountry);
                                companyService.updateCompany(company);
                                main(args);
                            }
                            if (table.equals("platform")) {
                                Scanner eq1 = new Scanner(System.in);
                                Scanner eq2 = new Scanner(System.in);
                                Scanner eq3 = new Scanner(System.in);
                                System.out.println("Enter id of platform: ");
                                Integer platformId = eq1.nextInt();
                                System.out.println("Enter name of platform: ");
                                String platformName = eq2.next();
                                System.out.println("Enter year of platform: ");
                                Integer platformYear = eq3.nextInt();

                                Platform platform = platformService.findPlatform(platformId);
                                platform.setPlatformName(platformName);
                                platform.setPlatformYear(platformYear);
                                platformService.updatePlatform(platform);
                                main(args);
                            }
                            if (table.equals("language")) {
                                Scanner eq1 = new Scanner(System.in);
                                Scanner eq2 = new Scanner(System.in);
                                System.out.println("Enter id of language: ");
                                Integer languageId = eq1.nextInt();
                                System.out.println("Enter name of language: ");
                                String languageName = eq2.next();

                                Language language = languageService.findLanguage(languageId);
                                language.setLanguageName(languageName);
                                languageService.updateLanguage(language);
                                main(args);
                            }
                            if (table.equals("genre")) {
                                Scanner eq1 = new Scanner(System.in);
                                Scanner eq2 = new Scanner(System.in);
                                System.out.println("Enter id of genre: ");
                                Integer genreId = eq1.nextInt();
                                System.out.println("Enter name of genre: ");
                                String genreName = eq2.next();

                                Genre genre = genreService.findGenre(genreId);
                                genre.setGenreName(genreName);
                                genreService.updateGenre(genre);
                                main(args);
                            }
                            if (table.equals("setting")) {
                                Scanner eq1 = new Scanner(System.in);
                                Scanner eq2 = new Scanner(System.in);
                                System.out.println("Enter id of setting: ");
                                Integer settingId = eq1.nextInt();
                                System.out.println("Enter name of setting: ");
                                String settingName = eq2.next();

                                Setting setting = settingService.findSetting(settingId);
                                setting.setSettingName(settingName);
                                settingService.updateSetting(setting);
                                main(args);
                            }
                            if (table.equals("game_platform")) {
                                Scanner eq1 = new Scanner(System.in);
                                Scanner eq2 = new Scanner(System.in);
                                Scanner eq3 = new Scanner(System.in);
                                System.out.println("Enter id of game_platform: ");
                                Integer gamePlatformId = eq1.nextInt();
                                System.out.println("Enter id of game: ");
                                Integer engineId = eq2.nextInt();
                                System.out.println("Enter id of platform: ");
                                Integer platformId = eq3.nextInt();

                                Game game = gameService.findGame(gamePlatformId);
                                Platform platform = platformService.findPlatform(platformId);
                                GamePlatform gamePlatform = platformService.findGamePlatformById(gamePlatformId);
                                gameService.updateGame(game);
                                platformService.updatePlatform(platform);
                                game.addGamePlatform(gamePlatform);
                                platform.addGamePlatform(gamePlatform);
                                gameService.updateGamePlatform(gamePlatform);
                                platformService.updateGamePlatform(gamePlatform);
                                main(args);
                            }
                            if (table.equals("game_genre_setting")) {
                                Scanner eq1 = new Scanner(System.in);
                                Scanner eq2 = new Scanner(System.in);
                                Scanner eq3 = new Scanner(System.in);
                                Scanner eq4 = new Scanner(System.in);
                                System.out.println("Enter id of game_genre_setting: ");
                                Integer gameGenreSettingId = eq1.nextInt();
                                System.out.println("Enter id of game: ");
                                Integer gameId = eq2.nextInt();
                                System.out.println("Enter id of genre: ");
                                Integer genreId = eq3.nextInt();
                                System.out.println("Enter id of setting: ");
                                Integer settingId = eq4.nextInt();

                                Game game = gameService.findGame(gameId);
                                Genre genre = genreService.findGenre(genreId);
                                Setting setting = settingService.findSetting(settingId);
                                GameGenreSetting gameGenreSetting = genreService.findGameGenreSettingById(gameGenreSettingId);

                                gameService.updateGame(game);
                                genreService.updateGenre(genre);
                                settingService.updateSetting(setting);
                                game.addGameGenreSettings(gameGenreSetting);
                                genre.addGameGenreSetting(gameGenreSetting);
                                setting.addGameGenreSetting(gameGenreSetting);
                                gameService.updateGameGenreSetting(gameGenreSetting);
                                genreService.updateGameGenreSetting(gameGenreSetting);
                                settingService.updateGameGenreSetting(gameGenreSetting);
                                main(args);
                            }
                            if (table.equals("exit")) {
                                main(args);
                            }
                            System.err.println("You enter wrong query");
                            System.err.print("____________________ \n \n");
                            main(args);
                        case 0:
                            break;
                        default:
                            System.err.println("You enter wrong query");
                            System.err.print("____________________ \n \n");
                            main(args);


                    }
                }
    }
}
