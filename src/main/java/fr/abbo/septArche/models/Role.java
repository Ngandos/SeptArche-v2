package fr.abbo.septArche.models;

import jakarta.persistence.*;

@Embeddable
@Table(name = "role")
public class Role {
    private  String role;
    private String nivAcc;

    public Role() {}

    public Role(String role, String nivAcc) {
        this.role = role;
        this.nivAcc = nivAcc;
    }

    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public String getNivAcc() {
        return nivAcc;
    }
    public void setNivAcc(String nivAcc) {
        this.nivAcc = nivAcc;
    }

    @Override
    public String toString() {
        return "Role{" + "role='" + role + '\'' + ", nivAcc='" + nivAcc + '\'' + '}';
    }
}