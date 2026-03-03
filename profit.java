public class profit {
    public static void main(String[] args){
        float profit;
        int cost=129;
        int sell=191;
        float profit_perecentage;
        profit=sell-cost;
        profit_perecentage=(profit/cost)*100;

        System.out.println("The cost price is INR " + cost);
        System.out.println("The profit is INR " + profit + " and the profit percentage " + profit_perecentage ) ;

    }

}
