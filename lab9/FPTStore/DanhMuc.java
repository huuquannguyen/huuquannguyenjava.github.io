package lab9.FPTStore;

public enum DanhMuc {
    DIENTHOAI(1), LAPTOP(2), APPLE(3), PHUKIEN(4);

    private int value;

    private DanhMuc(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }   
}
