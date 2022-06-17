public class Stock {
    final static int stock = 50;
    private Products products;

    public Products getProducts() {
        return products;
    }

    public void setProducts(Products products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Products = " + products;
    }

    static class Products {
        private String type;
        private String name;
        private int volume;
        private String producingCountry;

        public Products() {

        }

        public Products(String type, String name, int volume, String producingCountry) {
            this.type = type;
            this.name = name;
            this.volume = volume;
            this.producingCountry = producingCountry;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getVolume() {
            return volume;
        }

        public void setVolume(int volume) {
            this.volume = volume;
        }

        public String getProducingCountry() {
            return producingCountry;
        }

        public void setProducingCountry(String producingCountry) {
            this.producingCountry = producingCountry;
        }

        @Override
        public String toString() {
            return  type + " | " + name + " | "  + volume + " | " + producingCountry;
        }
    }
}
