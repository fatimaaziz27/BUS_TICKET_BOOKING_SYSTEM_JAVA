// # Bus data: bus_id: (route, time, fare, seats_available)
// buses = {
//     1: ("north nazimabad - power house", "09:00 AM", 500, 30),
//     2: ("kda - gulshan", "12:00 PM", 700, 30),
//     3: ("ayesha manzil - bahria", "05:00 PM", 600, 30)
// }

// bookings = []  # List to store booked tickets


// # Function to view bus schedules
// def view_buses():
//     print("\n--- Available Bus Schedules ---")
//     for bus_id, details in buses.items():
//         route, time, fare, seats = details
//         print(f"ID: {bus_id} | Route: {route} | Time: {time} | Fare: {fare} | Seats Left: {seats}")
//     print()


// # Function to book a ticket
// def book_ticket():
//     view_buses()
//     bus_id = int(input("Enter Bus ID to book: "))
    
//     if bus_id in buses and buses[bus_id][3] > 0:
//         name = input("Enter your name: ")
//         seats = int(input("Enter number of seats: "))
        
//         if seats <= buses[bus_id][3]:  # Check available seats
//             total_fare = seats * buses[bus_id][2]  # fare = seats × price per seat
//             bookings.append({"name": name, "bus_id": bus_id, "seats": seats, "total_fare": total_fare})
//             # Update available seats
//             route, time, fare, available = buses[bus_id]
//             buses[bus_id] = (route, time, fare, available - seats)
//             print(f"Booking successful! Total Fare: {total_fare}\n")
//         else:
//             print("Not enough seats available.\n")
//     else:
//         print("Invalid Bus ID or no seats available.\n")


// # Function to cancel a booking
// def cancel_booking():
//     name = input("Enter your name to cancel booking: ")
//     for booking in bookings:
//         if booking["name"].lower() == name.lower():
//             bus_id = booking["bus_id"]
//             seats = booking["seats"]
//             # Restore seats
//             route, time, fare, available = buses[bus_id]
//             buses[bus_id] = (route, time, fare, available + seats)
//             bookings.remove(booking)
//             print("Booking cancelled successfully!\n")
//             return
//     print("Booking not found.\n")


// # Function to view all bookings
// def view_bookings():
//     if not bookings:
//         print("No bookings yet.\n")
//     else:
//         print("\n--- Booked Tickets ---")
//         for b in bookings:
//             route, time, fare, _ = buses[b["bus_id"]]
//             print(f"Name: {b['name']}, Route: {route}, Time: {time}, Seats: {b['seats']}, Total Fare: {b['total_fare']}")
//         print()


// # Main loop
// while True:
//     print("0. Exit")
//     print("1. View Bus Schedules")
//     print("2. Book Ticket")
//     print("3. Cancel Booking")
//     print("4. View My Bookings")
    
//     choice = input("Enter your choice: ")
    
//     if choice == "0":
//         print("Exiting Bus Ticket Booking System...")
//         break
//     elif choice == "1":
//         view_buses()
//     elif choice == "2":
//         book_ticket()
//     elif choice == "3":
//         cancel_booking()
//     elif choice == "4":
//         view_bookings()
//     else:
//         print("Invalid choice, try again.\n")


import java.util.*;

class java_main{
    public static void main(String[] args){
        // bank b1 = new bank();
        // while (true) {
        //     System.out.println("1.Signup\n2.Login");
        //     Scanner sc = new Scanner(System.in);
        //     System.out.println("Choose an option");
        //     Integer op = sc.nextInt();
        //     switch(op){
        //         case 1:
        //             b1.sign_up();
        //             break;
        //         case 2:
        //             b1.login();
        //             break;
        //     }
        //     Scanner choice = new Scanner(System.in);
        //     System.out.println("Do you want to continue (yes/no)?");
        //     if (op.equals("No")){
        //         break;
        //     }
        // }
    }
}



class bus_data{
    HashMap<String,methods> data = new HashMap<>();

    //     details.put(name,new account(acc_num,name,pin,passkey,balance))

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

        // view_buses()
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Schedules ID: ");
        Integer booking_id = sc.nextInt();

        System.out.println("Enter your name: ");
        String cus_name = sc.nextLine();

        data.put(cus_name,new customer(cus_name,booking_id));

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
        
        }
    }





// print("0. Exit")
//     print("1. View Bus Schedules")
//     print("2. Book Ticket")
//     print("3. Cancel Booking")
//     print("4. View My Bookings")



void ticket_booking(){
    // view_buses()
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter Schedules ID: ");
    Integer booking_id = sc.nextInt();

    System.out.println("Enter your name: ");
    String customer_name = sc.nextLine();

    if 
        name = input("Enter your name: ")
        seats = int(input("Enter number of seats: "))
        
        if seats <= buses[bus_id][3]:  # Check available seats
            total_fare = seats * buses[bus_id][2]  # fare = seats × price per seat
            bookings.append({"name": name, "bus_id": bus_id, "seats": seats, "total_fare": total_fare})
            # Update available seats
            route, time, fare, available = buses[bus_id]
            buses[bus_id] = (route, time, fare, available - seats)
            print(f"Booking successful! Total Fare: {total_fare}\n")
        else:
            print("Not enough seats available.\n")
    else:
        print("Invalid Bus ID or no seats available.\n")


# Function to cancel a booking
def cancel_booking():
    name = input("Enter your name to cancel booking: ")
    for booking in bookings:
        if booking["name"].lower() == name.lower():
            bus_id = booking["bus_id"]
            seats = booking["seats"]
            # Restore seats
            route, time, fare, available = buses[bus_id]
            buses[bus_id] = (route, time, fare, available + seats)
            bookings.remove(booking)
            print("Booking cancelled successfully!\n")
            return
    print("Booking not found.\n")


# Function to view all bookings
def view_bookings():
    if not bookings:
        print("No bookings yet.\n")
    else:
        print("\n--- Booked Tickets ---")
        for b in bookings:
            route, time, fare, _ = buses[b["bus_id"]]
            print(f"Name: {b['name']}, Route: {route}, Time: {time}, Seats: {b['seats']}, Total Fare: {b['total_fare']}")
        print()


    