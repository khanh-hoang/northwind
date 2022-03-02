package fi.vamk.e2001365.northwind.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "inventory_transactions", indexes = {
        @Index(name = "customer_order_id_2", columnList = "customer_order_id"),
        @Index(name = "product_id", columnList = "product_id"),
        @Index(name = "purchase_order_id", columnList = "purchase_order_id"),
        @Index(name = "transaction_type", columnList = "transaction_type")
})
public class InventoryTransaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "transaction_type", nullable = false)
    private InventoryTransactionType inventoryTransactionTypes;

    @Column(name = "transaction_created_date")
    private Instant transactionCreatedDate;

    @Column(name = "transaction_modified_date")
    private Instant transactionModifiedDate;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "product_id", nullable = false)
    private Product products;

    @Column(name = "quantity", nullable = false)
    private Integer quantity;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "purchase_order_id")
    private PurchaseOrder purchaseOrders;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "customer_order_id")
    private Order orders;

    @Column(name = "comments")
    private String comments;

    @JsonIgnore
    @OneToMany(mappedBy = "inventory")
    private Set<PurchaseOrderDetail> purchaseOrderDetails = new LinkedHashSet<>();

    public Set<PurchaseOrderDetail> getPurchaseOrderDetails() {
        return purchaseOrderDetails;
    }

    public void setPurchaseOrderDetails(Set<PurchaseOrderDetail> purchaseOrderDetails) {
        this.purchaseOrderDetails = purchaseOrderDetails;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Order getOrders() {
        return orders;
    }

    public void setOrders(Order orders) {
        this.orders = orders;
    }

    public PurchaseOrder getPurchaseOrders() {
        return purchaseOrders;
    }

    public void setPurchaseOrders(PurchaseOrder purchaseOrders) {
        this.purchaseOrders = purchaseOrders;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Product getProducts() {
        return products;
    }

    public void setProducts(Product products) {
        this.products = products;
    }

    public Instant getTransactionModifiedDate() {
        return transactionModifiedDate;
    }

    public void setTransactionModifiedDate(Instant transactionModifiedDate) {
        this.transactionModifiedDate = transactionModifiedDate;
    }

    public Instant getTransactionCreatedDate() {
        return transactionCreatedDate;
    }

    public void setTransactionCreatedDate(Instant transactionCreatedDate) {
        this.transactionCreatedDate = transactionCreatedDate;
    }

    public InventoryTransactionType getInventoryTransactionTypes() {
        return inventoryTransactionTypes;
    }

    public void setInventoryTransactionTypes(InventoryTransactionType inventoryTransactionTypes) {
        this.inventoryTransactionTypes = inventoryTransactionTypes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}