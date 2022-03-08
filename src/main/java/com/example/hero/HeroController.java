package com.example.hero;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HeroController {

    @GetMapping
    public List<Product> getHero() {
        Product product = new Product(1, "Licensed Frozen Hat",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam suscipit lacinia arcu, vel " +
                        "lacinia tellus feugiat id. Aliquam metus felis, ornare sit amet lacus at, dapibus semper " +
                        "lectus. Suspendisse et consequat ipsum. Fusce consectetur felis tellus, sed egestas elit " +
                        "feugiat in. Sed iaculis risus sagittis, gravida tortor ut, tempor urna. Aenean eget tellus" +
                        " quis est viverra bibendum vel ac eros. Nunc ut diam arcu. Class aptent taciti sociosqu ad " +
                        "litora torquent per conubia nostra, per inceptos himenaeos.",
                170,
                16,
                "https://source.unsplash.com/1600x900/?product");
        List<Product> products = new ArrayList<>();
        products.add(product);
        return products;
    }
}
