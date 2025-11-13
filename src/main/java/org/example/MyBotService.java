package org.example;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;

public class MyBotService  {

    public SendMessage Start(long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("""
                Assalomu alaykum!
                ⚙️3d Printerda narsalar chiqarishni Boshlang⚙️
                """);

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> keyboardRows = new ArrayList<>();

        List<InlineKeyboardButton> keyboardRow = new ArrayList<>();
        InlineKeyboardButton button1 = new InlineKeyboardButton();
        button1.setText("Internetdan Model Topish \uD83D\uDCBB");
        button1.setCallbackData("InternetdanModelTopishId");
        keyboardRow.add(button1);
        keyboardRows.add(keyboardRow);

        List<InlineKeyboardButton> keyboardRow2 = new ArrayList<>();
        InlineKeyboardButton button2 = new InlineKeyboardButton();
        button2.setText("narxlar \uD83D\uDCB0");
        button2.setCallbackData("narxlarId");
        keyboardRow2.add(button2);
        InlineKeyboardButton button3 = new InlineKeyboardButton();
        button3.setText("chiqarish shartlari \uD83D\uDD79");
        button3.setCallbackData("chiqarishShartlariId");
        keyboardRow2.add(button3);
        keyboardRows.add(keyboardRow2);

        List<InlineKeyboardButton> keyboardRow3 = new ArrayList<>();
        InlineKeyboardButton button4 = new InlineKeyboardButton();
        button4.setText("Chiqarilgan Proektlar \uD83D\uDEE0");
        button4.setCallbackData("ChiqarilganProektlarId");
        keyboardRow3.add(button4);
        keyboardRows.add(keyboardRow3);

        inlineKeyboardMarkup.setKeyboard(keyboardRows);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }

}