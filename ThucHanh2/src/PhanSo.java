
import java.io.*;
import java.util.Random;

class PhanSo implements Serializable {
    private int tuSo;
    private int mauSo;

    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public int getTuSo() {
        return tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public boolean isMauSoNguyenTo() {
        if (mauSo < 2) return false;
        for (int i = 2; i <= Math.sqrt(mauSo); i++) {
            if (mauSo % i == 0) return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return tuSo + "/" + mauSo;
    }
}