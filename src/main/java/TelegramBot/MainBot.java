package TelegramBot;

import lombok.SneakyThrows;
import org.telegram.telegrambots.bots.TelegramWebhookBot;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

public class MainBot extends TelegramWebhookBot {
    private String botToken;
    private String botUsername;
    private String webhookPath;
    @Override
    public String getBotUsername() {
        return botUsername;
    }

    @Override
    public String getBotToken() {
        return botToken;
    }

    @SneakyThrows
    @Override
    public BotApiMethod<?> onWebhookUpdateReceived(Update update) {
        if (update.getMessage() != null && update.hasMessage()){
            execute( new SendMessage(update.getMessage().getChatId().toString(),"test"));
        }
        return null;
    }
// https://api.telegram.org/bot2108033644:AAF4CQxXG0vkf6_icGjxvzMWkT2xyGZ-wK8/setwebhook?url=https://7324-46-39-45-102.ngrok.io
    @Override
    public String getBotPath() {
        return webhookPath;
    }

    public void setBotToken(String botToken) {
        this.botToken = botToken;
    }

    public void setBotUsername(String botUsername) {
        this.botUsername = botUsername;
    }

    public String getWebhookPath() {
        return webhookPath;
    }

    public void setWebhookPath(String webhookPath) {
        this.webhookPath = webhookPath;
    }
}
