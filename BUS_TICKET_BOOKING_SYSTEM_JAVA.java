import java.util.*;
class java_main{

//     print("0. Exit")
//     print("1. View Bus Schedules")
//     print("2. Book Ticket")
//     print("3. Cancel Booking")
//     print("4. View My Bookings")
    
    public static void main(String[] args){
        methods m1 = new methods("j",5);
        while (true) {
            System.out.println("1. View Bus Schedules\n"
            +"2. Book Ticket"
            +"\n3. Cancel Booking"
            +"\n4. View My Bookings");

            Scanner sc = new Scanner(System.in);
            System.out.println("Choose an option");
            Integer op = sc.nextInt();
            switch(op){
                case 1:
                    m1.view_buses_Schedules();
                    break;
                case 2:
                    m1.view_buses_Schedules();
                    m1.ticket_booking();
                    break;
                case 3:
                    m1.cancel_booking();
                    break;
                case 4:
                    m1.display_info();
                    break;
            }
            Scanner choice = new Scanner(System.in);
            System.out.println("Do you want to continue (yes/no)?");
            if (op.equals("No")){
                break;
            }
        }
    }
}

class bus_data{
    HashMap<String,methods> data = new HashMap<>();
}

class methods extends bus_data{
    String customer_name;
    Integer ID;
    
    methods(String customer_name,Integer ID){
        this.customer_name = customer_name;
        this.ID = ID;
    }

    void view_buses_Schedules(){
        System.out.println("--- Available Bus Schedules ---");
        System.out.println("1: north nazimabad - power house"
        +"\nTime: 09:00 AM"
        +"\nPKR: 500\n"
        +"\n2: kda - gulshan"
        +"\nTime: 12:00 PM"
        +"\nPKR: 70\n"
        +"\n3: ayesha manzil - bahria"
        +"\nTime: 05:00 PM"
        +"\nPKR: 600");
    }

    void ticket_booking(){

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Schedules ID: ");
        Integer booking_id = sc.nextInt();

        System.out.println("Enter your name: ");
        String cus_name = sc.nextLine();

        data.put(cus_name,new data(cus_name,booking_id));
    }

    void cancel_booking(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your name: ");
        String cus_name = sc.nextLine();
        if (data.containsKey(cus_name) == true){
            data.remove(cus_name);
        }
    }

    void display_info(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your name: ");
        String cus_name = sc.nextLine();
        if (data.containsKey(cus_name) == true){
            System.out.println("hehe");
        }
    }
}

