class Main {
    public static void main(String[] args) {
        String city = "Moscow";
        int population = 8_000_000;
        float unemployedPopulation = 0.8f;
        System.out.printf("Город - %s\nНаселение: %d\nПроцент безработных: %f.\n",
                city,
                population,
                unemployedPopulation * 100);
    }
}
