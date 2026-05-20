
package com.example.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "inventory")
public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "inventory_id")
    private Integer inventoryId;

    @Column(name = "store_id", insertable = false, updatable = false)
    private Integer storeId;

    @Column(name = "last_update", insertable = false, updatable = false)
    private LocalDateTime lastUpdate;

    // Film аль хэдийн @Entity болсон (Week 15)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "film_id") // (4)
    private Film film;

    public Inventory() {
    }

    public Integer getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(Integer inventoryId) {
        this.inventoryId = inventoryId;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }
}
