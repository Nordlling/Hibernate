package models;

import javax.persistence.*;
import java.util.ArrayList;
import  java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "language")

public class Language {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "language_id")
    private int languageId;
    @Column(name = "language_name")
    private String languageName;

    @OneToMany(mappedBy="language", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private List<Engine> engines;

    public Language() {
    }

    public Language(String languageName) {
        this.languageName = languageName;
        engines = new ArrayList<>();
    }

    public void addEngine(Engine engine) {
        engine.setLanguage(this);
        engines.add(engine);
    }

    public void removeEngine(Engine engine) {
        engines.remove(engine);
    }

    public int getLanguageId() {
        return languageId;
    }

    public void setLanguageId(int languageId) {
        this.languageId = languageId;
    }

    public String getLanguageName() { return languageName; }

    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }

    public List<Engine> getEngines() {
        return engines;
    }

    public void setEngines(List<Engine> engines) {
        this.engines = engines;
    }

    @Override
    public String toString() {

        return languageId + "|" + languageName;
    }

}