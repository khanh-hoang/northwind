package fi.vamk.e2001365.northwind.entity;

import javax.persistence.*;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "status_id")
    private OrdersStatus status;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "tax_status_id")
    private OrdersTaxStatus taxStatus;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "shipper_id")
    private Shipper shipper;

    public Shipper getShipper() {
        return shipper;
    }

    public void setShipper(Shipper shipper) {
        this.shipper = shipper;
    }

    public OrdersTaxStatus getTaxStatus() {
        return taxStatus;
    }

    public void setTaxStatus(OrdersTaxStatus taxStatus) {
        this.taxStatus = taxStatus;
    }

    public OrdersStatus getStatus() {
        return status;
    }

    public void setStatus(OrdersStatus status) {
        this.status = status;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    //TODO Reverse Engineering! Migrate other columns to the entity
}