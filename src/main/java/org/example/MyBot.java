package org.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class MyBot extends TelegramLongPollingBot {

    MyBotService myBotService = new MyBotService();

    @Override
    public void onUpdateReceived(Update update) {


        if(update.getMessage().hasText() && update.hasMessage()) {

            Long chatId = update.getMessage().getChatId();
            String text = update.getMessage().getText();

            if(text.equals("/start")){
                try {
                    execute(myBotService.Start(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

        }
        else if (update.hasCallbackQuery()) {
            CallbackQuery callbackQuery = update.getCallbackQuery();
            String data = callbackQuery.getData();
            long ChatId = callbackQuery.getMessage().getChatId();
            Integer messageId = callbackQuery.getMessage().getMessageId();
            System.out.println(data);

            if(data.equals("/stop")){

            }


        }


    }




    @Override
    public String getBotUsername() {
        return "Uz3dPrinterXizmatlariBot";
    }

    @Override
    public String getBotToken() {
        return "8446024501:AAEMPqjf0ZF1FaZ5CwvEynoxLeenjecYxuk";
    }
}
