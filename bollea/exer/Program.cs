using System.Data.Common;
using System.Formats.Asn1;

string permission = "Manager";
int level = 10;

if (permission.Contains("Admin") || permission.Contains("admin"))
{
    if (level > 55)
        Console.WriteLine("Welcome, Super Admin user.");
    else if (level <= 55)
        Console.WriteLine("Welcome, Admin user.");
}
else if (permission.Contains("Manager") || permission.Contains("manager"))
{
    if (level >= 20)
        Console.WriteLine("Contact an Admin for access.");
    else if (level < 55)
        Console.WriteLine("You do not have sufficient privileges.");
}
else
{
    Console.WriteLine("You do not have sufficient privileges.");
}