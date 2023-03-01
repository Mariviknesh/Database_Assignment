package org.example;

import java.sql.*;
import java.util.logging.*;
import java.util.Scanner;

class Databases {
public static void main(String []args)
        {
        Logger log=Logger.getLogger("com.api.jar");
        Connection conn = null;
        int ch;
        Scanner s=new Scanner(System.in);
        Dbase db= Dbase.create();
        Dbase db1= Dbase.create();
        while(true)
        {
        log.info("1.Connect\n");
        log.info("2.Close\n");
        log.info("3.Exit\n");
        log.info("Enter your choice:");
        ch=s.nextInt();
        if(ch==1)
        {
        conn=db.connect();
        }
        else if(ch==3)
        {
        break;
        }
        else if(ch==2)
        {
        db1.close(conn);
        }

        }
        s.close();
        }
        }