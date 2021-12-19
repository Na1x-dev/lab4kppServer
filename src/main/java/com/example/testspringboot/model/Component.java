package com.example.testspringboot.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "components")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Component {

        @Id
        @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        @Column(name = "name_of_component")
        private String nameOfComponent;

        @Column(name = "price")
        private double price;

        @Column(name = "description")
        private String description;

        public void setId(Integer id) {
                this.id = id;
        }

        public void setNameOfComponent(String nameOfComponent) {
                this.nameOfComponent = nameOfComponent;
        }

        public void setPrice(double price) {
                this.price = price;
        }

        public void setDescription(String description) {
                this.description = description;
        }

        public Integer getId() {
                return id;
        }

        public String getNameOfComponent() {
                return nameOfComponent;
        }

        public double getPrice() {
                return price;
        }

        public String getDescription() {
                return description;
        }
}
