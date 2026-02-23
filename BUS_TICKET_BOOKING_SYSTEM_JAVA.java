import java.util.*;
class java_main{


// 0. Exit
// 1. View Bus Schedules
// 2. Book Ticket
// 3. Cancel Booking
// 4. View My Bookings
// Enter your choice: 1

// --- Available Bus Schedules ---
// ID: 1 | Route: north nazimabad - power house | Time: 09:00 AM | Fare: 500 | Seats Left: 30
// ID: 2 | Route: kda - gulshan | Time: 12:00 PM | Fare: 700 | Seats Left: 30
// ID: 3 | Route: ayesha manzil - bahria | Time: 05:00 PM | Fare: 600 | Seats Left: 30

// 0. Exit
// 1. View Bus Schedules
// 2. Book Ticket
// 3. Cancel Booking
// 4. View My Bookings
// Enter your choice: 2

// --- Available Bus Schedules ---
// ID: 1 | Route: north nazimabad - power house | Time: 09:00 AM | Fare: 500 | Seats Left: 30
// ID: 2 | Route: kda - gulshan | Time: 12:00 PM | Fare: 700 | Seats Left: 30
// ID: 3 | Route: ayesha manzil - bahria | Time: 05:00 PM | Fare: 600 | Seats Left: 30

// Enter Bus ID to book: 2
// Enter your name: yusra
// Enter number of seats: 3
// Booking successful! Total Fare: 2100

// 0. Exit
// 1. View Bus Schedules
// 2. Book Ticket
// 3. Cancel Booking
// 4. View My Bookings
// Enter your choice: 4

// --- Booked Tickets ---
// Name: yusra, Route: kda - gulshan, Time: 12:00 PM, Seats: 3, Total Fare: 2100

// 0. Exit
// 1. View Bus Schedules
// 2. Book Ticket
// 3. Cancel Booking
// 4. View My Bookings
// Enter your choice: 3
// Enter your name to cancel booking: yusra
// Booking cancelled successfully!

// 0. Exit
// 1. View Bus Schedules
// 2. Book Ticket
// 3. Cancel Booking
// 4. View My Bookings
// Enter your choice: 0
// Exiting Bus Ticket Booking System...

// === Code Execution Successful ===

    public static void main(String[] args){

        methods m1 = new methods ("a","b",5,3,78);

    //  Enter your choice:

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

    //  Attributes ------>

    String customer_name;
    String route;
    String time;
    Integer seats;
    Integer total_fare;

//  constructor ------>    

    methods(String name,String route,String time,Integer seats,Integer fare){
        this.customer_name = name;
        this.route = route;
        this.seats = seats;
        this.time = time;
        this.total_fare = fare;
    }

//  1. View Bus Schedules

    void view_buses_Schedules(){
        
        // Incomplete --------->
        
        System.out.println("--- Available Bus Schedules ---"
        +"ID: 1 | Route: north nazimabad - power house | Time: 09:00 AM | Fare: 500 | Seats Left: 30"
        +"ID: 2 | Route: kda - gulshan | Time: 12:00 PM | Fare: 700 | Seats Left: 30"
        +"ID: 3 | Route: ayesha manzil - bahria | Time: 05:00 PM | Fare: 600 | Seats Left: 30");
    
    }

//  2. Book Ticket

    void ticket_booking(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Schedules ID: ");
        Integer booking_id = sc.nextInt();

        System.out.println("Enter your name: ");
        String cus_name = sc.nextLine();

        data.put(cus_name,new data(cus_name,booking_id));
    }

//  3. Cancel Booking

    void cancel_booking(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your name: ");
        String cus_name = sc.nextLine();
        if (data.containsKey(cus_name) == true){
            data.remove(cus_name);
        }
    }

//  4. View My Bookings

    void display_info(){

        // Name: yusra, Route: kda - gulshan, Time: 12:00 PM, Seats: 3, Total Fare: 2100

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your name: ");
        String cus_name = sc.nextLine();
        if (data.containsKey(cus_name) == true){
            System.out.println("hehe");
        }
    }
}

