package model;

import javax.persistence.*;

@Entity
@Table(name = "movie_category")
public class MovieCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_movie")
    private Long idMovie;

    @Column(name = "id_category")
    private Long idCategory;

    public Long getIdMovie() {
        return this.idMovie;
    }

    public void setIdMovie(Long idMovie) {
        this.idMovie = idMovie;
    }

    public Long getIdCategory() {
        return this.idCategory;
    }

    public void setIdCategory(Long idCategory) {
        this.idCategory = idCategory;
    }
}
