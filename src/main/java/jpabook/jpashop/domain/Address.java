package jpabook.jpashop.domain;

import lombok.Getter;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;

@Embeddable
@Getter
public class Address {

    private String city;
    private String street;
    private String zipCode;

    protected Address() {

    }

    public Address(String city, String street, String zipCode) {
        this.city = city;
        this.street = street;
        this.zipCode = zipCode;
    }
}
