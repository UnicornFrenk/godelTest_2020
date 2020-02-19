package forGodel.dao.model;

import forGodel.dao.entity.Genre;

import java.time.LocalDate;

public class FilmsDTO {
    private Long directorId;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private String filmName;
    private LocalDate releaseDate;
    private Genre genre;

    public FilmsDTO() {
    }

    public FilmsDTO(Long directorId, String firstName, String lastName,
                    LocalDate birthDate, String filmName, LocalDate releaseDate, Genre genre) {
        this.directorId = directorId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.filmName = filmName;
        this.releaseDate = releaseDate;
        this.genre = genre;
    }

    public Long getDirectorId() {
        return directorId;
    }

    public void setDirectorId(Long directorId) {
        this.directorId = directorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}
