package com.pangusa.avisosspringboot.models.entity;

import java.io.Serializable;
import java.util.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="users")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column()
    String username;
    String password;
    @Column()
    String names;

    @Column(name = "paternal_surname")
    String paternalSurname;

    @Column(name = "maternal_surname")
    String maternalSurname;

    String region;
    String phone;

    @Column()
    @Temporal(TemporalType.DATE)
    Date birthdate;

    @Column(name = "terms_and_conditions")
    String termsAndConditions;

    @Column(name="creation_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationdate;

    @PrePersist
    public void PrePersist() {
        creationdate = new Date();
    }
}