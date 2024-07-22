public class Main {
    public static void main(String[] args) {
        Product product = new Product("Smartphone", 1000.00);

        System.out.println("Preço original: $" + product.getOriginalPrice());

        // Aplicar desconto de Natal
        product.setDiscountStrategy(new ChristmasDiscount());
        System.out.println("Preço com desconto de Natal: $" + product.getPrice());

        // Aplicar desconto da Black Friday
        product.setDiscountStrategy(new BlackFridayDiscount());
        System.out.println("Preço com desconto da Black Friday: $" + product.getPrice());

        // Sem desconto
        product.setDiscountStrategy(new NoDiscount());
        System.out.println("Preço sem desconto: $" + product.getPrice());
    }
}
