package model;

import javax.persistence.*;

@Entity
@Table(name = "ticket")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "code")
    private String code;

    @Column(name = "status")
    private Integer status;

    @Column(name = "point")
    private Integer point;

    @Column(columnDefinition ="Date")
    private String date;

    @Column(name = "id_schedule")
    private Long idSchedule;

    @Column(name = "id_user")
    private Long idUser;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getPoint() {
        return this.point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    public Long getIdSchedule() {
        return this.idSchedule;
    }

    public void setIdSchedule(Long idSchedule) {
        this.idSchedule = idSchedule;
    }

    public Long getIdUser() {
        return this.idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }
}
