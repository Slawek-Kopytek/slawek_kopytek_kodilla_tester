package com.kodilla.hibernate.task;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
@Table(name = "TASKS_FINANCIALS_DETAILS")
public class TaskFinancialDetails {
    private int id;
    private BigDecimal price;
    private boolean paid;

    public TaskFinancialDetails() {
    }

    public TaskFinancialDetails(BigDecimal price, boolean paid) {
        this.price = price;
        this.paid = paid;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @NotNull
    @Column(name = "PRICE")
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @NotNull
    @Column(name = "PAID")
    public boolean getPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }
}