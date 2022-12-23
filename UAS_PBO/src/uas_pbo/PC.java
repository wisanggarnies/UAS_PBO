package uas_pbo;

public class PC extends Komputer implements Mouse, Keyboard, Printer{
    public void hidupkan_os() {
        System.out.println("PC telah di nyalahkan");
    }

    public void matikan_os() {
        System.out.println("PC telah di matikan");
    }

    public void klik_kanan() {
        System.out.println("PC telah di klik kanan");
    }

    public void klik_kiri() {
        System.out.println("PC telah di klik kiri");
    }

    public void tekan_enter() {
        System.out.println("PC telah di enter");
    }

    public void cetak_data() {
        System.out.println("PC telah mencetak data");
    }
}

