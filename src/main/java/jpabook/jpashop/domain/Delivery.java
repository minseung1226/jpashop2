package jpabook.jpashop.domain;

import jpabook.jpashop.domain.embeded.Address;

import javax.persistence.*;

@Entity
public class Delivery extends BaseEntity{

    @Id@GeneratedValue
    @Column(name = "delivery_id")
    private Long id;


    @OneToOne(mappedBy = "delivery")
    private Order order;

    @Embedded
    private Address address;

    private DeliveryStatus status;

}
