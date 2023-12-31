public class Main {
    public static void main(String[] args) {
        String mesaj = "";
        Product product1 = new Product();
        //set
        product1.setName("Delonghi Kahve Mak");
        product1.setDiscount(7);
        product1.setUnitPrice(7500);
        product1.setUnitInStock(3);
        product1.setImageUrl("image1.jpg");

        Product product2 = new Product();
        product2.setName("Smeg Kahve Mak");
        product2.setDiscount(7);
        product2.setUnitPrice(7500);
        product2.setUnitInStock(3);
        product2.setImageUrl("image2.jpg");

        Product product3 = new Product();
        product3.setName("Kitchen Aid Kahve Mak");
        product3.setDiscount(7);
        product3.setUnitPrice(7500);
        product3.setUnitInStock(3);
        product3.setImageUrl("image3.jpg");

        Product[] products= {product1,product2,product3};

        System.out.println("<ul>");
        for (Product product:products) {
            System.out.println("<li>" +product.getName()+"</li>");
        }
        System.out.println("</ul>");

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhone("05051231212");
        individualCustomer.setCustomerNumber("12345");
        individualCustomer.setFirstName("Fatih");
        individualCustomer.setLastName("Ünal");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("Kodlama.io");
        corporateCustomer.setPhone("05063213232");
        corporateCustomer.setTaxNumber("111111");
        corporateCustomer.setCustomerNumber("54321");

        Customer[] customers = {individualCustomer,corporateCustomer};
        
    }
}