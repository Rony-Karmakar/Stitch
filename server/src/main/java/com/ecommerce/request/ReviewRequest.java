package com.ecommerce.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReviewRequest {

    private Long productId;
    private double rating;
    private String review;
    private Long userId;
    private String firstName;
    private String lastName;

}
