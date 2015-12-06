#include <iostream>
#include <string>


class Item_base
{
    public:
        Item_base(const std::string &book = "", double sales_price = 0.0): isbn(book), price(sales_price) {}
        std::string book() const { return isbn; }
        virtual double net_price(std::size_t n) const {return n*price;}
        virtual ~Item_base(){ }
    private:
        std::string isbn;
    protected:
         double price;
};

class Bulk_item : public Item_base
{
    public:
        Bulk_item() : min_qty(0), discount(0.0) {}
        Bulk_item(const std::string &book , double sales_price,
                  std::size_t qty = 0, double disc_rate = 0.0): Item_base(book, sales_price), min_qty(qty), discount(disc_rate) {}
        double net_price(std::size_t cnt) const
        {
            if(cnt >= min_qty)
                return cnt * (1 - discount) * price;
            else 
                return cnt * price;
        }
    private:
        std::size_t min_qty;
        double discount;
};

int main()
{
    Bulk_item* bi = new Bulk_item("C++ Primer 4th", 1000, 5, 0.2);
    std::cout <<  bi->net_price(10); 
}
