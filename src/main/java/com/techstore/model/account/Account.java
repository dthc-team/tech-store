package com.techstore.model.account;

import com.techstore.model.general.InitialDate;

import javax.persistence.*;
import java.util.List;

@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(columnDefinition = "varchar(100)")
    private String userName;
    @Column(columnDefinition = "varchar(100)")
    private String password;
    @ManyToMany
    private List<Role> role;
    @Embedded
    private InitialDate initialDate;

    public Account() {
        initialDate = new InitialDate();
    }

    public Account(int id, String userName, String password, List<Role> role, InitialDate initialDate) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.role = role;
        this.initialDate = initialDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Role> getRole() {
        return role;
    }

    public void setRole(List<Role> role) {
        this.role = role;
    }

    public InitialDate getInitialDate() {
        return initialDate;
    }

    public void setInitialDate(InitialDate initialDate) {
        this.initialDate = initialDate;
    }
}