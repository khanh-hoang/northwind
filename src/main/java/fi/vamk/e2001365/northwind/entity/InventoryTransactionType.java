package fi.vamk.e2001365.northwind.entity;

import javax.persistence.*;

@Entity
@Table(name = "inventory_transaction_types")
public class InventoryTransactionType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "type_name", nullable = false, length = 50)
    private String typeName;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    //TODO Reverse Engineering! Migrate other columns to the entity
}