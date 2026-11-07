public class Ratu extends Karakter implements Penyerang, Penyembuh {
    private int energi;

    public Ratu(String id, String nama) {
        this(id, nama, HP_MAKSIMUM, 50);
    }

    public Ratu(String id, String nama, int hp, int energi) {
        super(id, nama, hp);
        this.energi = energi;
    }

    @Override
    public void gunakanSkill() {
        if (energi >= 30) {
            energi = energi - 30;
            System.out.println(getNama() + " menggunakan skill, energi: " + energi);
        } else {
            energi = energi + 15;
            System.out.println(getNama() + " memulihkan energi, energi: " + energi);
        }
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Energi: " + energi);
    }

    @Override
    public void serang(Karakter target) {
        target.setHp(target.getHp() - 10);
        System.out.println(getNama() + " menyerang " + target.getNama() + ", HP target: " + target.getHp());
    }

    @Override
    public void sembuhkan(Karakter target) {
        target.setHp(target.getHp() + 15);
        System.out.println(getNama() + " mengobati " + target.getNama() + ", HP target: " + target.getHp());
    }

    public int getEnergi() {
        return energi;
    }

    public void setEnergi(int energi) {
        this.energi = energi;
    }
}
