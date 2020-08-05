import java.util.Scanner;
public class bank
{
public static void main(String [] args)
{
System.out.println("BANK ADMIN MENU :");
System.out.println("Please Enter The Menu Option :");
System.out.println(" (1) : Add Customer to the bank :");
System.out.println(" (2) : change customer name :");
System.out.println(" (3) : check account balance :");
System.out.println(" (4) : modify accout balance :");
System.out.println(" (5) : summary to all account :");
System.out.println(" (-1) : QUIT ");


Scanner input =new Scanner(System.in);
int userInput =input.nextInt();
int size=0;
double[] accountBalance = new double[250];
String[] accountNames = new String[250];
if(userInput == 1)
{
System.out.println("Bank add Customer Menu:");
System.out.println("Please Enter The Account Balance :");
double balance =input.nextDouble();
accountBalance[size]=balance;
System.out.println("Please Enter The account name");
input.hasNextLine();
String name=input.nextLine();
accountNames[size]=name;
System.out.println("customer id is:" + size);
size=size+1;
}
if(userInput == 2)
{
System.out.println("bank change name  menu :");
System.out.println("Please enter the customer id to changetheir name:");
int index = input.nextInt();
System.out.println("what is the customers new name :");
input.nextLine();
accountNames[index]= input.nextLine();
}
if(userInput == 3)
{
System.out.println("bank check balance menu");
System.out.println("Please Enter The customer id to check the balance");
int index = input.nextInt();
double balance =accountBalance[index];
System.out.println("this customer has $" + balance + "in their account");
}
if(userInput == 4)
{
System.out.println("bank modify  balance menu");
System.out.println("Please Enter The customer id to check the balance");
int index = input.nextInt();
System.out.println("please input new balance :");
accountBalance[index]=input.nextDouble();
}
if(userInput == 5)
{
System.out.println("bank all customer summary menu :");
double total=0;
for(int i=0;i<size;i++)
{
total=total+accountBalance[i];
System.out.println(accountBalance[i]+"has $"+accountBalance[i] + " ");
 }
System.out.println("in total their is $" + total +" in the bank ");
}

if(userInput == -1)
{
System.exit(-1);
}
else
{
System.out.println("ERROR!! invalid input ");
}
}
}
