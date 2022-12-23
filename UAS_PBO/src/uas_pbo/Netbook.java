package uas_pbo;

public class Netbook extends Komputer implements Mouse, Keyboard, Printer{
    public void hidupkan_os() {
        System.out.println("Netbook telah di hidupkan");
    }

    public void matikan_os() {
        System.out.println("Netbook telah di matikan");
    }

    public void klik_kanan() {
        System.out.println("Netbook telah di klik kanan");
    }

    public void klik_kiri() {
        System.out.println("Netbook telah di klik kiri");
    }

    public void tekan_enter() {
        System.out.println("Netbook telah di tekan enter");
    }

    public void cetak_data() {
        System.out.println("Netbook telah mencetak data");
    }
}
