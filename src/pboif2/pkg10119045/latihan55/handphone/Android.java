/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119045.latihan55.handphone;

/**
 *
 * @author Legion
 * NAMA     : Fahma Maulana
 * KELAS    : PBOIF2
 * NIM      : 10119045
 * Deskripsi: Handphone
 */
public class Android extends Handphone {
    private String keyStore;

    public Android(String man, String os, String model, int harga) {
        super(man, os, model, harga);
    }

    public String getKeyStore() {
        return keyStore;
    }

    public void setKeyStore(String keyStore) {
        this.keyStore = keyStore;
    }
}
