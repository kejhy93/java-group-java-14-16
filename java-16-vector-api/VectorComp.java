public class VectorComp {

    static final VectorSpecies<Float> SPECIES = FloatVector.SPECIES_256;

    void vectorComputation(float[] a, float[] b, float[] c) {

        for (int i = 0; i < a.length; i += SPECIES.length()) {
            var m = SPECIES.indexInRange(i, a.length);
            
            var va = FloatVector.fromArray(SPECIES, a, i, m);
            var vb = FloatVector.fromArray(SPECIES, b, i, m);
            var vc = va.mul(va).add(vb.mul(vb)).neg();
            vc.intoArray(c, i, m);
        }
    }

    void scalarComputation(float[] a, float[] b, float[] c) {
        for (int i = 0; i < a.length; i++) {
            c[i] = (a[i] * a[i] + b[i] * b[i]) * -1.0f;
        }
    }
}
