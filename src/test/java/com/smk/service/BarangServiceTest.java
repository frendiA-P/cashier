package com.smk.service;

import com.smk.model.Barang;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class BarangServiceTest {

    @Test
    @Order(2)
    void getBarangList() {
        List<Barang> barangList = BarangService.getInstance().getBarangList();
        assertEquals(barangList.size(),3);
    }

    @Test
    @Order(3)
    void findByName(){
        List<Barang> resultList =
                BarangService.getInstance().findByname("Laptop");
                assertEquals(resultList.size(),2);
    }

    @Test
    @Order(1)
    void addBarang() {
        Barang laptop=new Barang();
        laptop.setKodeBarang("LP001");
        laptop.setNamaBarang("Laptop");
        laptop.setHargaBarang(5000000);
        BarangService.getInstance().addBarang(laptop);

        Barang mouse=new Barang();
        mouse.setKodeBarang("MO002");
        mouse.setNamaBarang("Mouse");
        mouse.setHargaBarang(1000000);
        BarangService.getInstance().addBarang(mouse);

        Barang laptopGaming = new Barang();
        laptopGaming.setKodeBarang("LP002");
        laptopGaming.setNamaBarang("Laptop " + "Gaming");
        laptopGaming.setHargaBarang(20000000);
        BarangService.getInstance().addBarang(laptopGaming);
    }
}