package practica2;

class Imagen {

    private int renglones;
    private int columnas;
    private int pixeles[];

    public Imagen(int renglones, int columnas, int[] pixeles) {
        this.renglones = renglones;
        this.columnas = columnas;
        this.pixeles = pixeles;
    }

    Imagen(int i, int i0, int[] i1, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int[] getPixeles() {
        return pixeles;
    }

}
