package com.krearive.hasanahnew.Fragment;

/**
 * Created by idn on 3/21/2017.
 */
public class ClusterModel {
    String namaCluster,  detailCluster;
    int gambarCluster, jumlahLantai, jumlahKamar, luasTanah, luasBangunan, hargaCluster, gambarSiteplan, gambarTipe;

    public ClusterModel() {
    }

    public ClusterModel(String namaCluster, int gambarCluster, String detailCluster, int jumlahLantai, int jumlahKamar, int luasTanah, int luasBangunan, int hargaCluster, int gambarSiteplan, int gambarTipe) {
        this.namaCluster = namaCluster;
        this.gambarCluster = gambarCluster;
        this.detailCluster = detailCluster;
        this.jumlahLantai = jumlahLantai;
        this.jumlahKamar = jumlahKamar;
        this.luasTanah = luasTanah;
        this.luasBangunan = luasBangunan;
        this.hargaCluster = hargaCluster;
        this.gambarSiteplan = gambarSiteplan;
        this.gambarTipe = gambarTipe;
    }

    public int getGambarSiteplan() {
        return gambarSiteplan;
    }

    public void setGambarSiteplan(int gambarSiteplan) {
        this.gambarSiteplan = gambarSiteplan;
    }

    public int getGambarTipe() {
        return gambarTipe;
    }

    public void setGambarTipe(int gambarTipe) {
        this.gambarTipe = gambarTipe;
    }

    public int getJumlahLantai() {
        return jumlahLantai;
    }

    public void setJumlahLantai(int jumlahLantai) {
        this.jumlahLantai = jumlahLantai;
    }

    public int getJumlahKamar() {
        return jumlahKamar;
    }

    public void setJumlahKamar(int jumlahKamar) {
        this.jumlahKamar = jumlahKamar;
    }

    public int getLuasTanah() {
        return luasTanah;
    }

    public void setLuasTanah(int luasTanah) {
        this.luasTanah = luasTanah;
    }

    public int getLuasBangunan() {
        return luasBangunan;
    }

    public void setLuasBangunan(int luasBangunan) {
        this.luasBangunan = luasBangunan;
    }

    public int getHargaCluster() {
        return hargaCluster;
    }

    public void setHargaCluster(int hargaCluster) {
        this.hargaCluster = hargaCluster;
    }

    public String getDetailCluster() {
        return detailCluster;
    }

    public void setDetailCluster(String detailCluster) {
        this.detailCluster = detailCluster;
    }

    public String getNamaCluster() {
        return namaCluster;
    }

    public void setNamaCluster(String namaCluster) {
        this.namaCluster = namaCluster;
    }

    public int getGambarCluster() {
        return gambarCluster;
    }

    public void setGambarCluster(int gambarCluster) {
        this.gambarCluster = gambarCluster;
    }
}
