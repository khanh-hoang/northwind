package fi.vamk.e2001365.northwind.entity;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "orders_tax_status")
public class OrdersTaxStatus {
    @Id
    @Column(name = "id", nullable = false)
    private Boolean id = false;

    @Column(name = "tax_status_name", nullable = false, length = 50)
    private String taxStatusName;

    @OneToMany(mappedBy = "taxStatus")
    private Set<Order> orders = new LinkedHashSet<>();

    public Set<Order> getOrders() {
        return orders;
    }

    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }

    public String getTaxStatusName() {
        return taxStatusName;
    }

    public void setTaxStatusName(String taxStatusName) {
        this.taxStatusName = taxStatusName;
    }

    public Boolean getId() {
        return id;
    }

    public void setId(Boolean id) {
        this.id = id;
    }
}