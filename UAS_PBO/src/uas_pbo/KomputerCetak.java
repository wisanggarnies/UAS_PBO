package uas_pbo;

final class KomputerCetak {
    final static void cetak(Komputer[]obj) {
        for (Komputer kpt : obj) {
            if (kpt instanceof PC) {
                kpt.hidupkan_os();
                kpt.matikan_os();
                kpt.klik_kanan();
                kpt.klik_kiri();
                kpt.tekan_enter();
                kpt.cetak_data();
            }else if (kpt instanceof Laptop){
                kpt.hidupkan_os();
                kpt.matikan_os();
                kpt.klik_kanan();
                kpt.klik_kiri();
                kpt.tekan_enter();
                kpt.cetak_data();
            }else if (kpt instanceof Netbook) {
                kpt.hidupkan_os();
                kpt.matikan_os();
                kpt.klik_kanan();
                kpt.klik_kiri();
                kpt.tekan_enter();
                kpt.cetak_data();
            }
        }
    }
    public static void main(String[] args) {
        PC pc = new PC();
        Laptop lpt = new Laptop();
        Netbook nbk = new Netbook();

        Komputer [] kpt = {pc, lpt, nbk};
        cetak(kpt);
    }
}
