package com.intuit.intuitshopclaimsmanager.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Data
@Table(name = "complaints")
public class Complaint {
    @Id
    private UUID id;
    @ManyToOne
    @JoinColumn(name = "userId", referencedColumnName = "id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "purchaseId", referencedColumnName = "id")
    private Purchase purchase;
    private String subject;
    private String content;
}
