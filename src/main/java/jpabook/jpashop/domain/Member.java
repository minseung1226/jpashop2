package jpabook.jpashop.domain;

import jpabook.jpashop.domain.embeded.Address;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "MEMBER")
public class Member extends BaseEntity{
    @Id@GeneratedValue
    @Column(name = "member_id")
    private Long id;
    private String name;

    @Embedded
    private Address address;

    private String count;

    @OneToMany(mappedBy = "member")
    private List<Order> orders=new ArrayList<>();

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
