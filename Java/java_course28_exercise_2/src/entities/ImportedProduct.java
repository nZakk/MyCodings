package entities;

public class ImportedProduct extends Product{
    private Double taxFee;

    public ImportedProduct(){
        super();
    }

    public ImportedProduct(String name, Double price, Double taxFee) {
        super(name, price);
        this.taxFee = taxFee;
    }

    public Double getTaxFee() {
        return taxFee;
    }

    public void setTaxFee(Double taxFee) {
        this.taxFee = taxFee;
    }

    public Double totalPrice(){
        return getPrice() + taxFee;
    }

    @Override
    public String priceTag() {
        return String.format("%s $ %.2f (Tax fee : $ %.2f)", getName(), totalPrice(), taxFee);
    }
}
