package ru.eventplanner.usermanagementservice.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "users")
@NoArgsConstructor(force = true)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private final Long id;

    private String name;

    @JsonProperty("registration_date")
    private LocalDate creationDate;
}
