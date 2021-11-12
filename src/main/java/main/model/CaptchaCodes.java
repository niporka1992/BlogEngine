package main.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Table(name = "captcha_codes")
public class CaptchaCodes {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "time", nullable = false)
    private Date time;

    @Column(name = "code", nullable = false)
    private short code;

    @Column(name = "secret_code", nullable = false)
    private short secretCode;

}
