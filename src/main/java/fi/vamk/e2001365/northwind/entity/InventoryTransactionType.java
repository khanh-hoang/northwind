package fi.vamk.e2001365.northwind.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "inventory_transaction_types")
public class InventoryTransactionType {
    @Id
    @Column(name = "id", nullable = false)
    private Boolean id = false;

    public Boolean getId() {
        return id;
    }

    public void setId(Boolean id) {
        this.id = id;
    }

    //TODO Reverse Engineering! Migrate other columns to the entity
}