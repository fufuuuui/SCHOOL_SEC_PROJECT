/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pangilinan_aldrix_dane_sec_q2;
import java.util.*;
/**
 *
 * @author ihub9
 */
public class public class VIRTUALMOBILE_SERVICE_MENU {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("""
                            1   2  3                        
                            4   5  6      
                            7   8  9                            
                            *   0  #                                                          
                           """);
        System.out.println("DIAL: ");
        var num0 = user.next();
        if (num0.equals("*123#")){
        }else{
            System.out.println("Number not found");
            return;
        }        
        System.out.println("Enter your money: ");
        int balance = user.nextInt();
        int data = 0;
        do{

        System.out.println("BAL: " + balance);
        System.out.println("""
                           1) Load P746, get a FREEBIE
                           2) Anniv Offer: FREE 1GB
                           3) SAYA ALL (Sale)
                           4) BOOSTERS
                           5) GIGA
                           6) SURFSAYA:PANALO
                           7) MAGIC
                           8) ALL DATA
                           9) ALLNET:FB
                           10) WAIS HACKS
                           11) UTANG
                           """);
        data = user.nextInt();
        switch(data){
            case 1 -> {
                if (balance >= 746) {
                    System.out.println("enjoy");
                }else{
                    System.out.println("Make sure you have enough load to subscribe to UNLI 5G with NSD 749 EXTRA FREEBIE!");
                  
                }                
            }
            case 2 -> {
                System.out.println("May FREE 1GB FOR 1 Days 'pag nag PANALO");
                System.out.println("""
                                   10 ka today!
                                   1) Subcribe
                                   0) Back
                                   """);
                data =user.nextInt();
                switch (data){
                    case 1 -> {
                        if (balance >= 10){
                            String name = "aldrix dane";
                            System.out.println("enjoy");
                        }else{
                            System.out.println("Insuficient balance");
                        }                       
                    }
                 }
                }
            case 3 -> {             
                System.out.println("""
                                   UNLI Tiktok, FB and MLBB + Unli Calls and Texts
                                   1) 3GB , 3 Days, P50
                                   2) 6 GB, 7 days, P99
                                   3) 12 GB, FREE UNLI 5G, 7 Days, P149
                                   4) 20 GB, FREE UNLI 5G, 28 days, P449
                                   0) Back
                                   """);
                data = user.nextInt();
                switch (data){
                    case 1-> {
                        String aw = "aldrix dane";
                        if (balance  >= 50){System.out.println("enjoy 1");}
                        else{System.out.println("\"Insuficient balance\"");}
                    }
                    case 2-> {
                        if (balance  >= 99){System.out.println("enjoy 2");}
                        else{System.out.println("\"Insuficient balance\"");}
                    }
                    case 3-> {
                        if (balance  >= 149){System.out.println("enjoy 3");}
                        else{System.out.println("\"Insuficient balance\"");}
                    }
                    case 4-> {
                        String aw = "aldrix dane";
                        if (balance  >= 449){System.out.println("enjoy 4");}
                        else{System.out.println("\"Insuficient balance\"");}
                    }             
                }
                }         
            case 4 -> {
                        String aw = "aldrix dane";               
                do{
                System.out.println("""
                                   BOOSTERS
                                   1) MAX SAYA
                                   2) SAY TIME (PROMOS END SOON
                                   3) WATCHAPP
                                   0) Back
                                   """);
                data = user.nextInt();
                switch (data){                    
                    case 1 ->{
                        System.out.println("""
                                           Enjoy HIGHSPEED DATA for all sites!
                                           1) 2 GB, 1 Day, P30
                                           0) Back                                                                             
                                           """);
                        data = user.nextInt();
                        if (data == 1) {
                            System.out.println("enjoy 1");
                            int sum = balance -  30;
                        }else {
                            System.out.println("Insuficient Balance");
                        }
                        if (data == 0){
                            data = -1;
                        }
                    }
                    
                    case 2 ->{
                        String aws = "aldrix dane";
                        do {
                        System.out.println("""
                                           1) SAYA SOCIAL TIME
                                           0) Back
                                           """);
                        data = user.nextInt();
                        switch (data){
                        case 1 -> {
                            System.out.println("""
                                               Enjoy UNLI FB, IG & TikTok
                                               1) 30 Mins, P10
                                               2) 60 Mins, P20
                                               3) 120 Mins, P30
                                               0) Back
                                               """);
                            data = user.nextInt();
                            switch (data){
                                case 1 -> {System.out.println("enjoy 1");}                               
                                case 2 -> {System.out.println("enjoy 2");}                               
                                case 3 -> {System.out.println("enjoy 3");}     
                                case 0 -> {data = -1;}
                            }
                        }
                        }     
                        }while (data == -1);
                    }
                                            
                    case 3 ->{
                        do {
                        System.out.println("""
                                           Watch via watchapp.ph
                                           1) Vlogs and Lifestyle Video, 1 Hr, P5
                                           2) Top Vlogs + more, 2 Hrs, P5
                                           3) Top Vlogs + more, 3 Hrs, P10
                                           4) Premium Movie, 12 Hrs, P15
                                           0) Back
                                           """);
                        data = user.nextInt();
                        switch(data){
                            case 1 -> {
                                System.out.println("""
                                                   Get access to vlogs and lifestyle videos for 1 hour
                                                   via watchapp.ph with VLOGS 5!
                                                   1) Subcribe
                                                   0) Back
                                                   """);
                                data = user.nextInt();
                                switch (data){
                                    case 1 -> {
                                        System.out.println("enjoy 1");
                                    }
                                    case 0 -> {
                                    data = -1;
                                    }                                    
                                }
                            } 
                            case 2 -> {
                                System.out.println("""
                                                   Get access to Ivana Vlogs and other, sports, 
                                                   series and movies within 2 hours via watchapp.ph
                                                   with WATCHAPP 5! 
                                                   1) Subcribe
                                                   0) Back
                                                   """);
                                data = user.nextInt();
                                switch (data){
                                    case 1 -> {
                                        System.out.println("enjoy 1");
                                    }
                                    case 0 -> {
                                    data = -1;
                                    }                                
                                }
                            } 
                            case 3 -> {
                                System.out.println("""
                                                   Get access to Ivana Vlogs and other, sports, 
                                                   series and movies within 3 hours via watchapp.ph
                                                   with WATCHAPP 5!
                                                   1) Subcribe
                                                   0) Back""");
                                data = user.nextInt();
                                switch (data){
                                    case 1 -> {
                                        System.out.println("enjoy 1");
                                    }
                                    case 0 -> {
                                    data = -1;
                                    }                                   
                                }
                            }
                            case 4 -> {
                                System.out.println("""
                                                   Get access to Premium Ivana Vlogs and other, sports, 
                                                   series and movies within 12 hours via watchapp.ph
                                                   with WATCHAPP 5! 
                                                   1) Subcribe
                                                   0) Back
                                                   """);
                                data = user.nextInt();
                                switch (data){
                                    case 1 -> {
                                        System.out.println("enjoy 1");
                                    }
                                    case 0 -> {
                                    data = -1;
                                    }
                                }
                            } 
                        }
                        }while (data == -1);
                    }
                }
                }while (data == -1);
            }
            case 5 -> {
                System.out.println("""
                                   1) SAYA ALL 28D
                                   2) DOBLE GIGA+
                                   3) TRIPLE DATA+
                                   4) POWER
                                   5) VIDEO
                                   6) STORIES
                                   7) GAMES
                                   0) Back
                                   """);
                data = user.nextInt();
                switch (data){
                    case 1 -> {
                        System.out.println("""
                                           Get SAYA ALL $$( now w/ FREE UNLI 5G + 
                                           UNLI TikTok FB and MLBB + 20 GB + Unli Calls
                                           & Text, 28 days, P449!
                                           1) Subcribe
                                           0) Back
                                           """);
                        data = user.nextInt();
                        switch (data){
                            case 1 -> {
                                if (balance >= 449){
                                    System.out.println("enjoy 1");
                                }else {
                                    System.out.println("Insuficient Balance");
                                }
                            }
                        }
                    }
                    case 2 ->{
                        System.out.println("""
                                           Enjoy DOBLE GIGA ARAW-ARAW for:
                                           1) VIDEO
                                           2) STORIES
                                           0) Back
                                           """);
                        data = user.nextInt();
                        switch (data){
                            case 1 -> {
                                System.out.println("""
                                                   Enjoy 2GB VIDEO ARAW-ARAW + UNLI CALLS
                                                   & TEXTS PLUS:
                                                   1) 3 Gb, 3 Days , P75
                                                   2) 6 Gb, 7 Days , P149
                                                   3) NOW 14 Gb, 28 Days , P449
                                                   0) Back
                                                   """);
                                data = user.nextInt();
                                switch (data){
                                    case 1 -> {
                                        if (balance >= 75){
                                            System.out.println("enjoy 1");
                                        }else {
                                            System.out.println("Insuficient Balance");
                                        }
                                    }
                                    case 2 -> {
                                        if (balance >= 149){
                                            System.out.println("enjoy 2");
                                        }else {
                                            System.out.println("Insuficient Balance");
                                        }
                                    }
                                    case 3 -> {
                                        if (balance >= 449){
                                            System.out.println("enjoy 3");
                                        }else {
                                            System.out.println("Insuficient Balance");
                                        }
                                    }
                                }
                            }
                            case 2 -> {
                                System.out.println("""
                                                   Enjoy 2GB VIDEO ARAW-ARAW + UNLI CALLS
                                                   & TEXTS PLUS:
                                                   1) 3 Gb, 3 Days , P75
                                                   2) 6 Gb, 7 Days , P149
                                                   3) NOW 14 Gb, 28 Days , P449
                                                   0) Back
                                                                                                      """);
                                data = user.nextInt();
                                switch (data){
                                    case 1 -> {
                                        if (balance >= 75){
                                            System.out.println("enjoy 1");
                                        }else {
                                            System.out.println("Insuficient Balance");
                                        }
                                    }
                                    case 2 -> {
                                        if (balance >= 149){
                                            System.out.println("enjoy 2");
                                        }else {
                                            System.out.println("Insuficient Balance");
                                        }
                                    }
                                    case 3 -> {
                                        if (balance >= 449){
                                            System.out.println("enjoy 3");
                                        }else {
                                            System.out.println("Insuficient Balance");
                                        }
                                    }
                                }
                            }
                        }
                    }
                    case 3 -> {
                        System.out.println("""
                                           Enjoy TRIPLE DATA+ for:
                                           1) VIDEO
                                           2) STORIES
                                           0) Back
                                           """);
                        data = user.nextInt();
                        switch (data){
                            case 1 -> {
                                System.out.println("""
                                                   Enjoy 1GB VIDEO ARAW-ARAW + UNLI CALLS
                                                   & TEXTS PLUS:
                                                   1) 4 Gb, 3 Days , P75
                                                   2) 68Gb, 7 Days , P149
                                                   3) 12 Gb, 30 Days , P449
                                                   0) Back
                                                   """);
                                data = user.nextInt();
                                switch (data){
                                    case 1 -> {
                                        System.out.println("""
                                                           GET TOTAL 7GB: 4 GB + 1GB VIDEO ARAW-ARAW (3 GB)
                                                           + UNLI CALLS & TEXTS, 3 DAYS, P75:
                                                           1) Subscribe
                                                           2) Want 8 GB MORE + 7 Days? Just add P74!
                                                           0) Back
                                                           """);
                                        data = user.nextInt();
                                        switch(data){
                                            case 1 -> {
                                                if (balance >= 75){
                                                    System.out.println("enjoy 1");
                                                }else {
                                                    System.out.println("Insuficient Balance");
                                                }
                                            }
                                            case 2 -> {
                                                if (balance >= 75){
                                                    System.out.println("enjoy 1");
                                                }else {
                                                    System.out.println("Insuficient Balance");
                                                }
                                            }
                                        }
                                    }
                                    case 2 -> {
                                        if (balance >= 149){
                                            System.out.println("enjoy 2");
                                        }else {
                                            System.out.println("Insuficient Balance");
                                        }
                                    }
                                    case 3 -> {
                                        if (balance >= 449){
                                            System.out.println("enjoy 3");
                                        }else {
                                            System.out.println("Insuficient Balance");
                                        }
                                    }
                                }
                            }
                            case 2 -> {
                                System.out.println("""
                                                   Enjoy 2GB VIDEO ARAW-ARAW + UNLI CALLS
                                                   & TEXTS PLUS:
                                                   1) 3 Gb, 3 Days , P75
                                                   2) 6 Gb, 7 Days , P149
                                                   3) NOW 14 Gb, 28 Days , P449
                                                   0) Back
                                                                                                      """);
                                data = user.nextInt();
                                switch (data){
                                    case 1 -> {
                                        if (balance >= 75){
                                            System.out.println("enjoy 1");
                                        }else {
                                            System.out.println("Insuficient Balance");
                                        }
                                    }
                                    case 2 -> {
                                        if (balance >= 149){
                                            System.out.println("enjoy 2");
                                        }else {
                                            System.out.println("Insuficient Balance");
                                        }
                                    }
                                    case 3 -> {
                                        if (balance >= 449){
                                            System.out.println("enjoy 3");
                                        }else {
                                            System.out.println("Insuficient Balance");
                                        }
                                    }
                                }
                            }
                        }
                    }
                    case 4 -> {
                        System.out.println("""
                                           Enjoy POWER++ for:
                                           1) VIDEO
                                           2) STORIES
                                           0) Back
                                           """);
                        data = user.nextInt();
                        switch (data){
                            case 1 -> {
                                System.out.println("""
                                                   Enjoy 3GB VIDEO ARAW-ARAW + UNLI CALLS
                                                   & TEXTS PLUS:
                                                   1) 4 Gb, 3 Days , P75
                                                   2) 68Gb, 7 Days , P149
                                                   3) 12 Gb, 30 Days , P449
                                                   0) Back
                                                   """);
                                data = user.nextInt();
                                switch (data){
                                    case 1 -> {
                                        System.out.println("""
                                                           GET TOTAL 7GB: 4 GB + 1GB VIDEO ARAW-ARAW (3 GB)
                                                           + UNLI CALLS & TEXTS, 3 DAYS, P75:
                                                           1) Subscribe
                                                           2) Want 8 GB MORE + 7 Days? Just add P74!
                                                           0) Back
                                                           """);
                                        data = user.nextInt();
                                        switch(data){
                                            case 1 -> {
                                                if (balance >= 75){
                                                    System.out.println("enjoy 1");
                                                }else {
                                                    System.out.println("Insuficient Balance");
                                                }
                                            }
                                            case 2 -> {
                                                if (balance >= 145){
                                                    System.out.println("enjoy 1");
                                                }else {
                                                    System.out.println("Insuficient Balance");
                                                }
                                            }
                                        }
                                    }
                                    case 2 -> {
                                        if (balance >= 149){
                                            System.out.println("enjoy 2");
                                        }else {
                                            System.out.println("Insuficient Balance");
                                        }
                                    }
                                    case 3 -> {
                                        if (balance >= 449){
                                            System.out.println("enjoy 3");
                                        }else {
                                            System.out.println("Insuficient Balance");
                                        }
                                    }
                                }
                            }
                            case 2 -> {
                                System.out.println("""
                                                   Enjoy 2GB VIDEO ARAW-ARAW + UNLI CALLS
                                                   & TEXTS PLUS:
                                                   1) 3 Gb, 3 Days , P75
                                                   2) 6 Gb, 7 Days , P149
                                                   3) NOW 14 Gb, 28 Days , P449
                                                   0) Back
                                                                                                      """);
                                data = user.nextInt();
                                switch (data){
                                    case 1 -> {
                                        if (balance >= 75){
                                            System.out.println("enjoy 1");
                                        }else {
                                            System.out.println("Insuficient Balance");
                                        }
                                    }
                                    case 2 -> {
                                        if (balance >= 149){
                                            System.out.println("enjoy 2");
                                        }else {
                                            System.out.println("Insuficient Balance");
                                        }
                                    }
                                    case 3 -> {
                                        if (balance >= 449){
                                            System.out.println("enjoy 3");
                                        }else {
                                            System.out.println("Insuficient Balance");
                                        }
                                    }
                                }
                            }
                        }
                    }                   
                    case 5 -> {
                        System.out.println("""
                                           Enjoy VIDEO++ for:
                                           1) VIDEO
                                           2) STORIES
                                           0) Back
                                           """);
                        data = user.nextInt();
                        switch (data){
                            case 1 -> {
                                System.out.println("""
                                                   Enjoy 3GB VIDEO ARAW-ARAW + UNLI CALLS
                                                   & TEXTS PLUS:
                                                   1) 4 Gb, 3 Days , P75
                                                   2) 68Gb, 7 Days , P149
                                                   3) 12 Gb, 30 Days , P449
                                                   0) Back
                                                   """);
                                data = user.nextInt();
                                switch (data){
                                    case 1 -> {
                                        System.out.println("""
                                                           GET TOTAL 7GB: 4 GB + 1GB VIDEO ARAW-ARAW (3 GB)
                                                           + UNLI CALLS & TEXTS, 3 DAYS, P75:
                                                           1) Subscribe
                                                           2) Want 8 GB MORE + 7 Days? Just add P74!
                                                           0) Back
                                                           """);
                                        data = user.nextInt();
                                        switch(data){
                                            case 1 -> {
                                                if (balance >= 75){
                                                    System.out.println("enjoy 1");
                                                }else {
                                                    System.out.println("Insuficient Balance");
                                                }
                                            }
                                            case 2 -> {
                                                if (balance >= 145){
                                                    System.out.println("enjoy 1");
                                                }else {
                                                    System.out.println("Insuficient Balance");
                                                }
                                            }
                                        }
                                    }
                                    case 2 -> {
                                        System.out.println("""
                                                           GET TOTAL 68GB: 4 GB + 1GB VIDEO ARAW-ARAW (3 GB)
                                                           + UNLI CALLS & TEXTS, 3 DAYS, P75:
                                                           1) Subscribe
                                                           2) Want 8 GB MORE + 7 Days? Just add P149!
                                                           0) Back
                                                           """);
                                        data = user.nextInt();
                                        switch(data){
                                            case 1 -> {
                                                if (balance >= 149){
                                                    System.out.println("enjoy 1");
                                                }else {
                                                    System.out.println("Insuficient Balance");
                                                }
                                            }
                                            case 2 -> {
                                                if (balance >= 298){
                                                    System.out.println("enjoy 1");
                                                }else {
                                                    System.out.println("Insuficient Balance");
                                                }
                                            }
                                        }
                                    }
                                    case 3 -> {
                                        System.out.println("""
                                                           GET TOTAL 12GB: 4 GB + 1GB VIDEO ARAW-ARAW (3 GB)
                                                           + UNLI CALLS & TEXTS, 7 DAYS, P75:
                                                           1) Subscribe
                                                           2) Want 8 GB MORE + 7 Days? Just add P99!
                                                           0) Back
                                                           """);
                                        data = user.nextInt();
                                        switch(data){
                                            case 1 -> {
                                                if (balance >= 499){
                                                    System.out.println("enjoy 1");
                                                }else {
                                                    System.out.println("Insuficient Balance");
                                                }
                                            }
                                            case 2 -> {
                                                if (balance >= 598){
                                                    System.out.println("enjoy 1");
                                                }else {
                                                    System.out.println("Insuficient Balance");
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            case 2 -> {
                                System.out.println("""
                                                   Enjoy 2GB VIDEO ARAW-ARAW + UNLI CALLS
                                                   & TEXTS PLUS:
                                                   1) 3 Gb, 3 Days , P75
                                                   2) 6 Gb, 7 Days , P149
                                                   3) NOW 14 Gb, 28 Days , P449
                                                   0) Back
                                                                                                      """);
                                data = user.nextInt();
                                switch (data){
                                    case 1 -> {
                                        System.out.println("""
                                                           GET TOTAL 7GB: 3 GB + 1GB VIDEO ARAW-ARAW (3 GB)
                                                           + UNLI CALLS & TEXTS, 3 DAYS, P75:
                                                           1) Subscribe
                                                           2) Want 8 GB MORE + 7 Days? Just add P74!
                                                           0) Back
                                                           """);
                                        data = user.nextInt();
                                        switch(data){
                                            case 1 -> {
                                                if (balance >= 75){
                                                    System.out.println("enjoy 1");
                                                }else {
                                                    System.out.println("Insuficient Balance");
                                                }
                                            }
                                            case 2 -> {
                                                if (balance >= 145){
                                                    System.out.println("enjoy 1");
                                                }else {
                                                    System.out.println("Insuficient Balance");
                                                }
                                            }
                                        }
                                    }                                   
                                    case 2 -> {
                                        System.out.println("""
                                                           GET TOTAL 7GB: 4 GB + 1GB VIDEO ARAW-ARAW (3 GB)
                                                           + UNLI CALLS & TEXTS, 6 DAYS, P140:
                                                           1) Subscribe
                                                           2) Want 8 GB MORE + 7 Days? Just add P99!
                                                           0) Back
                                                           """);
                                        data = user.nextInt();
                                        switch(data){
                                            case 1 -> {
                                                if (balance >= 140){
                                                    System.out.println("enjoy 1");
                                                }else {
                                                    System.out.println("Insuficient Balance");
                                                }
                                            }
                                            case 2 -> {
                                                if (balance >= 239){
                                                    System.out.println("enjoy 1");
                                                }else {
                                                    System.out.println("Insuficient Balance");
                                                }
                                            }
                                        }
                                    }                                   
                                    case 3 -> {
                                        System.out.println("""
                                                           GET TOTAL 7GB: 4 GB + 1GB VIDEO ARAW-ARAW (3 GB)
                                                           + UNLI CALLS & TEXTS, 10 DAYS, P200:
                                                           1) Subscribe
                                                           2) Want 8 GB MORE + 7 Days? Just add P99!
                                                           0) Back
                                                           """);
                                        data = user.nextInt();
                                        switch(data){
                                            case 1 -> {
                                                if (balance >= 200){
                                                    System.out.println("enjoy 1");
                                                }else {
                                                    System.out.println("Insuficient Balance");
                                                }
                                            }
                                            case 2 -> {
                                                if (balance >= 299){
                                                    System.out.println("enjoy 1");
                                                }else {
                                                    System.out.println("Insuficient Balance");
                                                }
                                            }
                                        }
                                    }                                   
                                }
                            }
                        }
                    }                   
                    case 6 -> {
                        System.out.println("""
                                           Enjoy STORY++ for:
                                           1) VIDEO
                                           2) STORIES
                                           0) Back
                                           """);
                        data = user.nextInt();
                        switch (data){
                            case 1 -> {
                                System.out.println("""
                                                   Enjoy 3GB STORY ARAW-ARAW + UNLI CALLS
                                                   & TEXTS PLUS:
                                                   1) 4 Gb, 3 Days , P75
                                                   2) 68Gb, 7 Days , P149
                                                   3) 12 Gb, 30 Days , P449
                                                   0) Back
                                                   """);
                                data = user.nextInt();
                                switch (data){
                                    case 1 -> {
                                        System.out.println("""
                                                           GET TOTAL 7GB: 4 GB + 1GB STORY ARAW-ARAW (3 GB)
                                                           + UNLI CALLS & TEXTS, 3 DAYS, P75:
                                                           1) Subscribe
                                                           2) Want 8 GB MORE + 7 Days? Just add P74!
                                                           0) Back
                                                           """);
                                        data = user.nextInt();
                                        switch(data){
                                            case 1 -> {
                                                if (balance >= 75){
                                                    System.out.println("enjoy 1");
                                                }else {
                                                    System.out.println("Insuficient Balance");
                                                }
                                            }
                                            case 2 -> {
                                                if (balance >= 145){
                                                    System.out.println("enjoy 1");
                                                }else {
                                                    System.out.println("Insuficient Balance");
                                                }
                                            }
                                        }
                                    }
                                    case 2 -> {
                                        System.out.println("""
                                                           GET TOTAL 68GB: 4 GB + 1GB STORY ARAW-ARAW (3 GB)
                                                           + UNLI CALLS & TEXTS, 3 DAYS, P75:
                                                           1) Subscribe
                                                           2) Want 8 GB MORE + 7 Days? Just add P149!
                                                           0) Back
                                                           """);
                                        data = user.nextInt();
                                        switch(data){
                                            case 1 -> {
                                                if (balance >= 149){
                                                    System.out.println("enjoy 1");
                                                }else {
                                                    System.out.println("Insuficient Balance");
                                                }
                                            }
                                            case 2 -> {
                                                if (balance >= 298){
                                                    System.out.println("enjoy 1");
                                                }else {
                                                    System.out.println("Insuficient Balance");
                                                }
                                            }
                                        }
                                    }
                                    case 3 -> {
                                        System.out.println("""
                                                           GET TOTAL 12GB: 4 GB + 1GB STORY ARAW-ARAW (3 GB)
                                                           + UNLI CALLS & TEXTS, 7 DAYS, P75:
                                                           1) Subscribe
                                                           2) Want 8 GB MORE + 7 Days? Just add P99!
                                                           0) Back
                                                           """);
                                        data = user.nextInt();
                                        switch(data){
                                            case 1 -> {
                                                if (balance >= 499){
                                                    System.out.println("enjoy 1");
                                                }else {
                                                    System.out.println("Insuficient Balance");
                                                }
                                            }
                                            case 2 -> {
                                                if (balance >= 598){
                                                    System.out.println("enjoy 1");
                                                }else {
                                                    System.out.println("Insuficient Balance");
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            case 2 -> {
                                System.out.println("""
                                                   Enjoy 2GB STORY ARAW-ARAW + UNLI CALLS
                                                   & TEXTS PLUS:
                                                   1) 3 Gb, 3 Days , P75
                                                   2) 6 Gb, 7 Days , P149
                                                   3) NOW 14 Gb, 28 Days , P449
                                                   0) Back
                                                                                                      """);
                                data = user.nextInt();
                                switch (data){
                                    case 1 -> {
                                        if (balance >= 75){
                                            System.out.println("enjoy 1");
                                        }else {
                                            System.out.println("Insuficient Balance");
                                        }
                                    }
                                    case 2 -> {
                                        if (balance >= 149){
                                            System.out.println("enjoy 2");
                                        }else {
                                            System.out.println("Insuficient Balance");
                                        }
                                    }
                                    case 3 -> {
                                        if (balance >= 449){
                                            System.out.println("enjoy 3");
                                        }else {
                                            System.out.println("Insuficient Balance");
                                        }
                                    }
                                }
                            }
                        }
                    }                   
                    case 7 -> {
                        System.out.println("""
                                           Enjoy GAMES++ for:
                                           1) ONLINE                                        
                                           0) Back
                                           """);
                        data = user.nextInt();
                        switch (data){
                            case 1 -> {
                                System.out.println("""
                                                   Enjoy 3GB GAMES ARAW-ARAW + UNLI CALLS
                                                   & TEXTS PLUS:
                                                   1) 4 Gb, 3 Days , P75
                                                   2) 68Gb, 7 Days , P149
                                                   3) 12 Gb, 30 Days , P449
                                                   0) Back
                                                   """);
                                data = user.nextInt();
                                switch (data){
                                    case 1 -> {
                                        System.out.println("""
                                                           GET TOTAL 7GB: 4 GB + 1GB GAMES ARAW-ARAW (3 GB)
                                                           + UNLI CALLS & TEXTS, 3 DAYS, P75:
                                                           1) Subscribe
                                                           2) Want 8 GB MORE + 7 Days? Just add P74!
                                                           0) Back
                                                           """);
                                        data = user.nextInt();
                                        switch(data){
                                            case 1 -> {
                                                if (balance >= 75){
                                                    System.out.println("enjoy 1");
                                                }else {
                                                    System.out.println("Insuficient Balance");
                                                }
                                            }
                                            case 2 -> {
                                                if (balance >= 145){
                                                    System.out.println("enjoy 1");
                                                }else {
                                                    System.out.println("Insuficient Balance");
                                                }
                                            }
                                        }
                                    }
                                    case 2 -> {
                                        System.out.println("""
                                                           GET TOTAL 68GB: 4 GB + 1GB GAMES ARAW-ARAW (3 GB)
                                                           + UNLI CALLS & TEXTS, 3 DAYS, P75:
                                                           1) Subscribe
                                                           2) Want 8 GB MORE + 7 Days? Just add P149!
                                                           0) Back
                                                           """);
                                        data = user.nextInt();
                                        switch(data){
                                            case 1 -> {
                                                if (balance >= 149){
                                                    System.out.println("enjoy 1");
                                                }else {
                                                    System.out.println("Insuficient Balance");
                                                }
                                            }
                                            case 2 -> {
                                                if (balance >= 298){
                                                    System.out.println("enjoy 1");
                                                }else {
                                                    System.out.println("Insuficient Balance");
                                                }
                                            }
                                        }
                                    }
                                    case 3 -> {
                                        System.out.println("""
                                                           GET TOTAL 12GB: 4 GB + 1GB GAMES ARAW-ARAW (3 GB)
                                                           + UNLI CALLS & TEXTS, 7 DAYS, P75:
                                                           1) Subscribe
                                                           2) Want 8 GB MORE + 7 Days? Just add P99!
                                                           0) Back
                                                           """);
                                        data = user.nextInt();
                                        switch(data){
                                            case 1 -> {
                                                if (balance >= 499){
                                                    System.out.println("enjoy 1");
                                                }else {
                                                    System.out.println("Insuficient Balance");
                                                }
                                            }
                                            case 2 -> {
                                                if (balance >= 598){
                                                    System.out.println("enjoy 1");
                                                }else {
                                                    System.out.println("Insuficient Balance");
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }                   
                }
            }
            case 6 -> {
                do {
                System.out.println("""
                                   Data Apps + Unli Calls/Text
                                   1) TOTAL 600 MB, 2D, P20
                                   2) TOTAL 900 MB, 2D, P25 
                                   3) TOTAL 1.35 GB, 3D, P30 
                                   4) TOTAL 2.4 GB, 3D, P35 
                                   5) TOTAL 1.2 GB, 7D, P49
                                   6) BIGGERS PACKS
                                   0) Back
                                   """);
                data = user.nextInt();
                switch (data){
                    case 1 -> {
                        System.out.println("""
                                           Get TOTAL 600 MB: 150 MB ARAW-ARAW for 
                                           TIkTok, IG, FB, ML (300 MB) + 300 MB + Unli
                                           Calls & Texts 2 Days, P20!
                                           1) Subcribe
                                           2) Want TOTAL 1.35 GB & 3D? Add P10!
                                           0) Back
                                           """);
                        data = user.nextInt();
                        switch (data){
                            case 1 -> {
                                if (balance >= 20){
                                    System.out.println("enjoy 1");
                                }else{
                                    System.out.println("Insuficient Balance");
                                }
                            }
                            case 2 -> {
                                if (balance >= 30){
                                    System.out.println("enjoy 2");
                                }else{
                                    System.out.println("Insuficient Balance");
                                }
                            }
                        }
                    }
                    case 2 -> {
                        System.out.println("""
                                           Get TOTAL 900 MB: 150 MB ARAW-ARAW for 
                                           TIkTok, IG, FB, ML (300 MB) + 300 MB + Unli
                                           Calls & Texts 2 Days, P20!
                                           1) Subcribe
                                           2) Want TOTAL 1.35 GB & 3D? Add P10! 
                                           0) Back
                                           """);
                        data = user.nextInt();
                        switch (data){
                            case 1 -> {
                                if (balance >= 25){
                                    System.out.println("enjoy 1");
                                }else{
                                    System.out.println("Insuficient Balance");
                                }
                            }
                            case 2 -> {
                                if (balance >= 35){
                                    System.out.println("enjoy 2");
                                }else{
                                    System.out.println("Insuficient Balance");
                                }
                            }
                            case 0 -> {
                                data=-1;
                            }
                        }
                    }
                    case 3 -> {
                        System.out.println("""
                                           Get TOTAL 1.35 GB: 150 MB ARAW-ARAW for 
                                           TIkTok, IG, FB, ML (300 MB) + 300 MB + Unli
                                           Calls & Texts 3 Days, P30!
                                           1) Subcribe
                                           2) Want TOTAL 1.35 GB & 3D? Add P10!
                                           0) Back
                                           """);
                        data = user.nextInt();
                        switch (data){
                            case 1 -> {
                                if (balance >= 30){
                                    System.out.println("enjoy 1");
                                }else{
                                    System.out.println("Insuficient Balance");
                                }
                            }
                            case 2 -> {
                                if (balance >= 40){
                                    System.out.println("enjoy 2");
                                }else{
                                    System.out.println("Insuficient Balance");
                                }
                            }
                            case 0 -> {
                                data=-1;
                            }
                        }
                    }
                    case 4 -> {
                        System.out.println("""
                                           Get TOTAL 2.4 GB: 150 MB ARAW-ARAW for 
                                           TIkTok, IG, FB, ML (300 MB) + 300 MB + Unli
                                           Calls & Texts 3 Days, P35!
                                           1) Subcribe
                                           2) Want TOTAL 1.35 GB & 3D? Add P10!
                                           0) Back
                                           """);
                        data = user.nextInt();
                        switch (data){
                            case 1 -> {
                                if (balance >= 35){
                                    System.out.println("enjoy 1");
                                }else{
                                    System.out.println("Insuficient Balance");
                                }
                            }
                            case 2 -> {
                                if (balance >= 45){
                                    System.out.println("enjoy 2");
                                }else{
                                    System.out.println("Insuficient Balance");
                                }
                            }
                            case 0 -> {
                                data=-1;
                            }
                        }
                    }
                    case 5 -> {
                        System.out.println("""
                                           Get TOTAL 1.2 GB: 150 MB ARAW-ARAW for 
                                           TIkTok, IG, FB, ML (300 MB) + 300 MB + Unli
                                           Calls & Texts 7 Days, P49!
                                           1) Subcribe
                                           2) Want TOTAL 1.35 GB & 3D? Add P10!
                                           0) Back
                                           """);
                        data = user.nextInt();
                        switch (data){
                            case 1 -> {
                                if (balance >= 49){
                                    System.out.println("enjoy 1");
                                }else{
                                    System.out.println("Insuficient Balance");
                                }
                            }
                            case 2 -> {
                                if (balance >= 59){
                                    System.out.println("enjoy 2");
                                }else{
                                    System.out.println("Insuficient Balance");
                                }
                            }
                            case 0 -> {
                                data=-1;
                            }                            
                        }
                    }
                    case 6 -> {
                        System.out.println("""
                                           Enjoy MORE DATA + SURFSAYA ARAW-ARAW,
                                           Unli Calls & Texts:
                                           1) TOTAL 1.2 GB, 7 Days, P49
                                           2) TOTAL 2.2 GB, 7 Days, P99 
                                           3) TOTAL 8 GB, 30 Days, P199
                                           0) Back
                                           """);
                        data = user.nextInt();
                        switch (data){
                            case 1 -> {
                                System.out.println("""
                                                   Get Total 1.2 GB: 100 MB ARAW-ARAW for 
                                                   Tiktok, IG, FB, ML (700 MB) + 500 MB + Unli
                                                   Calls & Texts, 7 Days, P49
                                                   1) Subscribe
                                                   2) Want TOTAL 2.2 GB? Add P50
                                                   0) Back
                                                   """);
                                data = user.nextInt();
                                switch (data){
                                    case 1 ->{
                                                    if (balance >= 49){
                                                      System.out.println("enjoy 1");
                                                     }else{
                                                     System.out.println("Insuficient Balance");
                                                     } 
                                    }
                                    case 2 ->{
                                                    if (balance >= 99){
                                                      System.out.println("enjoy 1");
                                                     }else{
                                                     System.out.println("Insuficient Balance");
                                                     } 
                                    }
                            case 0 -> {
                                data=-1;
                            }                                    
                            }
                        }
                            case 2 -> {
                                System.out.println("""
                                                   Get Total 8 GB: 100 MB ARAW-ARAW for 
                                                   Tiktok, IG, FB, ML (700 MB) + 500 MB + Unli
                                                   Calls & Texts, 30 Days, P199
                                                   1) Subscribe
                                                   2) Want TOTAL 2.2 GB? Add P50
                                                   0) Back
                                                   """);
                                data = user.nextInt();
                                switch (data){
                                    case 1 ->{
                                                    if (balance >= 199){
                                                      System.out.println("enjoy 1");
                                                     }else{
                                                     System.out.println("Insuficient Balance");
                                                     } 
                                    }
                                    case 2 ->{
                                                    if (balance >= 244){
                                                      System.out.println("enjoy 1");
                                                     }else{
                                                     System.out.println("Insuficient Balance");
                                                     } 
                                    }
                            case 0 -> {
                                data=-1;
                            }                                    
                                }
                            }
                            case 3 -> {
                                System.out.println("""
                                                   Get Total 2.2 GB: 100 MB ARAW-ARAW for 
                                                   Tiktok, IG, FB, ML (700 MB) + 500 MB + Unli
                                                   Calls & Texts, 7 Days, P99
                                                   1) Subscribe
                                                   2) Want TOTAL 2.2 GB? Add P50
                                                   0) Back
                                                   """);
                                data = user.nextInt();
                                switch (data){
                                    case 1 ->{
                                                    if (balance >= 99){
                                                      System.out.println("enjoy 1");
                                                     }else{
                                                     System.out.println("Insuficient Balance");
                                                     } 
                                    }
                                    case 2 ->{
                                                    if (balance >= 104){
                                                      System.out.println("enjoy 1");
                                                     }else{
                                                     System.out.println("Insuficient Balance");
                                                     }                                                                                                     
                                    }
                                    case 0 -> {
                                        data = -1;
                                    }
                                }
                            }
                            case 0 -> {
                                data = -1;
                            }
                        }
                    }                    
                }
            } while (data == -1);
                }
            case 7 -> {
                do {
                System.out.println("""
                                   Data Apps + Unli Calls/Text
                                   1) TOTAL 600 MB, 2D, P20
                                   2) TOTAL 900 MB, 2D, P25 
                                   3) TOTAL 1.35 GB, 3D, P30 
                                   0) Back
                                   """);
                data = user.nextInt();
                switch (data){
                    case 1 -> {
                        System.out.println("""
                                           Get TOTAL 600 MB: 150 MB ARAW-ARAW for 
                                           TIkTok, IG, FB, ML (300 MB) + 300 MB + Unli
                                           Calls & Texts 2 Days, P20!
                                           1) Subcribe
                                           2) Want TOTAL 1.35 GB & 3D? Add P10!
                                           0) Back
                                           """);
                        data = user.nextInt();
                        switch (data){
                            case 1 -> {
                                if (balance >= 20){
                                    System.out.println("enjoy 1");
                                }else{
                                    System.out.println("Insuficient Balance");
                                }
                            }
                            case 2 -> {
                                if (balance >= 30){
                                    System.out.println("enjoy 2");
                                }else{
                                    System.out.println("Insuficient Balance");
                                }
                            }
                        }
                    }
                    case 2 -> {
                        System.out.println("""
                                           Get TOTAL 900 MB: 150 MB ARAW-ARAW for 
                                           TIkTok, IG, FB, ML (300 MB) + 300 MB + Unli
                                           Calls & Texts 2 Days, P20!
                                           1) Subcribe
                                           2) Want TOTAL 1.35 GB & 3D? Add P10! 
                                           0) Back
                                           """);
                        data = user.nextInt();
                        switch (data){
                            case 1 -> {
                                if (balance >= 25){
                                    System.out.println("enjoy 1");
                                }else{
                                    System.out.println("Insuficient Balance");
                                }
                            }
                            case 2 -> {
                                if (balance >= 35){
                                    System.out.println("enjoy 2");
                                }else{
                                    System.out.println("Insuficient Balance");
                                }
                            }
                            case 0 -> {
                                data=-1;
                            }
                        }
                    }
                    case 3 -> {
                        System.out.println("""
                                           Get TOTAL 1.35 GB: 150 MB ARAW-ARAW for 
                                           TIkTok, IG, FB, ML (300 MB) + 300 MB + Unli
                                           Calls & Texts 3 Days, P30!
                                           1) Subcribe
                                           2) Want TOTAL 1.35 GB & 3D? Add P10!
                                           0) Back
                                           """);
                        data = user.nextInt();
                        switch (data){
                            case 1 -> {
                                if (balance >= 30){
                                    System.out.println("enjoy 1");
                                }else{
                                    System.out.println("Insuficient Balance");
                                }
                            }
                            case 2 -> {
                                if (balance >= 40){
                                    System.out.println("enjoy 2");
                                }else{
                                    System.out.println("Insuficient Balance");
                                }
                            }
                            case 0 -> {
                                data=-1;
                            }
                        }
                    }
                    case 6 -> {
                        System.out.println("""
                                           Enjoy MORE DATA + SURFSAYA ARAW-ARAW,
                                           Unli Calls & Texts:
                                           1) TOTAL 1.2 GB, 7 Days, P49
                                           2) TOTAL 2.2 GB, 7 Days, P99 
                                           3) TOTAL 8 GB, 30 Days, P199
                                           0) Back
                                           """);
                        data = user.nextInt();
                        switch (data){
                            case 1 -> {
                                System.out.println("""
                                                   Get Total 1.2 GB: 100 MB ARAW-ARAW for 
                                                   Tiktok, IG, FB, ML (700 MB) + 500 MB + Unli
                                                   Calls & Texts, 7 Days, P49
                                                   1) Subscribe
                                                   2) Want TOTAL 2.2 GB? Add P50
                                                   0) Back
                                                   """);
                                data = user.nextInt();
                                switch (data){
                                    case 1 ->{
                                                    if (balance >= 49){
                                                      System.out.println("enjoy 1");
                                                     }else{
                                                     System.out.println("Insuficient Balance");
                                                     } 
                                    }
                                    case 2 ->{
                                                    if (balance >= 99){
                                                      System.out.println("enjoy 1");
                                                     }else{
                                                     System.out.println("Insuficient Balance");
                                                     } 
                                    }
                            case 0 -> {
                                data=-1;
                            }                                    
                            }
                        }
                            case 2 -> {
                                System.out.println("""
                                                   Get Total 8 GB: 100 MB ARAW-ARAW for 
                                                   Tiktok, IG, FB, ML (700 MB) + 500 MB + Unli
                                                   Calls & Texts, 30 Days, P199
                                                   1) Subscribe
                                                   2) Want TOTAL 2.2 GB? Add P50
                                                   0) Back
                                                   """);
                                data = user.nextInt();
                                switch (data){
                                    case 1 ->{
                                                    if (balance >= 199){
                                                      System.out.println("enjoy 1");
                                                     }else{
                                                     System.out.println("Insuficient Balance");
                                                     } 
                                    }
                                    case 2 ->{
                                                    if (balance >= 244){
                                                      System.out.println("enjoy 1");
                                                     }else{
                                                     System.out.println("Insuficient Balance");
                                                     } 
                                    }
                            case 0 -> {
                                data=-1;
                            }                                    
                                }
                            }
                            case 3 -> {
                                System.out.println("""
                                                   Get Total 2.2 GB: 100 MB ARAW-ARAW for 
                                                   Tiktok, IG, FB, ML (700 MB) + 500 MB + Unli
                                                   Calls & Texts, 7 Days, P99
                                                   1) Subscribe
                                                   2) Want TOTAL 2.2 GB? Add P50
                                                   0) Back
                                                   """);
                                data = user.nextInt();
                                switch (data){
                                    case 1 ->{
                                                    if (balance >= 99){
                                                      System.out.println("enjoy 1");
                                                     }else{
                                                     System.out.println("Insuficient Balance");
                                                     } 
                                    }
                                    case 2 ->{
                                                    if (balance >= 104){
                                                      System.out.println("enjoy 1");
                                                     }else{
                                                     System.out.println("Insuficient Balance");
                                                     }                                                                                                     
                                    }
                                    case 0 -> {
                                        data = -1;
                                    }
                                }
                            }
                            case 0 -> {
                                data = -1;
                            }
                        }
                    }                    
                }
            } while (data == -1);
                }
            case 8 -> {
                do {
                System.out.println("""
                                   ALL DATA FOR A WEEK!!!
                                   1) TOTAL 600 MB, 7D, P30
                                   2) TOTAL 900 MB, 7D, P35 
                                   3) TOTAL 1.35 GB, 7D, P45 
                                   0) Back
                                   """);
                data = user.nextInt();
                switch (data){
                    case 1 -> {
                        System.out.println("""
                                           Get TOTAL 600 MB: 150 MB ARAW-ARAW for 
                                           TIkTok, IG, FB, ML (300 MB) + 300 MB + Unli
                                           Calls & Texts 7 Days, P30!
                                           1) Subcribe
                                           2) Want TOTAL 1.35 GB & 3D? Add P10!
                                           0) Back
                                           """);
                        data = user.nextInt();
                        switch (data){
                            case 1 -> {
                                if (balance >= 30){
                                    System.out.println("enjoy 1");
                                }else{
                                    System.out.println("Insuficient Balance");
                                }
                            }
                            case 2 -> {
                                if (balance >= 40){
                                    System.out.println("enjoy 2");
                                }else{
                                    System.out.println("Insuficient Balance");
                                }
                            }
                        }
                    }
                    case 2 -> {
                        System.out.println("""
                                           Get TOTAL 900 MB: 150 MB ARAW-ARAW for 
                                           TIkTok, IG, FB, ML (300 MB) + 300 MB + Unli
                                           Calls & Texts 7 Days, P35!
                                           1) Subcribe
                                           2) Want TOTAL 1.35 GB & 3D? Add P10! 
                                           0) Back
                                           """);
                        data = user.nextInt();
                        switch (data){
                            case 1 -> {
                                if (balance >= 35){
                                    System.out.println("enjoy 1");
                                }else{
                                    System.out.println("Insuficient Balance");
                                }
                            }
                            case 2 -> {
                                if (balance >= 45){
                                    System.out.println("enjoy 2");
                                }else{
                                    System.out.println("Insuficient Balance");
                                }
                            }
                            case 0 -> {
                                data=-1;
                            }
                        }
                    }
                    case 3 -> {
                        System.out.println("""
                                           Get TOTAL 1.35 GB: 150 MB ARAW-ARAW for 
                                           TIkTok, IG, FB, ML (300 MB) + 300 MB + Unli
                                           Calls & Texts 7 Days, P45!
                                           1) Subcribe
                                           2) Want TOTAL 1.35 GB & 3D? Add P10!
                                           0) Back
                                           """);
                        data = user.nextInt();
                        switch (data){
                            case 1 -> {
                                if (balance >= 45){
                                    System.out.println("enjoy 1");
                                }else{
                                    System.out.println("Insuficient Balance");
                                }
                            }
                            case 2 -> {
                                if (balance >= 55){
                                    System.out.println("enjoy 2");
                                }else{
                                    System.out.println("Insuficient Balance");
                                }
                            }
                            case 0 -> {
                                data=-1;
                            }
                        }
                    }
                    case 6 -> {
                        System.out.println("""
                                           ALL DATA OR FOR A MONTH!!
                                           Unli Calls & Texts:
                                           1) TOTAL 1.2 GB, 7 Days, P49
                                           2) TOTAL 2.2 GB, 7 Days, P99 
                                           3) TOTAL 8 GB, 30 Days, P199
                                           0) Back
                                           """);
                        data = user.nextInt();
                        switch (data){
                            case 1 -> {
                                System.out.println("""
                                                   Get Total 1.2 GB: 100 MB ARAW-ARAW for 
                                                   Tiktok, IG, FB, ML (700 MB) + 500 MB + Unli
                                                   Calls & Texts, 7 Days, P49
                                                   1) Subscribe
                                                   2) Want TOTAL 2.2 GB? Add P50
                                                   0) Back
                                                   """);
                                data = user.nextInt();
                                switch (data){
                                    case 1 ->{
                                                    if (balance >= 49){
                                                      System.out.println("enjoy 1");
                                                     }else{
                                                     System.out.println("Insuficient Balance");
                                                     } 
                                    }
                                    case 2 ->{
                                                    if (balance >= 99){
                                                      System.out.println("enjoy 1");
                                                     }else{
                                                     System.out.println("Insuficient Balance");
                                                     } 
                                    }
                            case 0 -> {
                                data=-1;
                            }                                    
                            }
                        }
                            case 2 -> {
                                System.out.println("""
                                                   Get Total 8 GB: 100 MB ARAW-ARAW for 
                                                   Tiktok, IG, FB, ML (700 MB) + 500 MB + Unli
                                                   Calls & Texts, 30 Days, P199
                                                   1) Subscribe
                                                   2) Want TOTAL 2.2 GB? Add P50
                                                   0) Back
                                                   """);
                                data = user.nextInt();
                                switch (data){
                                    case 1 ->{
                                                    if (balance >= 199){
                                                      System.out.println("enjoy 1");
                                                     }else{
                                                     System.out.println("Insuficient Balance");
                                                     } 
                                    }
                                    case 2 ->{
                                                    if (balance >= 244){
                                                      System.out.println("enjoy 1");
                                                     }else{
                                                     System.out.println("Insuficient Balance");
                                                     } 
                                    }
                            case 0 -> {
                                data=-1;
                            }                                    
                                }
                            }
                            case 3 -> {
                                System.out.println("""
                                                   Get Total 2.2 GB: 100 MB ARAW-ARAW for 
                                                   Tiktok, IG, FB, ML (700 MB) + 500 MB + Unli
                                                   Calls & Texts, 7 Days, P99
                                                   1) Subscribe
                                                   2) Want TOTAL 2.2 GB? Add P50
                                                   0) Back
                                                   """);
                                data = user.nextInt();
                                switch (data){
                                    case 1 ->{
                                                    if (balance >= 99){
                                                      System.out.println("enjoy 1");
                                                     }else{
                                                     System.out.println("Insuficient Balance");
                                                     } 
                                    }
                                    case 2 ->{
                                                    if (balance >= 104){
                                                      System.out.println("enjoy 1");
                                                     }else{
                                                     System.out.println("Insuficient Balance");
                                                     }                                                                                                     
                                    }
                                    case 0 -> {
                                        data = -1;
                                    }
                                }
                            }
                            case 0 -> {
                                data = -1;
                            }
                        }
                    }                    
                }
            } while (data == -1);
                }
            case 9 -> {
                do {
                System.out.println("""
                                   ALL DATA:FB FOR A WEEK!!!
                                   1) TOTAL 600 MB, 7D, P30
                                   2) TOTAL 900 MB, 7D, P35 
                                   3) TOTAL 1.35 GB, 7D, P45 
                                   0) Back
                                   """);
                data = user.nextInt();
                switch (data){
                    case 1 -> {
                        System.out.println("""
                                           Get TOTAL 600 MB: 150 MB ARAW-ARAW for 
                                           FB (300 MB) + 300 MB + Unli
                                           Calls & Texts 7 Days, P30!
                                           1) Subcribe
                                           2) Want TOTAL 1.35 GB & 3D? Add P10!
                                           0) Back
                                           """);
                        data = user.nextInt();
                        switch (data){
                            case 1 -> {
                                if (balance >= 30){
                                    System.out.println("enjoy 1");
                                }else{
                                    System.out.println("Insuficient Balance");
                                }
                            }
                            case 2 -> {
                                if (balance >= 40){
                                    System.out.println("enjoy 2");
                                }else{
                                    System.out.println("Insuficient Balance");
                                }
                            }
                        }
                    }
                    case 2 -> {
                        System.out.println("""
                                           Get TOTAL 900 MB: 150 MB ARAW-ARAW for 
                                           FB (300 MB) + 300 MB + Unli
                                           Calls & Texts 7 Days, P35!
                                           1) Subcribe
                                           2) Want TOTAL 1.35 GB & 3D? Add P10! 
                                           0) Back
                                           """);
                        data = user.nextInt();
                        switch (data){
                            case 1 -> {
                                if (balance >= 35){
                                    System.out.println("enjoy 1");
                                }else{
                                    System.out.println("Insuficient Balance");
                                }
                            }
                            case 2 -> {
                                if (balance >= 45){
                                    System.out.println("enjoy 2");
                                }else{
                                    System.out.println("Insuficient Balance");
                                }
                            }
                            case 0 -> {
                                data=-1;
                            }
                        }
                    }
                    case 3 -> {
                        System.out.println("""
                                           Get TOTAL 1.35 GB: 150 MB ARAW-ARAW for 
                                           FB (300 MB) + 300 MB + Unli
                                           Calls & Texts 7 Days, P45!
                                           1) Subcribe
                                           2) Want TOTAL 1.35 GB & 3D? Add P10!
                                           0) Back
                                           """);
                        data = user.nextInt();
                        switch (data){
                            case 1 -> {
                                if (balance >= 45){
                                    System.out.println("enjoy 1");
                                }else{
                                    System.out.println("Insuficient Balance");
                                }
                            }
                            case 2 -> {
                                if (balance >= 55){
                                    System.out.println("enjoy 2");
                                }else{
                                    System.out.println("Insuficient Balance");
                                }
                            }
                            case 0 -> {
                                data=-1;
                            }
                        }
                    }
                    case 6 -> {
                        System.out.println("""
                                           ALL DATA:FB OR FOR A MONTH!!
                                           Unli Calls & Texts:
                                           1) TOTAL 1.2 GB, 7 Days, P49
                                           2) TOTAL 2.2 GB, 7 Days, P99 
                                           3) TOTAL 8 GB, 30 Days, P199
                                           3) TOTAL 8 GB, 30 Days, P299                                          
                                           0) Back
                                           """);
                        data = user.nextInt();
                        switch (data){
                            case 1 -> {
                                System.out.println("""
                                                   Get Total 1.2 GB: 100 MB ARAW-ARAW for 
                                                   Tiktok, IG, FB, ML (700 MB) + 500 MB + Unli
                                                   Calls & Texts, 7 Days, P49
                                                   1) Subscribe
                                                   2) Want TOTAL 2.2 GB? Add P50
                                                   0) Back
                                                   """);
                                data = user.nextInt();
                                switch (data){
                                    case 1 ->{
                                                    if (balance >= 49){
                                                      System.out.println("enjoy 1");
                                                     }else{
                                                     System.out.println("Insuficient Balance");
                                                     } 
                                    }
                                    case 2 ->{
                                                    if (balance >= 99){
                                                      System.out.println("enjoy 1");
                                                     }else{
                                                     System.out.println("Insuficient Balance");
                                                     } 
                                    }
                            case 0 -> {
                                data=-1;
                            }                                    
                            }
                        }
                            case 2 -> {
                                System.out.println("""
                                                   Get Total 8 GB: 100 MB ARAW-ARAW for 
                                                   FB (700 MB) + 500 MB + Unli
                                                   Calls & Texts, 30 Days, P199
                                                   1) Subscribe
                                                   2) Want TOTAL 2.2 GB? Add P50
                                                   0) Back
                                                   """);
                                data = user.nextInt();
                                switch (data){
                                    case 1 ->{
                                                    if (balance >= 199){
                                                      System.out.println("enjoy 1");
                                                     }else{
                                                     System.out.println("Insuficient Balance");
                                                     } 
                                    }
                                    case 2 ->{
                                                    if (balance >= 244){
                                                      System.out.println("enjoy 1");
                                                     }else{
                                                     System.out.println("Insuficient Balance");
                                                     } 
                                    }
                            case 0 -> {
                                data=-1;
                            }                                    
                                }
                            }
                            case 3 -> {
                                System.out.println("""
                                                   Get Total 2.2 GB: 100 MB ARAW-ARAW for 
                                                   FB (700 MB) + 500 MB + Unli
                                                   Calls & Texts, 7 Days, P99
                                                   1) Subscribe
                                                   2) Want TOTAL 2.2 GB? Add P50
                                                   0) Back
                                                   """);
                                data = user.nextInt();
                                switch (data){
                                    case 1 ->{
                                                    if (balance >= 99){
                                                      System.out.println("enjoy 1");
                                                     }else{
                                                     System.out.println("Insuficient Balance");
                                                     } 
                                    }
                                    case 2 ->{
                                                    if (balance >= 104){
                                                      System.out.println("enjoy 1");
                                                     }else{
                                                     System.out.println("Insuficient Balance");
                                                     }                                                                                                     
                                    }
                                    case 0 -> {
                                        data = -1;
                                    }
                                }
                            }
                    case 4 -> {
                        System.out.println("""
                                           Get TOTAL 600 MB: 150 MB ARAW-ARAW for 
                                           FB (1 GB) + 300 MB + Unli
                                           Calls & Texts 7 Days, P299!
                                           1) Subcribe
                                           2) Want TOTAL 1.35 GB & 3D? Add P20!
                                           0) Back
                                           """);
                        data = user.nextInt();
                        switch (data){
                            case 1 -> {
                                if (balance >= 120){
                                    System.out.println("enjoy 1");
                                }else{
                                    System.out.println("Insuficient Balance");
                                }
                            }
                            case 2 -> {
                                if (balance >= 319){
                                    System.out.println("enjoy 2");
                                }else{
                                    System.out.println("Insuficient Balance");
                                }
                            }
                        }
                    }                            
                            case 0 -> {
                                data = -1;
                            }
                        }
                    }                    
                }
            } while (data == -1);
                }
            case 10 -> {
                do {
                System.out.println("""
                                   WAIS sa mga LOAD: 1GB sa ARAW-ARAW
                                   1) TOTAL 600 MB, 3D, P30
                                   2) TOTAL 1.2 GB, 7D, P90 
                                   3) TOTAL 2.35 GB, 14D, P140 
                                   0) Back
                                   """);
                data = user.nextInt();
                switch (data){
                    case 1 -> {
                        System.out.println("""
                                           Get TOTAL 600 MB: 150 MB ARAW-ARAW for 
                                           ALL WAIS TALAGA (300 MB) + 300 MB + Unli
                                           Calls & Texts 7 Days, P30!
                                           1) Subcribe
                                           2) Want TOTAL 1.35 GB & 3D? Add P10!
                                           0) Back
                                           """);
                        data = user.nextInt();
                        switch (data){
                            case 1 -> {
                                if (balance >= 30){
                                    System.out.println("enjoy 1");
                                }else{
                                    System.out.println("Insuficient Balance");
                                }
                            }
                            case 2 -> {
                                if (balance >= 40){
                                    System.out.println("enjoy 2");
                                }else{
                                    System.out.println("Insuficient Balance");
                                }
                            }
                        }
                    }
                    case 2 -> {
                        System.out.println("""
                                           Get TOTAL 900 MB: 150 MB ARAW-ARAW for 
                                           ALL WAIS TALAGA (300 MB) + 300 MB + Unli
                                           Calls & Texts 7 Days, P35!
                                           1) Subcribe
                                           2) Want TOTAL 1.35 GB & 3D? Add P10! 
                                           0) Back
                                           """);
                        data = user.nextInt();
                        switch (data){
                            case 1 -> {
                                if (balance >= 35){
                                    System.out.println("enjoy 1");
                                }else{
                                    System.out.println("Insuficient Balance");
                                }
                            }
                            case 2 -> {
                                if (balance >= 45){
                                    System.out.println("enjoy 2");
                                }else{
                                    System.out.println("Insuficient Balance");
                                }
                            }
                            case 0 -> {
                                data=-1;
                            }
                        }
                    }
                    case 3 -> {
                        System.out.println("""
                                           Get TOTAL 1.35 GB: 150 MB ARAW-ARAW for 
                                           ALL WAIS TALAGA (300 MB) + 300 MB + Unli
                                           Calls & Texts 7 Days, P45!
                                           1) Subcribe
                                           2) Want TOTAL 1.35 GB & 3D? Add P10!
                                           0) Back
                                           """);
                        data = user.nextInt();
                        switch (data){
                            case 1 -> {
                                if (balance >= 45){
                                    System.out.println("enjoy 1");
                                }else{
                                    System.out.println("Insuficient Balance");
                                }
                            }
                            case 2 -> {
                                if (balance >= 55){
                                    System.out.println("enjoy 2");
                                }else{
                                    System.out.println("Insuficient Balance");
                                }
                            }
                            case 0 -> {
                                data=-1;
                            }
                        }
                    }
                    case 4 -> {
                        System.out.println("""
                                           ALL DATA:FB OR FOR A MONTH!!
                                           Unli Calls & Texts:
                                           1) TOTAL 1.2 GB, 7 Days, P49
                                           2) TOTAL 2.2 GB, 7 Days, P99 
                                           3) TOTAL 8 GB, 30 Days, P199
                                           0) Back
                                           """);
                        data = user.nextInt();
                        switch (data){
                            case 1 -> {
                                System.out.println("""
                                                   Get Total 1.2 GB: 100 MB ARAW-ARAW for 
                                                   ALL WAIS TALAGA (700 MB) + 500 MB + Unli
                                                   Calls & Texts, 7 Days, P49
                                                   1) Subscribe
                                                   2) Want TOTAL 2.2 GB? Add P50
                                                   0) Back
                                                   """);
                                data = user.nextInt();
                                switch (data){
                                    case 1 ->{
                                                    if (balance >= 49){
                                                      System.out.println("enjoy 1");
                                                     }else{
                                                     System.out.println("Insuficient Balance");
                                                     } 
                                    }
                                    case 2 ->{
                                                    if (balance >= 99){
                                                      System.out.println("enjoy 1");
                                                     }else{
                                                     System.out.println("Insuficient Balance");
                                                     } 
                                    }
                            case 0 -> {
                                data=-1;
                            }                                    
                            }
                        }
                            case 2 -> {
                                System.out.println("""
                                                   Get Total 8 GB: 100 MB ARAW-ARAW for 
                                                   Tiktok, IG, FB, ML (700 MB) + 500 MB + Unli
                                                   Calls & Texts, 30 Days, P199
                                                   1) Subscribe
                                                   2) Want TOTAL 2.2 GB? Add P50
                                                   0) Back
                                                   """);
                                data = user.nextInt();
                                switch (data){
                                    case 1 ->{
                                                    if (balance >= 199){
                                                      System.out.println("enjoy 1");
                                                     }else{
                                                     System.out.println("Insuficient Balance");
                                                     } 
                                    }
                                    case 2 ->{
                                                    if (balance >= 244){
                                                      System.out.println("enjoy 1");
                                                     }else{
                                                     System.out.println("Insuficient Balance");
                                                     } 
                                    }
                            case 0 -> {
                                data=-1;
                            }                                    
                                }
                            }
                            case 3 -> {
                                System.out.println("""
                                                   Get Total 2.2 GB: 100 MB ARAW-ARAW for 
                                                   ALL WAIS TALAGA (700 MB) + 500 MB + Unli
                                                   Calls & Texts, 7 Days, P99
                                                   1) Subscribe
                                                   2) Want TOTAL 2.2 GB? Add P50
                                                   0) Back
                                                   """);
                                data = user.nextInt();
                                switch (data){
                                    case 1 ->{
                                                    if (balance >= 99){
                                                      System.out.println("enjoy 1");
                                                     }else{
                                                     System.out.println("Insuficient Balance");
                                                     } 
                                    }
                                    case 2 ->{
                                                    if (balance >= 104){
                                                      System.out.println("enjoy 1");
                                                     }else{
                                                     System.out.println("Insuficient Balance");
                                                     }                                                                                                     
                                    }
                                    case 0 -> {
                                        data = -1;
                                    }
                                }
                            }
                            case 0 -> {
                                data = -1;
                            }
                        }
                    }                    
                }
            } while (data == -1);
                }
            case 11 -> {
                do {
                System.out.println("""
                                   Pag Gipit ka Utang ka TNT!
                                   with P50 UTANG (300 MB)
                                   1) Subcribe
                                   2) More
                                   0) Back
                                   """);
                data = user.nextInt();
                switch (data){
                    case 1 -> {
                        if (balance >= 0){
                            System.out.println("Enjoy your free load!");
                        }
                    }
                    case 2 -> {
                        System.out.println("""
                                           Umutang ka ng P200 More Para sa TNT Dito lang ang Masaya.
                                           1) Subcribe
                                           2) Want TOTAL 1.35 GB & 3D? Add P10! 
                                           0) Back
                                           """);
                        data = user.nextInt();
                        switch (data){
                            case 1 -> {
                                if (balance >= 0){
                                    System.out.println("enjoy 1");
                                }
                            }
                            case 2 -> {
                                if (balance >= 0){
                                    System.out.println("enjoy 2");
                                }
                            }
                            case 0 -> {
                                data=-1;
                            }
                        }
                    }           
                }
            } while (data == -1);
                }            
            }
         }while(data == 0);
        String var = "aldrix code";
        System.out.println(var);
        }
    }
