
package com.online.restaurant;
import java.util.Date;
import java.util.List;
public class Order {
    private long orderId;
    private long totalamount;
    private Vendor venderId;
    private Customer customer;
    private Customer deliveryAddredd;
    private List<OrderMenuItem> orderDate;
    private String orderStatus;
    private Date OrderDate ;

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public long getTotalamount() {
        return totalamount;
    }

    public void setTotalamount(long totalamount) {
        this.totalamount = totalamount;
    }

    public Vendor getVenderId() {
        return venderId;
    }

    public void setVenderId(Vendor venderId) {
        this.venderId = venderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Customer getDeliveryAddredd() {
        return deliveryAddredd;
    }

    public void setDeliveryAddredd(Customer deliveryAddredd) {
        this.deliveryAddredd = deliveryAddredd;
    }

    public List<OrderMenuItem> getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {this.orderDate = (List<OrderMenuItem>) orderDate;}

    public void setOrderDate(List<OrderMenuItem> orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
}
