package hu.nyirszikszi.moderntoclassic;

import hu.nyirszikszi.model.Product;

import java.util.List;
import java.util.Locale;
import java.util.Optional;

public class CartPracticeModern {
    private final List<Product> catalog;

    public CartPracticeModern(List<Product> catalog) {
        this.catalog = catalog;
    }

    public Optional<Product> findBySkuIgnoreCase(String sku){
        if (sku == null) return Optional.empty();
        String needle = sku.trim().toLowerCase(Locale.ROOT);

        return catalog.stream()
                .filter(p -> p.getSku() !=null)
                .filter(p-> p.getSku().trim().toLowerCase(Locale.ROOT).equals(needle))
                .findFirst();
    }



}
