package com.resa.testedi.entity;

import jakarta.persistence.*;

/**
 * Created by Resa S.
 * Date: 19-04-2023
 * Created in IntelliJ IDEA.
 */
@Table(name = "tbl_user")
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "userid")
    private int userId;
    @Column(name = "namalengkap")
    private String namalengkap;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "status")
    private String status;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getNamalengkap() {
        return namalengkap;
    }

    public void setNamalengkap(String namalengkap) {
        this.namalengkap = namalengkap;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
