public class ComparisionInstanceof {

    class PointLegacy {
        private int x;
        private int y;

        public PointLegacy(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public boolean equals(Object o) {
            if (!(o instanceof PointLegacy))
                return false;
            PointLegacy other = (PointLegacy) o;
            return x == other.x && y == other.y;
        }
    }

    class PointNew {
        private int x;
        private int y;

        public PointNew(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public boolean equals(Object o) {
            return (o instanceof PointNew other) && x == other.x && y == other.y;
        }
    }
}
