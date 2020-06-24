package services;

import dao.GenreDAO;
import models.GameGenreSetting;
import models.Genre;
import models.Game;

import java.util.List;

public class GenreService {

    private GenreDAO genresDao = new GenreDAO();

    public GenreService() { }

    public Genre findGenre(int id) { return genresDao.findById(id); }

    public void saveGenre(Genre genre) { genresDao.save(genre); }

    public void saveGameGenreSetting(GameGenreSetting gameGenreSetting) { genresDao.saveGameGenreSetting(gameGenreSetting); }

    public void deleteGenre(Genre genre) { genresDao.delete(genre); }

    public void deleteGameGenreSetting(GameGenreSetting gameGenreSetting) { genresDao.deleteGameGenreSetting(gameGenreSetting); }

    public void updateGenre(Genre genre) { genresDao.update(genre); }

    public void updateGameGenreSetting(GameGenreSetting gameGenreSetting) { genresDao.updateGameGenreSetting(gameGenreSetting); }

    public List<Genre> findAllGenres() { return genresDao.findAllGenres(); }

    public List<GameGenreSetting> findAllGameGenreSettings() { return genresDao.findAllGameGenreSettings(); }

    public GameGenreSetting findGameGenreSettingById(int id) { return genresDao.findGameGenreSettingById(id); }


}