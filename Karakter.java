public abstract class Karakter {
    public static final int HP_MAKSIMUM = 100;
    private final String id;
    private String nama;
    private int hp;

    public Karakter(String id, String nama) {
        this(id, nama, HP_MAKSIMUM);
    }

    public Karakter(String id, String nama, int hp) {
        this.id = id;
        this.nama = nama;
        this.hp = hp;
    }

    public abstract void gunakanSkill();

    public void tampilkanInfo() {
        System.out.println(id + " | " + nama + " | HP: " + hp);
    }

    public boolean isHidup() {
        return hp > 0;
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
