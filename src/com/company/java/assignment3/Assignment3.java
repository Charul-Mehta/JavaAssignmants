package com.company.java.assignment3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.channels.SocketChannel;
import java.util.Date;

public class Assignment3 {
    Process p;

    public void ping(String host)
    {
            try
            {
                InetAddress inetAddress = InetAddress.getByName(host);
                InetSocketAddress socketAddress = new InetSocketAddress(inetAddress, 80);

                SocketChannel sc = SocketChannel.open();
                sc.configureBlocking(true);

                //Time just before pinging host
                Date start = new Date();
                long timeToRespond;
                if (sc.connect(socketAddress)) {
                    //Time after pinging host
                    Date stop = new Date();
                    //Median Time calculation
                    timeToRespond = (stop.getTime() - start.getTime())/2;
                    System.out.println("Response time: " + timeToRespond + " ms");
                }
            } catch (IOException e)
            {
                e.printStackTrace();

            }

    }
}
