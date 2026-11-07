public class Raja extends Karakter implements Penyerang {
    private int kekuatan;

    public Raja(String id, String nama) {
        this(id, nama, HP_MAKSIMUM, 40);
    }

    public Raja(String id, String nama, int hp, int kekuatan) {
        super(id, nama, hp);
        this.kekuatan = kekuatan;
    }

    @Override
    public void gunakanSkill() {
        if (kekuatan >= 20) {
            kekuatan = kekuatan - 20;
            System.out.println(getNama() + " menggunakan skill, kekuatan: " + kekuatan);
        } else {
            kekuatan = kekuatan + 10;
            System.out.println(getNama() + " memulihkan kekuatan, kekuatan: " + kekuatan);
        }
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Kekuatan: " + kekuatan);
    }

    @Override
    public void serang(Karakter target) {
        target.setHp(target.getHp() - 15);
        System.out.println(getNama() + " menyerang " + target.getNama() + ", HP target: " + target.getHp());
    }

    public int getKekuatan() {
        return kekuatan;
    }

    public void setKekuatan(int kekuatan) {
        this.kekuatan = kekuatan;
    }
}
