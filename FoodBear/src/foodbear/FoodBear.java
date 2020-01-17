
package foodbear;


public class FoodBear {

   
    
    private class User
    {
         Restaurant a = new Restaurant();
        Discount b = new Discount();
        items c = new items();
        menu wa= new menu();
        Search bn = new Search();
        order eb = new order();
        String ID;
        String userLevel;
        String password;
    }
    
    public class Restaurant 
    {
        String name;
        String location;
        int minorder;
        
        private void checkminorder()
        {
            System.out.println("To Check min order");
        }
        void Proceedtocheckout()
        {
            System.out.println("Moving to checkout");
        }
       order  Order  =new order();
      Search  search  =new Search();
      User  user = new User();
      Payment payment =new Payment();
    }
    
    public class Search 
    {
        String tosearch;
        String Result;
        Search()
        {
            searchby();
        }
        protected void searchby()
        {
            System.out.println("searched by either cousine or range");
        }
    }
    public class Cuisine extends Search
    {
        String typeofcousine;
        private void setcousine()
        {
            System.out.println("Private function");
        }
        void getcousine()
        {
            System.out.println("To recive Data");
        }
        Cuisine()
        {
            getcousine();
            setcousine();
            
        }
    }
    public class Range extends Search
    {
        int customerrange;
        int restrange;
        private void setrange()
        {
            System.out.println("Private function");
        }
        void getrange()
        {
            System.out.println("To recive Data");
        }
    }
    public class Payment
    {
        Restaurant a = new Restaurant();
        Discount b = new Discount();
        items c = new items();
        int totalbill;
        int NoOfOrders;
        int tax;
        
        protected void calculatenill()
        {
            System.out.println("BILL CALCULATIONS");
        }
        void displaybill()
        {
            System.out.println("Display bill");
        }
        void problemcheck()
        {
            System.out.println("To check if the amount in the bill is correct");
        }
        protected void checkdiscount()
        {
            System.out.println("To check discount");
        }
    }
    public class Discount
    {
        int level;
        int cashoff;
        int percentage;
        private void discountdescision()
        {
            System.out.println("What and how much discount to give");
        }
        protected void discountedbill()
        {
            System.out.println("Discounted bill");
        }
    }
    public class order
    {
        items a = new items();
        Discount d = new Discount();
        int orderid;
        protected void Ordertime()
        {
            System.out.println("The time of  ordered items");
        }
        void ordercompletion()
        {
            System.out.println("Order Completed");
        }
        
    }
    public class items 
    {
        menu a= new menu();
        Search bn = new Search();
        order b = new order();
        int price;
        String name;
        void itemlist()
        {
            System.out.println("display item list");
        }
    }
    public class menu extends Restaurant 
    {
        String Partofmeal;
        void displaymenu()
        {
            System.out.println("Display menu");
        }
        void Searchmenu()
        {
             System.out.println("Uses the Search Class");
        }
    }
    public static void main(String[] args) 
    {
    
    }
    
}
