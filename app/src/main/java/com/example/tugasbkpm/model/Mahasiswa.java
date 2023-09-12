package com.example.tugasbkpm.model;

public class Mahasiswa {
    private String nim,nama,nohp;

    public Mahasiswa(String nim,String nama,String nohp){
        this.nim = nim;
        this.nama = nama;
        this.nohp  = nohp;
    }

    public String getNama() {
        return nama;
    }

    public String setNama(String newNama){
        this.nama = newNama;
        return newNama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNohp() {
        return nohp;
    }

    public void setNohp(String nohp) {
        this.nohp = nohp;
    }
}
