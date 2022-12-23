package uas_pbo;

public class Laptop extends Komputer implements Mouse, Keyboard, Printer{
    public void hidupkan_os() {
        System.out.println("Laptop telah di hidupkan");
    }

    public void matikan_os() {
        System.out.println("Laptop telah di matikan");
    }

    public void klik_kanan() {
        System.out.println("Laptop telah di klik kanan");
    }

    public void klik_kiri() {
        System.out.println("Laptop telah di klik kiri");
    }

    public void tekan_enter() {
        System.out.println("Laptop telah di tekan enter");
    }

    public void cetak_data() {
        System.out.println("Laptop telah mencetak data");
    }
}
