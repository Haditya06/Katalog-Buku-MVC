package katalogbukumvc.controller;

import java.awt.event.ActionListener;
import katalogbukumvc.model.Buku;
import katalogbukumvc.model.BukuModel;
import katalogbukumvc.view.BukuView;

/**
 *
 * @author Dit
 */
public class BukuController {

    private final BukuModel model;
    private final BukuView view;

    public BukuController(BukuModel model, BukuView view) {
        this.model = model;
        this.view = view;
        
        view.addSimpanListener(event -> simpanBuku());
        view.addClearListener(event -> clearBuku());
        view.addHapusListener(event -> hapusBuku());
        
        view.tampilkanData(model.getSemuaBuku());
    }

    public void simpanBuku() {
        String judul = view.getJudul().trim();
        String penulis = view.getPenulis().trim();
        String tahun = view.getTahunTerbit().trim();

        if (judul.isEmpty() || penulis.isEmpty() || tahun.isEmpty()) {
            view.tampilkanPeringatan(
                    "Input Belum Lengkap",
                    "Judul, Penulis, Tahun Terbit Wajib Diisi"
            );
            return;
        }

        int tahunTerbit;

        try {
            tahunTerbit = Integer.parseInt(tahun);
        } catch (Exception e) {
            view.tampilkanPeringatan(
                    "Input Tidak Valid",
                    "Tahun Terbit Berupa Angka"
            );
            return;
        }

        model.tambahBuku(new Buku(judul, penulis, tahunTerbit));

        view.tampilkanData(model.getSemuaBuku());
        view.kosongkanForm();
    }

    public void hapusBuku() {
        int baris = view.getBarisTerpilih();

        if (baris == -1) {
            view.tampilkanInfo("Hapus Buku","Pilih dulu baris yang akan dihapus"
            );
            return;
        }

        model.hapusBuku(baris);
        view.tampilkanData(model.getSemuaBuku());
    }

    public void clearBuku() {
        model.hapusSemua();
        view.tampilkanData(model.getSemuaBuku());
        view.kosongkanForm();
    }
}
