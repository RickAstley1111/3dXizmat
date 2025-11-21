package org.example;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.ArrayList;
import java.util.List;

public class MyBotService  {

    public SendMessage Start(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("""
                Assalomu alaykum!
                Chiqarmoqchi bolgan modelingizni faylini jonating👾;
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
        button4.setText("Zakazga model yasash\uD83D\uDEE0");
        button4.setCallbackData("ZakazgaModelId");
        keyboardRow3.add(button4);
        keyboardRows.add(keyboardRow3);

        List<InlineKeyboardButton> keyboardRow4 = new ArrayList<>();
        InlineKeyboardButton button5 = new InlineKeyboardButton();
        button5.setText("Aloqaga chiqish");
        button5.setCallbackData("AloqaId");
        keyboardRow4.add(button5);
        InlineKeyboardButton button6 = new InlineKeyboardButton();
        button6.setText("Chiqarilgan Proektalar");
        button6.setCallbackData("ChiqarilganProektalarId");
        keyboardRow4.add(button6);
        keyboardRows.add(keyboardRow4);

        inlineKeyboardMarkup.setKeyboard(keyboardRows);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }

    public InlineKeyboardMarkup StarterInline(Long chatId){
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
        button4.setText("Zakazga model yasash\uD83D\uDEE0");
        button4.setCallbackData("ZakazgaModelId");
        keyboardRow3.add(button4);
        keyboardRows.add(keyboardRow3);

        List<InlineKeyboardButton> keyboardRow4 = new ArrayList<>();
        InlineKeyboardButton button5 = new InlineKeyboardButton();
        button5.setText("Aloqaga chiqish");
        button5.setCallbackData("AloqaId");
        keyboardRow4.add(button5);
        InlineKeyboardButton button6 = new InlineKeyboardButton();
        button6.setText("Chiqarilgan Proektalar");
        button6.setCallbackData("ChiqarilganProektalarId");
        keyboardRow4.add(button6);
        keyboardRows.add(keyboardRow4);

        inlineKeyboardMarkup.setKeyboard(keyboardRows);

        return inlineKeyboardMarkup;
    }

    public InlineKeyboardMarkup OrtgaQaeytargich(Long chatId){
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> keyboardRows = new ArrayList<>();
        List<InlineKeyboardButton> keyboardRow = new ArrayList<>();
        InlineKeyboardButton button1 = new InlineKeyboardButton();
        button1.setText("⬅\uFE0FOrtga");
        button1.setCallbackData("OrtgaId");
        keyboardRow.add(button1);
        keyboardRows.add(keyboardRow);


        inlineKeyboardMarkup.setKeyboard(keyboardRows);

        return inlineKeyboardMarkup;
    }

    public InlineKeyboardMarkup ShartlarInline(Long chatId){
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> keyboardRows = new ArrayList<>();
        List<InlineKeyboardButton> keyboardRow = new ArrayList<>();
        InlineKeyboardButton button1 = new InlineKeyboardButton();
        button1.setText("⬅\uFE0FOrtga");
        button1.setCallbackData("OrtgaId");
        keyboardRow.add(button1);
        keyboardRows.add(keyboardRow);
        inlineKeyboardMarkup.setKeyboard(keyboardRows);

        return inlineKeyboardMarkup;
    }

    public  InlineKeyboardMarkup PhotoInline(){

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> keyboardRows = new ArrayList<>();
        List<InlineKeyboardButton> keyboardRow = new ArrayList<>();
        InlineKeyboardButton button1 = new InlineKeyboardButton();
        button1.setText("Keyingi➡\uFE0F");
        button1.setCallbackData("KeyingiId");
        InlineKeyboardButton button2 = new InlineKeyboardButton();
        button2.setText("⬅\uFE0FOldingi");
        button2.setCallbackData("OldingiId");
        List<InlineKeyboardButton> keyboardRow1 = new ArrayList<>();
        InlineKeyboardButton button3 = new InlineKeyboardButton();
        button3.setText("⬅\uFE0FOldingi sahifaga qaytish");
        button3.setCallbackData("OldingiSahifaId");
        keyboardRow1.add(button3);
        keyboardRows.add(keyboardRow1);

        keyboardRow.add(button2);
        keyboardRow.add(button1);


        keyboardRows.add(keyboardRow);
        inlineKeyboardMarkup.setKeyboard(keyboardRows);

        return inlineKeyboardMarkup;
    }






}