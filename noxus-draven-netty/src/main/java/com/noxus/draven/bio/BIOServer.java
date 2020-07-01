package com.noxus.draven.bio;

import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 〈功能概述〉<br>
 *
 * @className: BIOServer
 * @package: com.noxus.draven.bio
 * @author: draven
 * @date: 2020/6/23 21:51
 */
@Slf4j
public class BIOServer {


    private static int DEFAULT_PORT = 7777;

    private static ServerSocket serverSocket;

    public static void start() {
        start(DEFAULT_PORT);
    }


    public synchronized static void start(int port) {
        if (serverSocket != null) {
            return;
        }
        try {
            serverSocket = new ServerSocket(port);
            log.info("已经启动 {}", port);
            while (true) {
                Socket socket = serverSocket.accept();
                new Thread(() -> {
                    BufferedReader in = null;
                    PrintWriter out = null;

                    try {
                        in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                        out = new PrintWriter(socket.getOutputStream());
                        String expression;
                        String result;
                        while (true) {
                            if ((expression = in.readLine()) == null) {
                                break;
                            }
                            log.info(expression);
                            out.println(expression);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    } finally {
                        try {
                            in.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        out.close();


                        try {
                            socket.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }


                }).start();
            }

        } catch (Exception e) {
            e.getMessage();
        } finally {

        }
        return;
    }


}
