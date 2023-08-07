import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        التاسك 2 - عمل نظام تسجيل دخول عن طريق ان ال user يقوم بادخال البريد الالكتروني و الرقم السري ومن ثم التحقق ما اذا كان صحيح ( ممكن تستخدم قيم ثابتة عادي )
//        ولو صح اعرض رسالة تم تسجيل االدخول
//        ولو خطأ اعرض رسالة بالخطأ

        Scanner read = new Scanner(System.in);
        System.out.println("Login System");

        String [] user = {"SafaAlhusaini@gmail.com","MarwaAlhusaini@gmail.com"};
        String [] pass = {"123","1588"};

        System.out.print("Email :");
        String email = read.next();
        System.out.println("Pass : ");
        String Pass = read.next();

        for (int i = 0; i < user.length; i++)
        {
            if(email.equals(user[i]) || Pass.equals(pass[i]))
            {
                System.out.println("Welcome " + email );
                break;
            }
            else
            {
                System.out.println("Something " + email + "Or " + Pass);
            }

        }


        //---- 25 - July -2023

    }
}