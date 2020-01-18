package io.fdlessard.codebites.customer.basic.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
public class Customer implements Serializable {

    private Long id;
    private String lastName;
    private String firstName;
    private String company;
    private Long addressId;
}
