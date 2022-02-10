package ru.netology.Repository;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Film {
    private int id;
    private int productId;
    private String productName;
    private int productPrice;
    private int count;

}
