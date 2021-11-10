package com.binancetraderbot;

import Controllers.RController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = RController.class)
@ComponentScan(basePackages="BotConfig")
public class BinanceTraderBotApplication {

    public static void main(String[] args) {
        SpringApplication.run(BinanceTraderBotApplication.class, args);
    }

}
