package com.smk.model;

import com.sun.org.apache.xpath.internal.objects.XString;

public class Barang extends Model{
    private String kodeBarang;

    private String namaBarang;
    private int hargaBarang;

    public String getKodeBarang() {
        return kodeBarang;
    }

    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public int getHargaBarang() {
        return hargaBarang;
    }

    public void setHargaBarang(int hargaBarang) {
        this.hargaBarang = hargaBarang;
    }

    @Override
    public String toString() {
        return "Barang{" +
                "kodeBarang='" + kodeBarang + '\'' +
                ", namaBarang='" + namaBarang + '\'' +
                ", hargaBarang=" + hargaBarang +
                ", datecreated=" + datecreated +
                ", lastModified=" + lastModified +
                ", createdBy='" + createdBy + '\'' +
                ", updatedBy='" + updatedBy + '\'' +
                '}';
    }
}
