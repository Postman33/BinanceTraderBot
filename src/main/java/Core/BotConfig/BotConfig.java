package Core.BotConfig;

import Core.TelegramBot.MainBot;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.telegram.telegrambots.bots.DefaultBotOptions;


@Configuration
@Getter
@Setter
@ConfigurationProperties(prefix = "settings")
public class BotConfig {
    private String webHookPath;
    private String botUserName;
    private String botToken;

    private DefaultBotOptions.ProxyType proxyType;
    private String proxyHost;
    private int proxyPort;

    @Bean
    public MainBot MainBot() {
        MainBot bot = new MainBot();
        bot.setBotUsername(botUserName);
        bot.setBotToken(botToken);
        bot.setWebhookPath(webHookPath);
        return bot;
    }
}
