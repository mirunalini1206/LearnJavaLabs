package com.learn.labs.jdbc.beans;

/**
 * Created by santoshdandey on 3/22/17.
 */
public class GetFilmsResponse {


    /**
     *  film_id              | smallint(5) unsigned                                                | NO   | PRI | NULL              | auto_increment              |
     | title                | varchar(255)                                                        | NO   | MUL | NULL              |                             |
     | description          | text                                                                | YES  |     | NULL              |                             |
     | release_year         | year(4)                                                             | YES  |     | NULL              |                             |
     | language_id          | tinyint(3) unsigned                                                 | NO   | MUL | NULL              |                             |
     | original_language_id | tinyint(3) unsigned                                                 | YES  | MUL | NULL              |                             |
     | rental_duration      | tinyint(3) unsigned                                                 | NO   |     | 3                 |                             |
     | rental_rate          | decimal(4,2)                                                        | NO   |     | 4.99              |                             |
     | length               | smallint(5) unsigned                                                | YES  |     | NULL              |                             |
     | replacement_cost     | decimal(5,2)                                                        | NO   |     | 19.99             |                             |
     | rating               | enum('G','PG','PG-13','R','NC-17')                                  | YES  |     | G                 |                             |
     | special_features     | set('Trailers','Commentaries','Deleted Scenes','Behind the Scenes') | YES  |     | NULL              |                             |
     | last_update          | timestamp                                                           | NO   |     | CURRENT_TIMESTAMP | on update CURRENT_TIMESTAMP |
     +----------------------+---------------------------------------------------------------------+------+-----+-------------------+-----------------------------+

     */

    private int filmId;
    private String title;
    private String description;
    private int languageId;
    private int rentalDuration;
    private double rentalRate;

    public int getFilmId() {
        return filmId;
    }

    public void setFilmId(int filmId) {
        this.filmId = filmId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getLanguageId() {
        return languageId;
    }

    public void setLanguageId(int languageId) {
        this.languageId = languageId;
    }

    public int getRentalDuration() {
        return rentalDuration;
    }

    public void setRentalDuration(int rentalDuration) {
        this.rentalDuration = rentalDuration;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }

    @Override
    public String toString() {
        return "GetFilmsResponse{" +
                "filmId=" + filmId +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", languageId=" + languageId +
                ", rentalDuration=" + rentalDuration +
                ", rentalRate=" + rentalRate +
                '}';
    }
}

