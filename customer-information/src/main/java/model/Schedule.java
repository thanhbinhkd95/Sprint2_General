package model;

import javax.persistence.*;

@Entity
@Table(name = "schedule")
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "id_hour_show")
    private Long idHourShow;

    @Column(name = "id_day_show")
    private Long idDayShow;

    @Column(name = "id_movie")
    private Long idMovie;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdHourShow() {
        return this.idHourShow;
    }

    public void setIdHourShow(Long idHourShow) {
        this.idHourShow = idHourShow;
    }

    public Long getIdDayShow() {
        return this.idDayShow;
    }

    public void setIdDayShow(Long idDayShow) {
        this.idDayShow = idDayShow;
    }

    public Long getIdMovie() {
        return this.idMovie;
    }

    public void setIdMovie(Long idMovie) {
        this.idMovie = idMovie;
    }
}
