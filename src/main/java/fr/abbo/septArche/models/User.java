package fr.abbo.septArche.models;

import jakarta.persistence.*;

@Entity
@Table(name = "user")
@Inheritance(strategy = InheritanceType.JOINED)
public class User {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private String username;
    private String email;
    private String PassWord;

    public User() {}

    public User(Long id, String username, String email, String PassWord) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.PassWord = PassWord;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPseudo() {
        return username;
    }

    public void setPseudo(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassWord() {
        return PassWord;
    }

    public void setPassWord(String passWord) {
        PassWord = passWord;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", PassWord='" + PassWord + '\'' +
                '}';
    }
}