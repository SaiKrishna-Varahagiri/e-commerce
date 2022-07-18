package com.sk.ecommerce.po;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "products")
@Setter
@Getter
@ToString
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "PRICE")
    private double price;
    @Column(name = "IMAGE_URL")
    private String imageUrl;
    @Column(name = "INDICATOR")
    private String indicator;
    @Column(name = "UNITS")
    private int units;
    @Column(name = "CREATED_DT")
    private Date createdDt;
    @Column(name = "MODIFIED_DT")
    private Date modifiedDt;
    @ManyToOne
    @JoinColumn(name="CATEGORY_ID", nullable = false)
    private ProductCategory categoryId;
}
