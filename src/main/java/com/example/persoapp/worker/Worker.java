package com.example.persoapp.worker;

import jakarta.persistence.Id;
import jakarta.persistence.Table;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "workers")
public class Worker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "worker_number")
    private Long workerNumber;

    private String name;
    private String email;
    private String gender;
    private String note;
    private boolean married;

    @Temporal(TemporalType.DATE)
    private Date birthday;

    private String profession;

    @Column(name = "phone_number")
    private Integer phoneNumber;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getWorkerNumber() {
        return workerNumber;
    }

    public void setWorkerNumber(Long workerNumber) {
        this.workerNumber = workerNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    @Override
    public String toString() {
        return "User [Nummer="+workerNumber+"Voller Name=" + name + ", E-Mail=" + email + ", Telefon (Mobil)=" + phoneNumber + ", Geschlecht=" + gender + ", Notiz="
                + note + ", verheiratet=" + married + ", Geburtstag=" + birthday + ", Beruf=" + profession + "]";
    }
}
