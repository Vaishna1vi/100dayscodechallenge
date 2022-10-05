public class MonthEnum {
    public enum Month { Jan, Feb, Mar, Apr, May, Jun, Jul, Aug, Sep, Oct, Nov, Dec } 
    public static void main (String [] args) {
        Month[] MonthNow = Month.values();
        for (Month Now : MonthNow) {
            switch (Now)  {
                case Jan :
                    System.out.println("January");
                    break;
                case Feb :
                     System.out.println("February");
                     break;
                case Mar :
                    System.out.println("March");
                    break;
                case Apr :
                     System.out.println("April");
                     break;
                case May :
                    System.out.println("May");
                    break;
                case Jun :
                     System.out.println("June");
                     break;
                case Jul :
                    System.out.println("July");
                    break;
                case Aug :
                    System.out.println("August");
                    break;
                case Sep :
                     System.out.println("September");
                     break;
                case Oct :
                     System.out.println("October");
                     break;
                case Nov :
                    System.out.println("November");
                    break;
                case Dec :
                    System.out.println("December");
                    break;
            }
        }
        
    }
}
